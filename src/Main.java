import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher samantha = new Teacher(1, "Samantha", 5000);
        Teacher john = new Teacher(2, "John", 5000);
        Teacher jake = new Teacher(3, "Jake", 5000);

//        create arraylist of teachers
        List<Teacher> teacherList = new ArrayList<>(List.of(samantha,jake,john));

        Student student1 = new Student(1, "Student1", 40);
        Student student2 = new Student(2, "Student2", 60);
        Student student3 = new Student(3, "Student3", 80);

        List<Student> studentList = new ArrayList<>(List.of(student1,student2,student3));

        //create a school object from the above arraylists
        School newSchool = new School(teacherList, studentList);

        System.out.println("School has earned (euros): " + newSchool.getTotalMoneyEarned());



    }
}