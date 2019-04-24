/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_food_software;

/**
 *
 * @author isuru udana
 */
public class daily_need_nutrition {
    private  String nutrition_name; 
    private  int daily_need_quantity;
    
    
    public daily_need_nutrition(String nutrition_name  ,int daily_need_quantity){
    
    this.nutrition_name =nutrition_name ;
    this.daily_need_quantity=daily_need_quantity;
     }
    
    public String getnutrition_name (){
    return nutrition_name ;
    }
    public int getdaily_need_quantity(){
    return daily_need_quantity;
}
}