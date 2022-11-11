
 
import java.util.Scanner;
 
/**
 * Java Program to print grade of a student
 */
public class grades {
    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.println("Geli tirda maadooyinka");
        count = scanner.nextInt();
 
        System.out.println("Geli dhibcaha maadooynka" + count + " oodhan");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("isugeynta dhibcuhu waa: " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
 
        /* Printing grade of a student using switch case statement */
        switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A+");
            break;
        case 8:
        case 7:
            System.out.println("Grade : A");
            break;
        case 6:
            System.out.println("Grade : B");
            break;
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
        }
    }
}