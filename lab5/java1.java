import java.util.Scanner;

public class java1 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String s =in.nextLine();
        float f = Float.parseFloat(s);
        int i = Math.round(f);
        System.out.println(i);
    }
}