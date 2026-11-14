import java.util.Scanner;

public class colorRange{
 public static void main (String []args){
 double waveLenght;
 
 
 Scanner sc = new Scanner (System.in);
   System.out.print("Enter a wavelengtht: "); 
   waveLenght = sc.nextDouble();
  
   if (waveLenght >= 380 && waveLenght <= 450){
    System.out.println("The Color is Violet");
   }
   
    if (waveLenght >= 450 && waveLenght <= 495){
    System.out.println("The Color is Blue");
   }

   
    if (waveLenght >= 495 && waveLenght <= 570){
    System.out.println("The Color is Green");
   } 
   
   
   if (waveLenght >= 570 && waveLenght <= 590){
    System.out.println("The Color is Yellow");
   }
  
    if (waveLenght >= 590 && waveLenght <= 620){
    System.out.println("The Color is Orange");
   }
   
   
    if (waveLenght >= 620 && waveLenght <= 750){
    System.out.println("The Color is Red");
   }else{
   System.out.println("The entered wavelenght is not a part of the visible spectrum");
}






}
   }