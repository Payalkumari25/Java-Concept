public class javaConstructor{

    public static void main(String[] args){

        Person p1 = new Person();
        p1.name = "Payal";
        p1.age = 21;

        // p1.walk();
        // p1.walk(5);
        

        Person p2 = new Person(10,"Lado");

        p2.walk();
        p2.walk(2);
        System.out.println(Person.count);



    }
}

// Using static keyword we can access the member  directly by class name
// Whereas without using static keyword we can access the member by creating the object of that class
// this() keyword is used in 2ways : 
// 1.Call another constructor in the same class
// 2. access member of the same class
class Person{

    String name;
    int age;
    
    static int count;

    public Person() {
        count++;
        System.out.println("Default Constuctor");
    }

    public Person(int age, String name){
        this();  // calling another constructor
        this.age = age;  // access parameter of same class
        this.name = name;
        System.out.println("Parametized Constuctor");
    }

    void walk(){
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println( name + " is eating");
    }

    void walk(int steps){
        System.out.println(name + " walked " + steps); 
    }


}