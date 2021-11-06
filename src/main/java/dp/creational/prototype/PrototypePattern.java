package dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * The Prototype pattern is used mainly to minimize the cost of object creation, usually when large-scale
 * applications create, update or retrieve objects which cost a lot of resources.
 * <p>
 * This is done by copying the object, once it's created, and reusing the copy of the object in later requests,
 * to avoid performing another resource-heavy operation. It depends on the decision of
 * the developer whether this will be a full or shallow copy of the object, though the goal is the same.
 */
public class PrototypePattern {

    static class Employees implements Cloneable {

        private List<String> empList;

        public Employees() {
            empList = new ArrayList<>();
        }

        public Employees(List<String> list) {
            this.empList = list;
        }

        public void loadData() {
            // read all employees from database and put into the list
            empList.add("Pankaj");
            empList.add("Raj");
            empList.add("David");
            empList.add("Lisa");
        }

        public List<String> getEmpList() {
            return empList;
        }

        @Override
        public Object clone() {
            List<String> temp = new ArrayList<>();
            for (String s : this.getEmpList()) {
                temp.add(s);
            }
            return new Employees(temp);
        }

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        // Use the clone method to get the Employee object
        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);
    }

}