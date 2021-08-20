import java.util.*;

public class Basic{

    public static void main(String[] args){

        //Premitive datatype
        // int marks = 100;
        // float average = 8.5f;
        // char grade = 'A';
        // String name = "Payal";
        // boolean isValid = true;
        // long bigNumber = 77467843982202l;
        // System.out.println(marks);
        // System.out.println(average);

        // Arithemetic operation
        // int a = 12;
        // System.out.println(a++);  // increment the current value in next step
        // System.out.println(a);
        // System.out.println(++a); // increment the current value in current step
        // System.out.println(a); 

        // Take User Input
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the age");
        // int a = sc.nextInt();
        // System.out.println(a);
        // System.out.println("Enter the name");
        // System.out.println();
        // String name = sc.nextLine();
        // System.out.println(name);

        //Arrays

        // int arr[] = new int[5];
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt(); 
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        
        int a[] =  {10,20,30};
        try{
            System.out.println(a[5]);
        }catch(Exception e){
            System.out.println("Error");
            System.out.println(e.getLocalizedMessage());
        }
        
        System.out.println(average(10,80));
    }

    static int average(int a, int b){

        int s = a+b;
        return s/2;
    }
}
