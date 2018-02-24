ClassNotFoundException vs. NoClassDefFoundError
--
ClassNotFoundException and NoClassDefFoundError occur when a particular class is not found at runtime. However, they occur at different scenarios.

ClassNotFoundException is an exception that occurs when you try to load a class at run time using Class.forName() or loadClass() methods and mentioned classes are not found in the classpath.

NoClassDefFoundError is an error that occurs when a particular class is present at compile time, but was missing at run time.

ClassNotFoundException
ClassNotFoundException is a runtime exception that is thrown when an application tries to load a class at runtime using the Class.forName() or loadClass() or findSystemClass() methods ,and the class with specified name are not found in the classpath. For example, you may have come across this exception when you try to connect to MySQL or Oracle databases and you have not updated the classpath with required JAR files. Most of the time, this exception occurs when you try to run an application without updating the classpath with required JAR files.

For example, the below program will throw ClassNotFoundException if the mentioned class “oracle.jdbc.driver.OracleDriver” is not found in the classpath.

{code}

public class MainClass
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
