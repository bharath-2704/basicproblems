package gitpost;
import java.util.Scanner;
public class TemperatureConversions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the tempreature:");
        int temperature=sc.nextInt();
        System.out.println(" select option which  temperature conversion do you want?");
        System.out.println("1. celcius to fahrenheit");
        System.out.println("2. fahrenheit to celcius");
        System.out.println("3. celcius to kelvin");
        System.out.println("4. kelvin to celcius");
        System.out.println(" enter your option:");
        int option=sc.nextInt();
        switch(option){
            case 1:
            float fahrenheit=(float)((temperature *9.0/5)+32);
            System.out.println("celsius temperatute :"+temperature+"C in fahrenheit  scale is"+fahrenheit+" f");
            break;
            case 2:
            float celcius=(float) ((temperature -32)*5.0/9);
            System.out.println("fahrenheit temperatute: "+temperature+"f  in celsius  scale is"+celcius+"C");
            break;
            case 3:
            int kelvin=temperature+273;
            System.out.println("celsius temperature :"+temperature+"C in kelvin Scale is: "+kelvin+"K");
            break;
            case 4:
            int kelvintocelcius=temperature-273;
            System.out.println("kelvin temperature :"+temperature+"K in celsius Scale is: "+kelvintocelcius+"C");
            break;
            default:
            System.out.println(" select the above options only");

        }

    }

    
}
