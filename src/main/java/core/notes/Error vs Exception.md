Error vs Exception
--
Both java.lang.Error and java.lang.Exception classes are sub classes of java.lang.Throwable class, but there exist some significant differences between them. java.lang.Error class represents the errors which are mainly caused by the environment in which application is running. For example, OutOfMemoryError occurs when JVM runs out of memory or StackOverflowError occurs when stack overflows.

Where as java.lang.Exception class represents the exceptions which are mainly caused by the application itself. For example, NullPointerException occurs when an application tries to access null object or ClassCastException occurs when an application tries to cast incompatible class types. In this article, we will discuss the differences between Error and Exception in java.

Below is the list of differences between Error and Exception in java.

Error Vs Exception In Java :
1) Recovering from Error is not possible. The only solution to errors is to terminate the execution. Where as you can recover from Exception by using either try-catch blocks or throwing exception back to caller.

2) You will not be able to handle the Errors using try-catch blocks. Even if you handle them using try-catch blocks, your application will not recover if they happen. On the other hand, Exceptions can be handled using try-catch blocks and can make program flow normal if they happen.

3) Exceptions in java are divided into two categories – checked and unchecked. Where as all Errors belongs to only one category i.e unchecked.

Click here for more info on Checked and Unchecked Exceptions.

4) Compiler will not have any knowledge about unchecked exceptions which include Errors and sub classes of RunTimeException because they happen at run time. Where as compiler will have knowledge about checked Exceptions. Compiler will force you to keep try-catch blocks if it sees any statements which may throw checked exceptions.

5) Exceptions are related to application where as Errors are related to environment in which application is running.

Below is the quick recap of above points.

Errors	                                                      Exceptions
Errors in java are of type java.lang.Error.	                  Exceptions in java are of type java.lang.Exception.
All errors in java are unchecked type.	                      Exceptions include both checked as well as unchecked type.
Errors happen at run time. They will not be known to compiler.	Checked exceptions are known to compiler where as unchecked exceptions are not known to compiler because they occur at run time.
It is impossible to recover from errors.	                    You can recover from exceptions by handling them through try-catch blocks.
Errors are mostly caused by the environment in which application is running.	Exceptions are mainly caused by the application itself.
Examples :
java.lang.StackOverflowError, java.lang.OutOfMemoryError	Examples :
Checked Exceptions : SQLException, IOException
Unchecked Exceptions : ArrayIndexOutOfBoundException, ClassCastException, NullPointerException
error vs exception in java  
