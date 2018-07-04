
package CheckPoint.Flexisaf;

/**
 *
 * @author De-Prof
 */
public class Book {
    private String bookName;
    private String author;
    private char numberOfCopies;
    private String ISBNNumber;
    
    Book(){}
    
    public Book(String bookName, String author, char numberOfCopies, String ISBNNumber){
        this.author = author;
        this.bookName = bookName;
        this.numberOfCopies = numberOfCopies;
        this.ISBNNumber = ISBNNumber;
    }
    
    public String getBookName(){
        return bookName;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public char getNumberOfCopies(){
        return numberOfCopies;
    }
    
    public String getISBNNumber(){
        return ISBNNumber;
    }
}
