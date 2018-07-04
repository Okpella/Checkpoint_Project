
package CheckPoint.Flexisaf;

import java.util.Date;


/**
 *
 * @author De-Prof
 */
public class Member {
    private String fullName;
    private char gender;
    private String dateOfBirth;
    private String email;
    private String phone;
    
    Member(){
    }
    
    public  Member(String fullName, char gender, String dateOfBirth, String email, String phone){
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
    }
    
    public String getFullName(){
        return fullName;
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public char getGender(){
        return gender;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPhone(){
        return phone;
    }
    

    
    
}
