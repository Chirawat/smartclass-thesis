package problem_4_1_604_12;
import java.util.Scanner ;
public class Problem_4_1_604_12 {
    public static void main(String[] args) {
       System.out.print("Product price : ");
       
       Scanner keyboard = new Scanner (System.in);
       int price = keyboard.nextInt();
       
       System.out.print("Cash : ");
       int cash = keyboard.nextInt();
       System.out.print("Change : ");
       System.out.println(cash-price);
       
    }
    
}
