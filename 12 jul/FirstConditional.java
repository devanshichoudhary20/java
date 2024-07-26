import java.util.Scanner;

public class FirstConditional {
    public static void main(String[] args){
        //creating a scanner object and initializing it also attaching the source i.e. console input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter an integer");
        int number = scanner.nextInt();
        //conditional statement
        if(number>100){
            System.out.println("Number=" +number);
        }
        System.out.println("ThankYou");

    }
    
}
