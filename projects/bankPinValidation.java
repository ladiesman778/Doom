import java.util.Scanner;
public class bankPinValidation{
 public static void main (String []args){
 
 Scanner sc = new Scanner(System.in);
 int TruePin = 8888; 
 
 IO.print("Enter your PIN: ");
 int pinInput = sc.nextInt();

 while(pinInput != TruePin){
  IO.println("PIN incorrect, Access Denied!");
  IO.print("Input PIN again: ");
  pinInput= sc.nextInt();
  }
  sc.close();
  
  IO.println("Pin Correct, Access Granted!");
 





 }
    }