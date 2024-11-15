class Student{
    String name;
    int id;
    float stipend;

    Student(){}
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, float stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }

    void displayDetails(){
        System.out.println("Name: " +this.name+" | ID: "+this.id+" | Stipend: "+this.stipend);
    }

}

class Overload {
    public static void main(String[] args){
        Student student = new Student();
        Student student1 = new Student(1, "Saral");
        Student student2 = new Student(2, "Saurav", 2300.234f);
        student.displayDetails();
        student1.displayDetails();
        student2.displayDetails();
    }
}
