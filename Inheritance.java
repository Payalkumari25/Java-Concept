public class Inheritance {

    public static void main(String[] args)
    {
        Person p = new Person(23,"Anuj");
        
        Developer d = new Developer(20,"Payal");
        d.walk();

    }
}

class Developer extends Person {

    //Here super extends properties of parent class

    // if super don't find properties then it will to the parent of parent class

    // if super find its property in its own class then it don't go the parent
    
    public Developer(int age, String name){
        //super();
        super(age, name);
    }
    //super keyword is used in runtime polymorphism
    // Runtime Polymorphism 
    void walk(){
        System.out.println("Developer " + name + " is walking");
    }
}

class Person {

    String name;
    int age;

    public Person() {
        System.out.println("Default Constructor");
    }
    // this keyword is used in compileTime polymorphism
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    // Here it is compile time polymorphism 
    void walk(){
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println(name + " is eating");
    }
    // Here it is compile time polymorphism 
    void walk(int steps){
        System.out.println(name + " walked " + steps);
    }
}