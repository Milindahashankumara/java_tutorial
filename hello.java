 import java.util.Scanner ;

 public class hello{

    public static void main(String[] args){

        Scanner sun = new Scanner(System.in);
        double num1,num2,ans;

        System.out.println("Enter first Num: ");
        num1 = sun.nextDouble();

        System.out.println("Enter second Num: ");
        num2 = sun.nextDouble();

        ans = num1 + num2;


        System.out.print("Answer is: " + ans);
       

    }
 }