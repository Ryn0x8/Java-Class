import java.util.Scanner;

class Employee{
    private String name;
    private Integer ID;
    private Double Salary;
    private Float pfpercent =  0.04f;
    private Scanner keyboard = new Scanner(System.in);


    public String getName(){
        return this.name;
    }
    public Integer getID(){
        return this.ID;
    }
    public Double getSalary(){
        return this.Salary;
    }

    public void setName(){
        System.out.println("Please enter your name: ");
        String name = keyboard.next();
        this.name = name;
    }
    public void setID(){
        System.out.println("Please enter your id: ");
        Integer id = keyboard.nextInt();
        this.ID = id;
    }
    public void setSalary(){
        System.out.println("Please enter your salary: ");
        Double salary = keyboard.nextDouble();
        this.Salary = salary;
    }

    public Double getNetSalary(){
        return this.Salary-(this.Salary*pfpercent);
    }
    

}

public class EmployeeD {
    public static void main(String[] args){
        Employee Cod = new Employee();
        Cod.setID();
        Cod.setName();
        Cod.setSalary();

        System.out.println("******Employee********");
        System.out.println("   Name: "+ Cod.getName());
        System.out.println("   ID:   "+ Cod.getID());
        System.out.println("   Salary: "+ Cod.getSalary());
        System.out.println("   Net Salary: "+ Cod.getNetSalary());
        System.out.println("**********************");
    }
}
