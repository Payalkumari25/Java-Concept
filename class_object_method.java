public class class_object_method{

    public static void main(String[] args){

        Person p1 = new Person();
        p1.name = "Payal";
        p1.age = 21;

        System.out.println(p1.age + " " + p1.name);

        Person p2 = new Person();
        p2.name = "Alia";
        p2.age = 3;

        System.out.println(p2.age + " " + p2.name);

        p1.walk(2);
        p2.eat();
        p2.walk();

        System.out.println(Person.walk(10));

    }
}

class Person{

    static String name;
    int age;

    void walk(){
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(name + " is eating");
    }

    static int walk(int step){
        System.out.println(name + " walked " + step + " steps");
        return step;
    }
}

