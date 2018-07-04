
package CheckPoint.Flexisaf;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class TestClass {
    
    public static void main(String[] args){
        Member staff = new Staff();
        staff.setFullName("Adamson");
        
        Member student = new Student();
        student.setFullName("Godspower.");
        
        Book thingsFallApart = new Book("Things fall apart", "Chiwe Achebe", '2', "0201");
        
       
        List<Borrowers> borrow = new ArrayList<>();
        
        
        Borrowers stu = new Borrowers(thingsFallApart, student);
        Borrowers star  = new Borrowers(thingsFallApart, staff);
        
        borrow.add(stu);
        borrow.add(star);
        
        Collections.sort(borrow);
        
        for (Borrowers b : borrow){
            System.out.println(b);
        }
        
        System.out.println("");
        
        for (int i = borrow.size() -1; i >= 0; i--){
            Borrowers b = borrow.get(i);
            System.out.println(b);
        }
        
        System.out.println(borrow);
        
//        PriorityQueue<Borrowers> queue = new PriorityQueue<>();
//        
//        
//        
//        queue.add(stu);
//        queue.add(star);
//        
//        Iterator it = queue.iterator();
//        while(it.hasNext()){
//            Borrowers borrow = queue.poll();
//            Book wee = borrow.getBook();
//       
//        }
    }
}