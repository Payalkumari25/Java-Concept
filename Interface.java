public class Interface implements  Car,Fly{

    public static void main(String[] args){


        Interface t = new Interface();
        t.start();
        t.fly();

    }

    @Override
    public void start() {
        System.out.println("My Car can start");
    }

    @Override
    public void fly() {
        System.out.println("My Car can fly");
    }
}
// Interface class have Bydefault public abstract before any method
// so we can say abstract method  cannot have body

// Any class implements interface then they need to override the abstract method
interface Car {
    void start();
}

interface Fly {

    void fly();
}


// Inside java we donot have multiple inheritance(multiple parent)
// due to diamond problem , show to overcome this we use interface