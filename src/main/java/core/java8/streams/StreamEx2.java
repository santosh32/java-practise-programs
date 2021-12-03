package core.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEx2 {

    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeData();

        //1: How many male and female employees are there in the organization
        Map<String, Long> noOfMaleAndFemaleEmployees =
                employeeList
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(noOfMaleAndFemaleEmployees);
        // {Male=11, Female=6}

        //2: Print the name of all departments in the organization
        employeeList
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
        /*
            HR
            Sales And Marketing
            Infrastructure
            Product Development
            Security And Transport
            Account And Finance
         */

        //3: What is the average age of male and female employees
        Map<String, Double> avgAgeOfMaleAndFemaleEmployees =
                employeeList
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(avgAgeOfMaleAndFemaleEmployees);
        //{Male=30.181818181818183, Female=27.166666666666668}

        //4 : Get the details of highest paid employee in the organization
        Optional<Employee> highestPaidEmployeeWrapper =
                employeeList
                        .stream()
                        .max(Comparator.comparingDouble(Employee::getSalary));

        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
        System.out.println("Details Of Highest Paid Employee : ");
        System.out.println("==================================");
        System.out.println("ID : " + highestPaidEmployee.getId());
        System.out.println("Name : " + highestPaidEmployee.getName());
        System.out.println("Age : " + highestPaidEmployee.getAge());
        System.out.println("Gender : " + highestPaidEmployee.getGender());
        System.out.println("Department : " + highestPaidEmployee.getDepartment());
        System.out.println("Year Of Joining : " + highestPaidEmployee.getYearOfJoining());
        System.out.println("Salary : " + highestPaidEmployee.getSalary());
        /*
            Details Of Highest Paid Employee :
            ==================================
            ID : 277
            Name : Anuj Chettiar
            Age : 31
            Gender : Male
            Department : Product Development
            Year Of Joining : 2012
            Salary : 35700.0
         */

        //5 : Get the names of all employees who have joined after 2015
        employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);
        /*
            Iqbal Hussain
            Amelia Zoe
            Nitin Joshi
            Nicolus Den
            Ali Baig
         */

        //6 : Count the number of employees in each department
        Map<String, Long> employeeCountByDepartment =
                employeeList
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        Set<Map.Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

        for (Map.Entry<String, Long> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        /*
            Product Development : 5
            Security And Transport : 2
            Sales And Marketing : 3
            Infrastructure : 3
            HR : 2
            Account And Finance : 2
         */

        //7 : What is the average salary of each department
        Map<String, Double> avgSalaryOfDepartments =
                employeeList
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> entrySet1 = avgSalaryOfDepartments.entrySet();

        for (Map.Entry<String, Double> entry : entrySet1) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        /*
            Product Development : 31960.0
            Security And Transport : 10750.25
            Sales And Marketing : 11900.166666666666
            Infrastructure : 15466.666666666666
            HR : 23850.0
            Account And Finance : 24150.0
         */

        //8 : Get the details of youngest male employee in the product development department
        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper =
                employeeList
                        .stream()
                        .filter(e -> e.getGender() == "Male" && e.getDepartment() == "Product Development")
                        .min(Comparator.comparingInt(Employee::getAge));

        Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();
        System.out.println("Details Of Youngest Male Employee In Product Development");
        System.out.println("----------------------------------------------");
        System.out.println("ID : " + youngestMaleEmployeeInProductDevelopment.getId());
        System.out.println("Name : " + youngestMaleEmployeeInProductDevelopment.getName());
        System.out.println("Age : " + youngestMaleEmployeeInProductDevelopment.getAge());
        System.out.println("Year Of Joinging : " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());
        System.out.println("Salary : " + youngestMaleEmployeeInProductDevelopment.getSalary());
        /*
            Details Of Youngest Male Employee In Product Development :
            ———————————————-
            ID : 222
            Name : Nitin Joshi
            Age : 25
            Year Of Joinging : 2016
            Salary : 28200.0
         */

        //9 : Who has the most working experience in the organization?
        Optional<Employee> seniorMostEmployeeWrapper =
                employeeList
                        .stream()
                        .sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

        Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();

        System.out.println("Senior Most Employee Details :");
        System.out.println("----------------------------");
        System.out.println("ID : " + seniorMostEmployee.getId());
        System.out.println("Name : " + seniorMostEmployee.getName());
        System.out.println("Age : " + seniorMostEmployee.getAge());
        System.out.println("Gender : " + seniorMostEmployee.getGender());
        System.out.println("Age : " + seniorMostEmployee.getDepartment());
        System.out.println("Year Of Joinging : " + seniorMostEmployee.getYearOfJoining());
        System.out.println("Salary : " + seniorMostEmployee.getSalary());
        /*
            Senior Most Employee Details :
            —————————-
            ID : 177
            Name : Manu Sharma
            Age : 35
            Gender : Male
            Age : Account And Finance
            Year Of Joinging : 2010
            Salary : 27000.0
         */

        //10 : How many male and female employees are there in the sales and marketing team
        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing =
                employeeList.stream()
                        .filter(e -> e.getDepartment() == "Sales And Marketing")
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(countMaleFemaleEmployeesInSalesMarketing);
        //{Female=1, Male=2}

        //11 : What is the average salary of male and female employees
        Map<String, Double> avgSalaryOfMaleAndFemaleEmployees =
                employeeList
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalaryOfMaleAndFemaleEmployees);
        //{Male=21300.090909090908, Female=20850.0}

        //13 : What is the average salary and total salary of the whole organization
        DoubleSummaryStatistics employeeSalaryStatistics =
                employeeList
                        .stream()
                        .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary = " + employeeSalaryStatistics.getAverage());
        System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());
        /*
            Average Salary = 21141.235294117647
            Total Salary = 359401.0
         */

        //14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years
        Map<Boolean, List<Employee>> partitionEmployeesByAge =
                employeeList
                        .stream()
                        .collect(Collectors.partitioningBy(e -> e.getAge() > 25));

        Set<Map.Entry<Boolean, List<Employee>>> entrySet2 = partitionEmployeesByAge.entrySet();

        for (Map.Entry<Boolean, List<Employee>> entry : entrySet2) {
            System.out.println("----------------------------");

            if (entry.getKey()) {
                System.out.println("Employees older than 25 years :");
            } else {
                System.out.println("Employees younger than or equal to 25 years :");
            }

            System.out.println("----------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }

        /*
            —————————-
            Employees younger than or equal to 25 years :
            —————————-
            Paul Niksui
            Amelia Zoe
            Nitin Joshi
            Nicolus Den
            Ali Baig
            —————————-
            Employees older than 25 years :
            —————————-
            Jiya Brein
            Martin Theron
            Murali Gowda
            Nima Roy
            Iqbal Hussain
            Manu Sharma
            Wang Liu
            Jaden Dough
            Jasna Kaur
            Jyothi Reddy
            Sanvi Pandey
            Anuj Chettiar
         */

        //15 : Who is the oldest employee in the organization? What is his age and which department he belongs to
        Optional<Employee> oldestEmployeeWrapper = employeeList
                .stream()
                .max(Comparator.comparingInt(Employee::getAge));

        Employee oldestEmployee = oldestEmployeeWrapper.get();
        System.out.println("Name : " + oldestEmployee.getName());
        System.out.println("Age : " + oldestEmployee.getAge());
        System.out.println("Department : " + oldestEmployee.getDepartment());

        /*
            Name : Iqbal Hussain
            Age : 43
            Department : Security And Transport
         */

        //12 : List down the names of all employees in each department
        Map<String, List<Employee>> employeeListByDepartment =
                employeeList
                        .stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entrySet4 = employeeListByDepartment.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet4) {
            System.out.println("--------------------------------------");

            System.out.println("Employees In " + entry.getKey() + " : ");

            System.out.println("--------------------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list) {
                System.out.println(e.getName());
            }
        }

        /*
            ————————————–
            Employees In Product Development :
            ————————————–
            Murali Gowda
            Wang Liu
            Nitin Joshi
            Sanvi Pandey
            Anuj Chettiar
            ————————————–
            Employees In Security And Transport :
            ————————————–
            Iqbal Hussain
            Jaden Dough
            ————————————–
            Employees In Sales And Marketing :
            ————————————–
            Paul Niksui
            Amelia Zoe
            Nicolus Den
            ————————————–
            Employees In Infrastructure :
            ————————————–
            Martin Theron
            Jasna Kaur
            Ali Baig
            ————————————–
            Employees In HR :
            ————————————–
            Jiya Brein
            Nima Roy
            ————————————–
            Employees In Account And Finance :
            ————————————–
            Manu Sharma
            Jyothi Reddy
         */

    }

    private static List<Employee> EmployeeData() {

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        return employeeList;
    }
}

class Employee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id : " + id
                + ", Name : " + name
                + ", age : " + age
                + ", Gender : " + gender
                + ", Department : " + department
                + ", Year Of Joining : " + yearOfJoining
                + ", Salary : " + salary;
    }
}