class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("---------------");
    }
}

public class Stud {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Sam", 1, 95);
        students[1] = new Student("Tom", 2, 94);
        students[2] = new Student("Alice", 3, 93);
        students[3] = new Student("Bob", 4, 92);
        students[4] = new Student("Charlie", 5, 91);
        students[5] = new Student("David", 6, 90);
        students[6] = new Student("Eve", 7, 89);
        students[7] = new Student("Faythe", 8, 88);
        students[8] = new Student("Grace", 9, 87);
        students[9] = new Student("Heidi", 10, 86);

        for (Student student : students) {
            student.showDetails();
        }
    }
}
