
import java.util.Scanner;

  public class LargestSmallest{

   public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.print("Enter integer number1");
    int number1 = input.nextInt();

  System.out.print("Enter integer number2");
     int number2 = input.nextInt();

  System.out.print("Enter integer number3");
      int number3 = input.nextInt();

  System.out.print("Enter integer number4");
     int number4 = input.nextInt();

  System.out.print("Enter integer number5");
     int number5 = input.nextInt();

  int largest = number1;
 if (number1>number2){
     largest = number2;
}

 if (number2>number3){
    largest = number3;
}

 if (number3>number4){
     largest = number4;
}
  
 if (number4>number5){
     largest = number5;
}

  int smallest = number1;
 if (number1<number2){
    smallest = number2;
}

 if (number2<number3){
    smallest = number3;
}

if (number3<number4){
    smallest = number4;  
}

 if (number4<number5){
   smallest = number5;
}

 System.out.printf("%d is the largest%n", largest);
 System.out.printf("%d is the smallest%n", smallest);

 }

} 






