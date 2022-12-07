import java.util.Scanner;

class java1 
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
        System.out.println("Please, enter a first name");
        String s1 = in.nextLine();
        System.out.println("Please, enter a family name");
        String s2 = in.nextLine();
        System.out.println(s1 + s2);
    }
}