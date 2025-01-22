package Loops;

import java.util.*;

public class Loops {
    public static void main(String[] args){
        //for loop 
        // for (intialization; condition ; updation){statements to be executed}, updation we use counter.
        for(int counter = 0; counter<5 ; counter++){
            System.out.println("dhanush \n"+ counter);
        }

        //while loop
        // while (condition){statements to be executed   increament/decrement}

        int j = 0;
        while(j < 11){
            System.out.println(j+1);
            j+=1; //j++ , j=j+1
        }

        //do while
        //d0 {statements}while(condition); this statements will be executed atleast once

        int i = 0;
        do{
            System.out.println(i);
            i=i+1;
        }while(i<11);

        //check diff btw dowhile and while
        // int d = 8;
        // while(d<11){
        //     System.out.println("my learning is done");
        // }

        // do{
        //     System.out.println("my learning is done");
        //     d+=5;
        // }while(d<11);

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int sum = 0;
        for(int m=0; m<=k; m++){
            sum+=m;
        }
        System.out.println(sum);
    }
}
