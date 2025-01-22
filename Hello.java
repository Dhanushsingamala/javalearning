import java.util.*; // to undestand input in java

public class Hello {

     public static void main(String[] args) {
        System.out.println("dhanush is an excellent guy");
        // variables
        String name = "dhanush";
        System.out.println(name);
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        int diff = a-b;
        System.out.println(diff);

        Scanner sc = new Scanner(System.in);
        String inputnew = sc.next(); //single word use nextLine() for complete input, nextInt(),nextFloat(),...
        System.out.println(inputnew);
     }
}