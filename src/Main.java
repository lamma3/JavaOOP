import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(
                "a",
                10,
                "m",
                "1"
        );

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Id: " + student.getId());
    }
}
