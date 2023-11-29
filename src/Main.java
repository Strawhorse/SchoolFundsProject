import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher samantha = new Teacher(1, "Samantha", 5000);
        Teacher john = new Teacher(2, "John", 15000);
        Teacher jake = new Teacher(3, "Jake", 15000);


//        create arraylist of teachers
        List<Teacher> teacherList = new ArrayList<>(List.of(samantha,jake,john));

        Student student1 = new Student(1, "Student1", 40);
        Student student2 = new Student(2, "Student2", 60);
        Student student3 = new Student(3, "Student3", 80);

        List<Student> studentList = new ArrayList<>(List.of(student1,student2,student3));

        //create a school object from the above arraylists
        School newSchool = new School(teacherList, studentList);

        student1.payFee(60000);
        samantha.setSalary(10000);
        jake.setSalary(20000);
        student2.payFee(50000);

        Teacher teddy = new Teacher(4, "Teddy", 12000);
        newSchool.addTeacher(teddy);


        System.out.println("School has earned (euros): " + newSchool.getTotalMoneyEarned());


        System.out.println("School's pay salary: " + newSchool.getTotalMoneySpent());
        samantha.receiveSalary(samantha.getSalary());
        

    }
}