import java.util.Scanner;

public class DoWhile {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int sum = 0;
        int userInput;
        do{
            System.out.println("enter an integer for sum");
            userInput = scanner.nextInt();
            sum = sum + userInput;
        }
        while (userInput != 0);

        }
    
}
