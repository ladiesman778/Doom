import java.util.ArrayList;
 public class FoodDatabase{
  
  private ArrayList<Food> foods;
  private int nextFoodId;
  

public FoodDatabase(){
 foods = new ArrayList<>();
 nextFoodId  = 1;
 
  loadDefaultFoods();
}



public void loadDefaultFoods() {

addFood("Boiled Egg(Large)", 78);
addFood("Cooked White Rice(100gms)", 130);
addFood("Cooked Chicken Breast(100gms)", 165);
addFood("Banana(Medium)", 105);
addFood("Apple(Medium)", 95);
addFood("Cooked Oatmeal (100gms)", 68);
addFood("Grilled Fish(100gms)", 150);
addFood("Wheat Bread(1 slice)", 80);
addFood("Orange (1 medium)", 62);
addFood("Milk (1 cup)", 149);
addFood("Almonds (28 g)", 164);
addFood("Peanut Butter (1 tablespoon)", 94);
addFood("Potato, baked (1 medium)", 161);
addFood("Broccoli, cooked (1 cup)", 55);
addFood("Pasta, cooked (1 cup)", 200);
addFood("Plain Yogurt (100 g)", 61);
}
private void addFood(String name, double calories){

Food newFood = new Food(nextFoodId, name, calories);
foods.add(newFood);
nextFoodId++;
}

public void displayFoods(){

System.out.println("\n===== Available Foods =====");

for  (Food food : foods) {
food.displayDetails();

System.out.println("----------------");
      }
  }
  
  public void addCustomFood(String name, double calories){
   if (name == null || name.trim().isEmpty()){
    System.out.println("Invalid food name!");
    return;
    }
    
    if (calories <= 0) {
    System.out.println("Calorie Cannot Be Zero, Invalid!");
    return;
    }
    
    
    addFood(name, calories);
    
     System.out.println("Custom food added succesfully!");
     }
     public Food findFoodById(int id){
     for (Food food : foods){
     
     if(food.getFoodId() == id) {
     return food;
     }
 }
 return null;
            }
}
     












  
  
