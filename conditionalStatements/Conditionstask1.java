package conditionalStatements;

import java.util.*;

public class Conditionstask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else{
            if (a > b) {
                System.out.println("a is greater than b");
            } else {
                System.out.println("a is lesser than b");
            }
        }
        //can be replaced by elseif in java.

        //usage of switch

        switch (a) {
            case 1:
                System.out.println("hello");
                break;
            case 2: System.out.println("dhanush ");
                break;
        
            default:
                System.out.println("Invalid click");
                break;
        }
    }
}
