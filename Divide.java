 
 import java.util.Scanner;

   public class Divide {
 
 public static void main(String[] args){

  Scanner input = new Scanner(System.in);
 
  System.out.print("Enter integer number");
   int number = input.nextInt();
  
   
 

   if(number % 3 != 0){
   System.out.printf("%d is not divisible by %d%n",number,3);
 }
   if(number % 3 == 0){
    System.out.printf("%d is divisible by %d%n",number,3);
}
 
 }

}




























  














