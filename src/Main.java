import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
	    Scanner userIn = new Scanner(System.in);

        int tempC;
        int tempF;

        System.out.println("Enter the temperature in Celsius: ");
        tempC = userIn.nextInt();

        tempF = tempC*9/5+32;

        System.out.println("The temperature " + tempC + "C, is now " + tempF + "F.");


    }
}
