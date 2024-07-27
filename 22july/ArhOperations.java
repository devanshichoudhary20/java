//wap to accept perimeter of circle from user and print radius
import java.util.Scanner;

public class ArhOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the perimeter of circle");
        double perimeter = scanner.nextDouble();
        double radius;
         radius = perimeter/(2*3.14);
         System.out.println("the radius is" + radius);



    }
    
}
