import java.util.*;

public class java5 
{
    public static void main(String[]args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько у вас монет по 50 копеек");
        int a = in.nextInt();
        double a1 = a * 50;
        System.out.println("Сколько у вас монет по 10 копеек");
        int b = in.nextInt();
        double b1 = b * 10;
        System.out.println("Сколько у вас монет по 5 копеек");
        int c = in.nextInt();
        double c1 = c * 5;
        System.out.println("Сколько у вас монет по 1 копейке");
        int d = in.nextInt();
        double d1 = d * 1;
        double Summ1 = a1 + b1 + c1 + d1;
        double Summ = a + b + c + d;
        System.out.println("Общее количество копеек = " + Summ);
        System.out.printf("Общая сумма копеек = " + Summ1);
    }
}
