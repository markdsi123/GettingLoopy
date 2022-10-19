import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int celsius = 0;
        double fahrenheit = 0;
        String trash = "";

        do {
            System.out.println("\nEnter the temperature in Celsius: ");
            if (in.hasNextInt())
            {
                celsius = in.nextInt();
                in.nextLine();
                fahrenheit = (celsius * 1.8) + 32;
                System.out.println("The equivalent temperature in Fahrenheits is: " + fahrenheit);
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }
        while (trash != in.nextLine());
    }
}