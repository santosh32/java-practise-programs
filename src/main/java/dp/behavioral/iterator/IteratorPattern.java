package dp.behavioral.iterator;

/**
 * The Iterator pattern is used as the core pattern of Java's Collection Framework.
 * It's used to access the members of collections all the while hiding the underlying implementation.
 */
interface Iterator {

    boolean hasNext();

    Object next();
}

interface Sector {

    Iterator getIterator();
}

class EmployeeRepository implements Sector {

    public String[] employees = {"David", "Scott", "Rhett", "Andrew", "Jessica"};

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < employees.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return employees[index++];
            }
            return null;
        }
    }
}

public class IteratorPattern {


    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();

        for (Iterator iterator = employeeRepository.getIterator();
             iterator.hasNext(); ) {
            String employee = (String) iterator.next();
            System.out.println("Employee: " + employee);
        }
    }
}
/*
Employee: David
Employee: Scott
Employee: Rhett
Employee: Andrew
Employee: Jessica
 */