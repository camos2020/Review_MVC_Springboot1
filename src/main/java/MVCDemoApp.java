public class MVCDemoApp {
    //private static Object Student;

    public static void main(String[] args) {

        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model,view);

        controller.updateView();

        controller.setStudentName("Ben Walsh");

        controller.updateView();


    }
    private static Student retrieveStudentFromDatabase()
    {
        Student student = new Student();
        student.setStudentName("Cassandra");
        student.setStudentId("ABC123");
        return student;
    }
}
