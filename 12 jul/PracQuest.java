//wap to accept marks of 3 subjects from the user based on the condition print the grade scored.conditions:
// grade A if per is abpve 90
//grade B if per above 80
//grade C if per above 70
//grade D if per above 60
//for all other per print no grade allocated
//use proper class name,use meaningful names for variables,use proper spacing

import java.util.Scanner;

public class PracQuest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks scored in sub1");
        double marksPhy = scanner.nextInt();//can be more meaningful
        System.out.println("enter the marks scored in sub2");
        double marksMat = scanner.nextInt();
        System.out.println("enter the marks scored in sub3");
        double marksChem = scanner.nextInt();
        double avgMarks ;
        avgMarks = (marksPhy + marksMat + marksChem )/ 3; //logical error, marks3 will be divided by 3 first then addition will happen
        if (avgMarks >= 90 && avgMarks <= 100) {
            System.out.println("you scored grade A  " + avgMarks);            
        }
        else if (avgMarks >=80 && avgMarks <=90) {
            System.out.println("you scored grade B  " + avgMarks);
            
        } 
        else if (avgMarks >=70 && avgMarks <=80) {
            System.out.println("you scored grade C  " + avgMarks);
            
        } 
        else if(avgMarks >=60 && avgMarks <=70){
            System.out.println("you scored grade D  " + avgMarks);
        }
        else if(avgMarks >=0 && avgMarks <=60){
            System.out.println("no grade alloted  " + avgMarks);

            
        }
    }


















































































































































































































































    
}
