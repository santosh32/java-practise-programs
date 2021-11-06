package dp.behavioral.chain_of_responsibility;

/**
 * The Chain of Responsibility pattern is widely used and adopted. It defines a chain of objects, that collectively,
 * one after another, process the request - where each processor in the chain has its own processing logic.
 * <p>
 * Each of these processing units decides who should continue processing the request next,
 * and each has a reference to the next in line.
 * <p>
 * It's important to note that it's very handy for decoupling the sender from the receiver.
 */
abstract class Employee {
    public static int PROGRAMMER = 1;
    public static int LEAD_PROGRAMMER = 2;
    public static int MANAGER = 3;

    protected int authorityLevel;

    protected Employee nextEmployee;

    public void setNextEmployee(Employee employee) {
        this.nextEmployee = employee;
    }

    public void doWork(int authorityLevel, String message) {
        if (this.authorityLevel <= authorityLevel) {
            write(message);
        }
        if (nextEmployee != null) {
            nextEmployee.doWork(authorityLevel, message);
        }
    }

    abstract protected void write(String message);
}

class Programmer extends Employee {

    public Programmer(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("Programmer is working on project: " + message);
    }
}

class LeadProgrammer extends Employee {

    public LeadProgrammer(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("Lead programmer is working on project: " + message);
    }
}

class Manager extends Employee {

    public Manager(int authorityLevel) {
        this.authorityLevel = authorityLevel;
    }

    @Override
    protected void write(String message) {
        System.out.println("Manager is working on project: " + message);
    }
}

public class ChainOfResponsibilityPattern {


    private static Employee getChainOfEmployees() {
        Employee programmer = new Programmer(Employee.PROGRAMMER);
        Employee leadProgrammer = new LeadProgrammer(Employee.LEAD_PROGRAMMER);
        Employee manager = new Manager(Employee.MANAGER);

        programmer.setNextEmployee(leadProgrammer);
        leadProgrammer.setNextEmployee(manager);

        return programmer;
    }

    public static void main(String[] args) {
        Employee employeeChain = getChainOfEmployees();

        employeeChain.doWork(Employee.PROGRAMMER, "This is basic programming work.");
        employeeChain.doWork(Employee.LEAD_PROGRAMMER, "This is marginally more sophisticated programming work.");
        employeeChain.doWork(Employee.MANAGER, "This is the work for a manager.");
    }
}
/*
Programmer is working on project: This is basic programming work.
Programmer is working on project: This is marginally more sophisticated programming work.
Lead programmer is working on project: This is marginally more sophisticated programming work.
Programmer is working on project: This is the work for a manager.
Lead programmer is working on project: This is the work for a manager.
Manager is working on project: This is the work for a manager.
 */