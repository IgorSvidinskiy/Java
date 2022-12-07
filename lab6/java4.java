import java.util.*;

public class java4 
{
    public static void main(String[]args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите длину комнаты:");
        int a = in.nextInt();
        System.out.println("Укажите ширину комнаты:");
        int b = in.nextInt();
        double S = a * b;
        System.out.println("Площадь всей комнаты = " + S + "\n");

        System.out.println("Укажите длину ковра:");
        int a1 = in.nextInt();
        System.out.println("Укажите ширину ковра");
        int b1 = in.nextInt();
        double S1 = a1 * b1;
        System.out.println("Площадь ковра, что закрывает пол комнаты в кв. сантиметрах = " + S1);

        double Sc1 = S1 / 10000;
        System.out.println("Площадь ковра в кв. метрах = " + Sc1);

        System.out.println("Укажите стоимость за кв. метр ковра:");
        int pc = in.nextInt();

        double cost = pc * Sc1;
        System.out.println("Итоговая цена ковра " + cost);
    }
}