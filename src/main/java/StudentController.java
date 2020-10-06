public class StudentController {

    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    public Student getModel() {
        return model;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

        public void setStudentName(String studentName) {
        model.setStudentName(studentName);
    }

    public String getStudentName(){
        return model.getStudentName();
    }

    public void setStudentId(String studentId) {
        model.setStudentName(studentId);
    }

    public String getStudentId(){
        return model.getStudentId();
    }

    public void updateView(){
        view.displayStudentDetails(model.getStudentName(), model.getStudentId());
    }

}
