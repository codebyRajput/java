class Vehicle {
    String brand;
    int year;
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle {
    String color;
    public Car(String brand, int year, String color) {
        super(brand, year);
        this.color=color;
    }

    void displayCar() {
        System.out.println("color of car is  " + color);
        display(); 
    }
}

class SportsCar extends Car {
    boolean isConvertible;
    public SportsCar(String brand, int year, String color, boolean isConvertible) {
        super(brand, year, color);
        this.isConvertible = isConvertible;
    }
    void displaySportsCar() {
        System.out.println("Convertible: " + isConvertible);
        displayCar(); 
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ferrari", 2023, "blue", true);
        System.out.println("Sports Car Information:");
        sportsCar.displaySportsCar();
    }
}
