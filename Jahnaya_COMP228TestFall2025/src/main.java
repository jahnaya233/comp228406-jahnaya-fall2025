import controllers.StudentController;

public class Main {

    public static void main(String[] args) {
        StudentController.getStudentsByCity("Toronto")
                .forEach(s ->
                        System.out.println(
                                s.getStudentId() + " " +
                                        s.getFirstName() + " "+
                                        s.get.LastName()
                        ));
    }
}
