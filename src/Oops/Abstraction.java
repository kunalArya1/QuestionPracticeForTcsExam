package Oops;
 abstract  class  Car {
    abstract public void fuelType();
    abstract public void buildYear();

    public void start(){
        System.out.println("Car has Started");
    }

}
class Tata extends Car {
     public void fuelType(){
         System.out.println("Petrol");
     }
     public void buildYear(){
         System.out.println("Build year :- " + 2024);
     }
}

interface newCar {
     abstract public void fuelType();
     abstract public void buildYear();
     abstract public void start();
}
class Mahindra implements newCar{
     public void fuelType(){
         System.out.println("Petrol");
     }
     public void buildYear(){
         System.out.println("Build Year is :- "+2020);
     }
     public void start(){
         System.out.println("Mahindra Bolero Started");
     }
}

public class Abstraction {
    public static void main(String[] args) {
        Tata nexon = new Tata();
        nexon.buildYear();
        nexon.fuelType();
        nexon.start();
        Mahindra Bolero = new Mahindra();
        Bolero.buildYear();
        Bolero.fuelType();
        Bolero.start();

    }
}
