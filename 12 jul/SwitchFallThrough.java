public class SwitchFallThrough {
    //finding whether the given monthnis having 30 or31 or 29/28 days
import java.util.Scanner;
public class Switch {
    public static void main (String[] args){
        System.out.println("choose the month from the given list");
        System.out.println("1--> January");
        System.out.println("2--> February");
        System.out.println("3--> March");
        System.out.println("4--> April");
        System.out.println("5--> May");
        System.out.println("6--> June");
        System.out.println("7--> July");
        System.out.println("8--> August");
        System.out.println("9--> Septmber");
        System.out.println("10--> October");
        System.out.println("11--> November");
        System.out.println("12--> December");

        Scanner scanner = new Scanner(System.in);
        int Month = scanner.nextInt();
        switch(Month){
            case 1:        
            
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            System.out.println("31 days");
            break;
            case 4:
            System.out.println("30 days");
            break;
            
            System.out.println("31 days");
            break;
            case 6:
            System.out.println("30 days");
            break;
           
            System.out.println("31 days");
            break;
            case 8:
            System.out.println("30 days");
            break;
            
            System.out.println("31 days");
            break;
            case 10:
            System.out.println("30 days");
            break;
            
            System.out.println("31 days");
            break;
            case 12:
            System.out.println("30 days");
            break;
            default:
            System.out.println("invalid option");
        }


    }
    
}

    
}
