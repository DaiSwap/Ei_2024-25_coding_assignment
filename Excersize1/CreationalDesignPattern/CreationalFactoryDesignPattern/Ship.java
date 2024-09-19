package Excersize1.CreationalDesignPattern.CreationalFactoryDesignPattern;

//Concrete Product
public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a ship.");
    }
}
