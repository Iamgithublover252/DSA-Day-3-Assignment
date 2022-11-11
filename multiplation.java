import java.util.Scanner;
public class multiplation{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
// create scanner object

System.out.print("Geli lambarka koowaad: ");

int num1=sc.nextInt();
//this method reads value for num1 providing by user

System.out.print("Geli lambarka labaad: ");

int num2=sc.nextInt();
//this method reads value for num2 providing by user

sc.close();//closing the scanner class

calcProduct(num1,num2); //calling the method

}
//calcTotal method
public static void calcProduct(int x,int y){
    int result=0;
result=x*y;
System.out.println("natiijadu waa   "+result);


}
}