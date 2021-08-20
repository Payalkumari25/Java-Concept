public class Encapsulation{

    public static void main(String[] args){

        laptop l1 = new laptop();
        l1.setPrice(100000);
        l1.setRam(16);
        System.out.println("Laptop Price : " + l1.getPrice());
        System.out.println("RAM is " + l1.getRam());
        

    }
}

// Public : Can be access from anywhere

// Protected : Can only be access by child class of any package

// Private : Can be accessed within the class 

// default : Can be accessed within the package



class laptop {

    private int ram;
    private int price;

    public void setPrice(int price){
        //  It is user admin
        boolean admin = true;
        if(!admin){
            System.out.println("You can not set price");
        }else{
            this.price = price;
        }    
    }

    public int getPrice(){
        return price;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public int getRam(){
        return ram;
    }

    


}