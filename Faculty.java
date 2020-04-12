import java.util.List;

class Faculty{
    List<Student> students;
    String facultyName;

    public void addStudent(Student student){
        students.add(student);
    }
    
    public void deleteStudent(Student student){
        students.remove(student);
    }
}