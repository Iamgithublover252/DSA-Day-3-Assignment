import java.util.Scanner;

public class age
{
    public static void main(String[] args)
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Geli da'daada=");
        age = sc.nextInt();
        if (age >= 18)
        {
            System.out.println("waad uqalantaa inaad codayso.");
        }
        else
        {
            System.out.println("uma qalantid inaad codaysid.");
        }
    }
}