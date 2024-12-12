import java.util.ArrayList;


class Course{
    private final int credits;
    private final String name;
    private double grade;
    
    public Course(String name, int credits){
        this.name = name;
        this.credits = credits;
    }

    public String getName(){
        return name;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    public double getGrade(){
        return grade;
    }

    public int getCredits(){
        return credits;
    }
    public String getLetterGrade(){
        if (grade >= 4)
            return "A";
        else if (grade >= 3.7)
            return "A-";
        else if (grade >= 3.3)
            return "B+";
        else if (grade >= 3.0)
            return "B";
        else if (grade >= 2.7)
            return "B-";
        else if (grade >= 2.3)
            return "C+";
        else if (grade >= 2.0)
            return "C";
        else if (grade >= 1.7)
            return "C-";
        else if (grade >= 1.0)
            return "D";
        else
            return "F";
    }
}

class Student {
    private final ArrayList<Course> courses;
    private final String name;
    private final int ID;

    public Student(String name, int ID){
        this.name = name;
        this.ID = ID;
        courses = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.ID;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public void removeCourse(Course course){
        courses.remove(course);
    }
    public ArrayList<Course> getCourses(){
        return courses;
    }
    public double getGPA(){
        double total = 0;
        int count = 0;

        for (Course course : courses){
            total += course.getGrade();
            count++;
        }
        return count == 0 ? 0 : total/count;
    }

    public String getTranscript(){
        StringBuilder transcript  = new StringBuilder();
        transcript.append("Name: ").append(name).append("\n");
        transcript.append("ID: ").append(ID).append("\n");
        for (Course course: courses){
            transcript.append("Course: ")
                        .append(course.getName())
                        .append(" ( ").append(course.getCredits()).append(" credits )")
                        .append(" Grade: ").append(course.getGrade())
                        .append(" ( ").append(course.getLetterGrade()).append(" )\n");
        }

        return transcript.toString();
    }
}


public class Encap {

    public static void main(String[] args){
        Student Codin = new Student("Codin", 0);
        Course math = new Course("Math", 4);
        Course science = new Course("Science", 4);

        math.setGrade(3.7);
        science.setGrade(3.91);

        Codin.addCourse(science);
        Codin.addCourse(math);
        
        System.out.println("Codin GPA: " + Codin.getGPA());
        System.out.println("Codin Transcript: \n" + Codin.getTranscript());

        Student GAL = new Student("GAL", 1);
        Course mathGAL = new Course("Math", 4);
        Course scienceGAL = new Course("Science", 4);
        mathGAL.setGrade(3.26);
        scienceGAL.setGrade(3.72);

        GAL.addCourse(science);
        GAL.addCourse(math);
        
        System.out.println("GAL GPA: " + GAL.getGPA());
        System.out.println("GAL Transcript: \n" + GAL.getTranscript());

    }
    
}

/*
 * Encapsulation is the process of protecting the other classes from accessing the parent class directly and allows the class to access the parent class through methods.
 * Advantages:
 ! It protects the class from being accessed direcly
 ! It makes the class easier to access and maintain
 ! It protects the class from the unsual accesses
 */
