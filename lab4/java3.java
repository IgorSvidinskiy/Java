import java.util.Scanner;

public class java3 
{
    public static void main(String[]args)
    {
        System.out.printf("Please, enter a farengate temperature:\n");
        Scanner in = new Scanner(System.in);

        float F = in.nextFloat();
        float C = (F - 32) * 5/9;
        System.out.println(C);
    }
}