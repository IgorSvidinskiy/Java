import java.util.Scanner;

public class formatout
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1 = sc.next();
                int x = sc.nextInt();
                System.out.printf(s1 + "\t\t" + "%03d\n", x);
            }
            System.out.println("================================");
    }
}