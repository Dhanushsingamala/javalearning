package conditionalStatements;
import java.util.*;

public class Conditions {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else{
            System.out.println("Not an adult");
        }

        if (age % 2  == 0){
            System.out.println("even");
        } else {
            System.out.println("odd number");
        }


    }
}
