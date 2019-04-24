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
public class order {
     private  int  customerId,vegetableId1,vegetableId2,vegetableId3,vegetableId4, meat_and_fishId ,riceId,dessertId  ,Quntity;
      private String  date ,  time;
     
     public order(int customerId ,int vegetableId1,int vegetableId2,int vegetableId3,int vegetableId4,
                 int meat_and_fishId ,int riceId  ,int dessertId ,String date,String time,int Quntity){
      
     this.customerId=customerId;
     this.vegetableId1=vegetableId1;
     this.vegetableId2=vegetableId2;
     this.vegetableId3=vegetableId3;
     this.vegetableId4=vegetableId4;
     this.meat_and_fishId=meat_and_fishId;
     this.riceId=riceId;
     this.dessertId=dessertId;
     this.date=date;
     this.time=time;
     this.Quntity=Quntity;
     
     }
     
     
     
    public int getcustomerId(){
    return  customerId;
    }
    public int getvegetableId1(){
    return vegetableId1;
    } 
    public int getvegetableId2(){
    return vegetableId2;
    } 
    public int getvegetableId3(){
    return vegetableId3;
    } 
    public int getvegetableId4(){
    return vegetableId4;
    }
    public int getmeat_and_fishId(){
    return meat_and_fishId;
    }
     public int getriceId(){
    return riceId;
    }
    public int getdessertId(){
    return dessertId;
    }
    public String getdate(){
    return date;
    }
    public String gettime(){
    return time;
    }
    public int getQuntity(){
    return Quntity;
    }
}
