
package CheckPoint.Flexisaf;

/**
 *
 * @author De-Prof
 */
public class Borrowers implements Comparable<Borrowers> {
    
    private Book book;
    private Member member;

    public Borrowers(Book book, Member member) {
        this.book = book;
        this.member = member;
    }
 

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public int compareTo(Borrowers other) {
       if (other.member instanceof Student && this.member instanceof Student) {
           Student student = (Student) this.member;
           Student otherStudent = (Student) other.member;
           return student.compareTo(otherStudent);
       } else if (other.member instanceof Staff && this.member instanceof Staff){
           Staff staff = (Staff) this.member;
           Staff otherStaff = (Staff) other.member;
           return staff.compareTo(otherStaff);
       }
       else {
           return 0;
       }
    }
    
    @Override
    public String toString(){
        return book.getBookName() + " borrowed by " + member.getFullName();
    }    
   
}
