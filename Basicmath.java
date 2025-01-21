package gitpost;
import java.util.Scanner;
public class Basicmath {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the first number:");
        int num1=sc.nextInt();
        System.out.println(" enter the second number:");
        int num2=sc.nextInt();
        System.out.println(" 1. Addition");
        System.out.println(" 2.subtraction");
        System.out.println(" 3. multiplication");
        System.out.println(" 4.Division");
        System.out.println(" 5.modulo division");
        System.out.println(" 6.comparision(==)");
        System.out.println(" select option which operation to you perform:");
        int option=sc.nextInt();
        switch(option){
            case 1:System.out.println(" your result is:"+(num1+num2));
            break;
            case 2:System.out.println(" your result is:"+(num1-num2));
            break;
            case 3:System.out.println(" your result is:"+(num1*num2));
            break;
            case 4:System.out.println(" your result is:"+(num1/num2));
            break;
            case 5:System.out.println(" your result is:"+(num1 % num2));
            break;
            case 6:System.out.println(" your result is:"+(num1==num2));
            if(num1==num2){
                System.out.println(" both values are equal");
            }
            else{
                System.out.println(" both values are unequal");
            }
            break;
            default:
            System.out.println(" choose above options only");
        }


    }
    
}
