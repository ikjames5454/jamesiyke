import java.util.Scanner;

 public class Summation {

  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

   System.out.print("Enter integer number1");
     int number1 = input.nextInt();

   System.out.print("Enter integer number2");
      int number2 = input.nextInt();

   System.out.print("Enter integer number3");
      int number3 = input.nextInt();
     
     int sum = number1 + number2 + number3;

     int average = sum / 3;

    int product = number1 * number2 * number3;

  System.out.printf("%d,%n",sum);
  System.out.printf("%d,%n",average);
  System.out.printf("%d,%n",product);

    int smallest = number1;
  if (number2 < number1){
    smallest = number2;
}

    if (number3 < number2){
    smallest = number3;
}
   int largest = number1;
  if (number2 > number1){
       largest = number2;
} 
    
  if (number3 > number2){
     largest = number3;

}
 System.out.printf("%d is the smallest%n", smallest);
 System.out.printf("%d is the largest%n", largest);
 } 


}

