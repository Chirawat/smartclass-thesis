


package problem_5_1_604_05;

import java.util.Scanner;

public class problem_5_1_604_05 {
    public static void main(String[] args) {
        System.out.print("Enter velovity");
        Scanner kb = new Scanner(System.in);
        int v = kb.nextInt();
        System.out.print("Enter time");
        int t = kb.nextInt();
        System.out.println("Distance:");
        for(int i=0; i<=t; i++){
            System.out.println("t = " + i + " :  S = " + v*i);
        }
    }
    
}
