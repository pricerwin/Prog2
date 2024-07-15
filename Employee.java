public class Employee {
    //instance fields...
    String name;
    int id;
    double salary;
    static int employeeCount;

    //constructor...
    public Employee(String name, int id, double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
        employeeCount++;
    }

    public int getEmployeeCount(){
        return employeeCount;
    }

    public void raiseSalary(double percent){
        salary*=((percent/100.0)+1.0);
    }
}
