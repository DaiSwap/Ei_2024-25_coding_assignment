package Excersize1.CreationalDesignPattern.CreationalFactoryDesignPattern;

//Concrete Product
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a truck.");
    }
}
