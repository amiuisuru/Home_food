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
public class meat_and_fish {
     private  int Meat_or_FishId ;
    private  String Name_of_the_Meat_or_Fish;
    
    public meat_and_fish(int Meat_or_FishId ,String Name_of_the_Meat_or_Fish){
    
    this.Meat_or_FishId =Meat_or_FishId ;
    this.Name_of_the_Meat_or_Fish=Name_of_the_Meat_or_Fish;
     }
    
    public int getMeat_or_FishId (){
    return Meat_or_FishId ;
    }
    public String getName_of_the_Meat_or_Fish(){
    return Name_of_the_Meat_or_Fish;
    }  
}
