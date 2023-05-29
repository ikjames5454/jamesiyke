 import java.util.Scanner;

    public class Inequality {

   public static void main(String[] args) {
  
     Scanner input = new Scanner(System.in);
  
    System.out.print("Enter integer number");
     
    int number = input.nextInt();

     int square = number*number;

  if (number > 100){
    System.out.printf("%d > %d %n",number,100);
 }
   
  if (square > 100){
    System.out.printf("%d > %d%n",square,100);
 }
  if (number == 100){
    System.out.printf("%d == %d%n",number,100);
 }
  if (square == 100){
    System.out.printf("%d == %d%n",square,100);
 }
  if (number != 100){
    System.out.printf("%d != %d%n",number,100);
 }
  if (square != 100){
    System.out.printf("%d != %d%n",square,100);
 }
   if (number < 100){
    System.out.printf("%d < %d%n",number,100);
 }

  if (square < 100){
    System.out.printf("%d < %d%n",square,100);
 }

 }

}


  
   

