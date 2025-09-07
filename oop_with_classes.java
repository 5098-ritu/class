// Example of OOP with classes with inheritance,method overriding in Java

class Employee{
    double salary;
    Employee(double sal){
        salary=sal;
    }


    void work(){
        System.out.println("Employee is working");
    }

    void getSalary(){
    System.out.println("Salary: " + salary);
    }

}

class HR extends Employee{                  //HR class inherits from Employee class
    HR(double sal){
        super(sal);
    }

    void work(){                            //Method overriding
        System.out.println("HR is managing employee relations");
    }

    void addEmployee(){
        System.out.println("HR is adding a new employee");
    }
}
class main{
    public static void main(String[] args) {
        Employee emp=new Employee(50000);
        emp.work();
        emp.getSalary();

        HR hr=new HR(60000);
        hr.work();
        hr.addEmployee();
        hr.getSalary();
    }
}