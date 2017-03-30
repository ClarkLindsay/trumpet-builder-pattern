package edu.jalc.trumpet.materialProperties.etching;

public class Etching implements Etchable{

   private int design;

   private Etching() {
      design = 0;
   }
   
   public Etching(int design){
         setDesign(design);
   }
   
   public void etch(){System.out.println("I'm etching");}
   
   public void setDesign(int design){
      this.design = design;
   }
   
   public int getDesign(){
      return design;
   }
}