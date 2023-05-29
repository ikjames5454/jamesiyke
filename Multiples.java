import java.util.Scanner;

    public class Multiples{
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

  System.out.print("Enter integer number1");
     int number1 = input.nextInt();

  System.out.print("Enter integer number2");
     int number2 = input.nextInt();
   
   int triplednumber1 = number1 * 3;
   int doublednumber2 = number2 * 2;

  if (doublednumber2 % triplednumber1 == 0){
      System.out.printf("%d is firstnumber when trippled is a multiple of second number which is %d when doubled ", number1, number2);

   }
   
  else{ 

     System.out.println("ooh so sorry not a multiple, too bad");
  
}
  }

 }
