public class Food{
 
   private int foodId;
   private String foodName;
   private double calories;
   
   
   
  public Food(int foodId, String foodName, double calories){
   this.foodId=foodId;
   this.foodName=foodName;
   this.calories=calories;
    }
    public void displayDetails() {
    
    
    System.out.println("Food ID: " + foodId);
    System.out.println("Food Name:" + foodName);
    System.out.println("Calories:" + calories);
    }
    
    public void updateCalories(double newCalories){
    
    if(newCalories > 0){
    calories = newCalories;
    }else{
     System.out.println("Invalid Calorie value!:");
     }
     }
   public int getFoodId(){
   return foodId;
   }  
  
  
   public String getFoodName(){
   return foodName;
   }
   
   public double getCalories(){
   return calories;
   
   
                  }
   }
     
    
    