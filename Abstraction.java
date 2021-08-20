public class Abstraction {

    public static void main(String[] args){

        // Car c1 = new Car();
        // c1.start();

        Audi a = new Audi();
        a.start();
        a.wheels();

        BMW b = new BMW();
        b.start();
        b.wheels();

    }
}

class Audi extends Car {

    @Override
    void start() {
        System.out.println("Audi is starting");
    }
} 

class BMW extends Car {

    @Override
    void start() {
        System.out.println("BMW is starting");
    }
}

// Abstract class cannot be instantiated (object created)

// Abstract method cannot have a body 

// If u make any method abstract, then it is necessary to make that class as abstract

// In Abstract class, u can make both abstract as well as non abstract methods

// Any class extends Abstract class, then they need to override abstract method
abstract class Car {
    int price;
    abstract void start();

    void wheels(){
        System.out.println("4 wheels");
    }
    
}