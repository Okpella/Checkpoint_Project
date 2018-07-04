
package CheckPoint.Flexisaf;

/**
 *
 * @author De-Prof
 */
public class Student extends Member implements Comparable<Student> {
    private int studentNumber;
    private String StudentClass;
    
    public Student(String fullName, char gender, String dateOfBirth, String email, String phone, int studentNumber, String studentClass) {
        super(fullName, gender, dateOfBirth, email, phone);
        this.studentNumber = studentNumber;
        this.StudentClass = studentClass;
    }

    Student() {
    }
    
    public int getStudentNumber(){
        return studentNumber;
    }
    
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }
    
    public String getStudentClass(){
        return StudentClass;
    }

    @Override
    public int compareTo(Student other) {
        return this.getStudentNumber() - other.getStudentNumber();
    }
    
    
}
