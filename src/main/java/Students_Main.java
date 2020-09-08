
import java.util.Scanner;

/**
 *
 * @author A
 */
public class Students_Main {

    public static void main(String[] args) {

        Students st = new Students("4", "3", "1");
        
        int count = 0;

        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the operation :");
        String op = sc.next();
        
        System.out.println("Students' car :" + st.getCar());
        System.out.println("Students' walk :" + st.getWalk());
         System.out.println("Students' cycle :" +st.getCycle());
    }

}
