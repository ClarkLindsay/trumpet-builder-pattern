package edu.jalc.trumpet.materialProperties.etching;

public class Etching {

   private int design;

   private Etching() {
      design = 0;
   }
   
   public Etching(int design){
         setDesign(design);
   }
   
   public void setDesign(int design){
      this.design = design;
   }
   
   public int getDesign(){
      return design;
   }
}