package edu.jalc.trumpet.brand;

public class Style {

   private int modelNumber = 33495;

   private Style() {
      modelNumber = 33495;
   }
   
   public Style(int model){
      model = modelNumber;
   }
   
   public int getModelNumber(){
      return modelNumber;
   }
}