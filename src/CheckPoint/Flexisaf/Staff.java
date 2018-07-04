
package CheckPoint.Flexisaf;

/**
 *
 * @author De-Prof
 */
public class Staff extends Member implements Comparable<Staff> {
    private int staffNumber;
    private String netPay;
    
    public Staff(String fullName, char gender, String dateOfBirth, String email, String phone, int staffNumber, String netPay) {
        super(fullName, gender, dateOfBirth, email, phone);
        this.staffNumber = staffNumber;
        this.netPay = netPay;
    }

    Staff() {
        
    }
    
    public int getStaffNumber(){
        return staffNumber;
    }
    
    public void setStaffNumber(int staffNumber){
        this.staffNumber = staffNumber;
    }
    
    public String getNetPay(){
        return netPay;
    }

    @Override
    public int compareTo(Staff otherStaff) {
        return this.getStaffNumber() - otherStaff.getStaffNumber();
    }
    
//    @Override
//    public String getFullName(){
//        return this
//    }

    @Override
    public String toString() {
        return "Staff{" + "staffNumber=" + staffNumber + ", netPay=" + netPay + '}';
    }
    
}
