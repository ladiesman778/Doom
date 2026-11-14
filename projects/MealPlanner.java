import java.util.Scanner;
public class MealPlanner{
 public static void main(String []args){

   Scanner sc = new Scanner (System.in);
    FoodDatabase database = new FoodDatabase();
      
   IO.print("Enter your daily calorie limit: ");
   double dailyLimit = sc.nextDouble();
   
   MealPlan mealPlan = new MealPlan (dailyLimit);
   

   int choice;
   
   do{
   IO.println("\n=====UDDFITPLAN=====");
   IO.println("1. View available foods");
   IO.println("2. Add food to a meal");
   IO.println("3. View my Meal Plan");
   IO.println("4. Remove Food From A meal");
   IO.println("5. Exit");
   IO.println("6. Add Custom Food");
   
   IO.print("Choose action: ");
  while (!sc.hasNextInt()){
   sc.next();
   IO.print("Please Enter a whole number: ");
   }
   choice = sc.nextInt();  
   switch (choice){
   
   case 1:
    database.displayFoods();
    break;
    
   case 2:{
    database.displayFoods();
    IO.print("Enter Food ID: ");
    int foodId = sc.nextInt();
    
    Food selectedFood = database.findFoodById(foodId);
    
    if(selectedFood == null){
     IO.println("Food Not Found!");
     break;
      }
    IO.println("\n1. Breakfast");
    IO.println("2. Lunch");
    IO.println("3. Dinner");
    IO.println("4. Snacks");
    IO.print("Choose a meal: ");
     int mealChoice = sc.nextInt();
     
    mealPlan.addFoodToMeal(selectedFood, mealChoice);
    break;
    }

      
    case 3:
    mealPlan.displayMealPlan();
    break;
     
   case 4:{
    mealPlan.displayMealPlan(); 
    
    
    IO.println("\n1. Breakfast");
    IO.println("2. Lunch");
    IO.println("3. Dinner");
    IO.println("4. Snacks");
    
    IO.print("Choose the meal to remove food from: ");
    int mealChoice = sc.nextInt();
        
    IO.println("Enter the food ID to remove: ");
    int foodId = sc.nextInt();
    
    mealPlan.removeFoodFromMeal(foodId, mealChoice);
   
    break;
    }
   
   case 5: 
    IO.println("Thank you for using UDDFITPLAN!");
    break;
    
   case 6:{
    sc.nextLine();
    
    IO.print("Enter Food Name: ");
    String foodName = sc.nextLine();
    
    IO.print("Enter Food Calories: ");
    double calories = sc.nextDouble();
    
    database.addCustomFood(foodName, calories);
    break;
    }
   
   default:
    IO.println("Invalid action, Please Enter number 1 to 6.");
    }
    
    if(choice != 5){
    IO.print("\nPress Enter to do another action!");
    sc.nextLine();
    sc.nextLine();
    }
    
    }while (choice !=5);  
    sc.close();





 }
      }