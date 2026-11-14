import java.util.ArrayList;

public class MealPlan {

private ArrayList<Food> breakfast;
private ArrayList<Food> lunch;
private ArrayList<Food> dinner;
private ArrayList<Food> snacks;

private double dailyLimit;



public MealPlan(double dailyLimit) {

breakfast = new ArrayList<>();
lunch = new ArrayList<>();
dinner = new ArrayList<>();
snacks = new ArrayList<>();

this.dailyLimit = dailyLimit;

}
public void addFoodToMeal(Food food, int choice){


if (food == null){
System.out.println("Food Not Found!");
return;
}

switch (choice){


case 1:
breakfast.add(food);
break;

case 2:
lunch.add(food);
break;

case 3:
dinner.add(food);
break;

case 4:
snacks.add(food);
break;

default:
System.out.println("Food data does not exist, invalid food");
return;
}

System.out.println("Food Added successfully");
double total = calculateTotalCalories();
if (total > dailyLimit){
 double extraCalories = total - dailyLimit;
 
 IO.println("WARNING: you have exceeded your daily calorie limit!");
 IO.println("Calorie Surplus: -" + extraCalories + "kcal");
}
}

public double calculateTotalCalories(){
double total = 0;

for (Food food :breakfast){
total += food.getCalories();
}

for (Food food :lunch){
total += food.getCalories();
}

for (Food food :dinner){
total += food.getCalories();
}

for (Food food :snacks){
total += food.getCalories();
}

return total;
}


public double calculateRemainingCalories(){

return dailyLimit - calculateTotalCalories();
}


public void displayMealPlan(){
System.out.println ("\n===== My Meal Plan =====");

System.out.println("\nBreakfast:");
for (Food food : breakfast){
food.displayDetails();
}

System.out.println("\nLunch");
for (Food food : lunch){
 food.displayDetails();
 }
 
 System.out.println("\nDinner");
for (Food food : dinner){
 food.displayDetails();
 }
System.out.println("\nSnacks");
for (Food food : lunch){
 food.displayDetails();
 }
 System.out.println("\n==================");
 System.out.println("Total Calories: " + calculateTotalCalories());
 System.out.println("Daily Limit: " + dailyLimit);
 System.out.println("Remaining Calories: " + calculateRemainingCalories());
 }
 
 public void removeFoodFromMeal(int foodId, int choice) {
  ArrayList<Food> selectedMeal = null;
  
  switch(choice){
  
  case 1:
  selectedMeal = breakfast;
  break;
  
  case 2:
  selectedMeal = lunch;
  break;
   
  case 3:
  selectedMeal = dinner;
  break;
  
  case 4:
  selectedMeal = snacks;
  break;
  
  default:
  System.out.println("Invalid Meal Choice");
  return;
  }
  
  for (int i = 0; i < selectedMeal.size(); i++){
   
   if (selectedMeal.get(i).getFoodId() == foodId){
   
   selectedMeal.remove(i);
   
   System.out.println("Food Removed successfully!");
   return;
   
   }
}

System.out.println("Food not found in selected meal");
}
   
  


 
}





