import java.util.ArrayList;

public class TestStudents {
    public static void main(String[] args)
    {


        Student a = new Student("Maja");
        Student b = new Student("Elsa");
        Student c = new Student("Signe");

        Course f = new Course("Programming");
        Course g = new Course("Algorithms");
        Course h = new Course("Web Programming");
        Course j = new Course("Databases");

        a.addCourse(f);
        a.addCourse(j);

        b.addCourse(f);
        b.addCourse(g);
        b.addCourse(j);

        c.addCourse(h);
        c.addCourse(g);
        a.addCourse(f);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
