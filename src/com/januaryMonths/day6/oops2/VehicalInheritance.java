package com.januaryMonths.day6.oops2;

class VehicalM {
   protected String brand = "TATA";
   public void honk() {
       System.out.println("AAAAAAAA, BBBBBBBB");
   }
}
public class VehicalInheritance extends VehicalM {

    private String modelName = "AVIYA";

    public static void main(String[] args) {
        VehicalInheritance car = new VehicalInheritance();
        car.honk();

        System.out.println(car.brand + " " + car.modelName);
    }
}
