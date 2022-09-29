import java.util.ArrayList;

public class Student
{
    private String name;
    public Student(String name)
    {
        this.name = name;
    }
    ArrayList<Course> courses = new ArrayList<>();
    //ArrayList<String> Course = new ArrayList<>();

    public void addCourse(Course course)
    {
        courses.add(course);
    }


    public String toString() {
        return "Name: " + name + "Courses: " + courses;
    }
}


