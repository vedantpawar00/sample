import java.util.Scanner;

public class If
{
    public static void main(String args[])
    {
        try (Scanner var = new Scanner(System.in)) {
            System.out.println("Enter any 3 numbers : ");

            int a=var.nextInt();
            int b=var.nextInt();
            int c=var.nextInt();

            if(a>b&&a>c)
            System.out.println(a+" is greatest number.");

            else
                if(b>a&&b>c)
                System.out.println(b+" is greatest number.");

            else
            System.out.println(c+" is greatest number.");
        }

    }

}