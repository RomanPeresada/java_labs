package module2.lab2_2.lab2_2_3;

class Employee {


    public void calculateSalary(String name, double... salary) {
        double resultSalary = 0;
        for (double x : salary) {
            resultSalary += x;
        }

        System.out.println("Name is - " + name);
        System.out.println("Total salary is - " + resultSalary);
    }
}

class Accountant {
    private Employee worker;

    public void setWorker(Employee worker) {
        this.worker = worker;
    }

    public Employee getWorker() {
        return worker;
    }
}



public class EmployeeAndAccountant {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.calculateSalary("Alexey",2003.230,21,234.0);
        Accountant acc1 = new Accountant();
        acc1.setWorker(emp1);
        acc1.getWorker().calculateSalary("Julia",2123.43,213.54,1231.76);

    }
}
