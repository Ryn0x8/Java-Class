class CreateEmployee{
    int empno;
    String name;
    float salary;
    CreateEmployee(int no, String empname, float empsalary){
        this.empno = no;
        this.name = empname;
        this.salary=empsalary;
        System.out.println("*****************************");
        System.out.println("    New Employee Created");
        System.out.println("*****************************");
        System.out.println();
        System.out.println();
        System.out.println();
    }
    void displayDetails(){
        System.out.println("*****************************");
        System.out.println("      Employee name: "+ name);
        System.out.println("      Employee salary: Rs "+ salary);
        System.out.println("      Employee no: "+ empno);
        System.out.println("*****************************");
        System.out.println();
        System.out.println();
        System.out.println();
    }



}

public class Employee {
    public static void main(String[] args){
        CreateEmployee emp1 = new CreateEmployee(1, "Suraj", 12000);
        CreateEmployee emp2 = new CreateEmployee(2, "Himal", 12300);
        CreateEmployee emp3 = new CreateEmployee(3, "Kiran", 32129);
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
    
}
