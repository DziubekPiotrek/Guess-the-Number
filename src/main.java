import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[]args){
        int i = 0;
        int moose;
        int reply;
        Random ls = new Random();
        moose = ls.nextInt(10) + 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess the number from 1 to 10\n");
        do {
            i++;
            System.out.println("Enter Number :");
             reply = scan.nextInt();
             if( reply> moose){
                 System.out.println("Unfortunately, this number is not\n ");
             }
             else if (reply < moose){
                 System.out.println("Unfortunately, this number is not\n");
             }
        }while(reply  != moose);
        System.out.println("Well done you guessed it\n" + i + "together");
    }
}
