import java.util.Scanner;

public class DoWhile {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int sum = 0;
        int userInput;
        int count = 0;
        do{
            System.out.println("enter an integer for sum");
            userInput = scanner.nextInt();
            if (userInput <= 100){
            sum = sum + userInput;
        }
        else{
            count++;
        }
        while (userInput != 0 );
        System.out.println("sum" + sum);
    }
        }
    
}
