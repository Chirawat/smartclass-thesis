package problem_4_1_604_43;
import java.util.Scanner;
public class Problem_4_1_604_43 {
    public static void main(String[] args) {
        System.out.println("Product Price : ");
        
        Scanner keyboard = new Scanner(System.in);
        int price  = keyboard.nextInt();
        
        System.out.print("Cash: ");
        int cash = keyboard.nextInt();
        
        System.out.print("Change :"); 
        System.out.print(cash-price);// คำนวณเงินทอน
       
    }
    
}
