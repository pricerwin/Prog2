public class EmployeeDemo {
    //Get employee info method...
    public static void getInfo(Employee object){
        System.out.println("Name: "+object.name);
        System.out.println("ID: "+object.id);
        System.out.println("Salary: "+object.salary);
    }
    public static void main(String[] args){
        //create 3 employee objects...
        Employee employeeOne = new Employee ("John Doe", 1, 50000.00);

        Employee employeeTwo = new Employee ("Mary Smith", 2, 50000.00);

        Employee employeeThree = new Employee("Bob Ware", 3, 50000.00);

        System.out.println(Employee.employeeCount);
        System.out.println();

        //Passing employee objects into getInfo method...
        getInfo(employeeOne);
        System.out.println();

        getInfo(employeeTwo);
        System.out.println();

        getInfo(employeeThree);
        System.out.println();
        //Raising salary of employeeOne...
        employeeOne.raiseSalary(45.0);

        //Printing new salary of employeeOne...
        System.out.println("New Salary for John Doe: "+employeeOne.salary);
    }
}
