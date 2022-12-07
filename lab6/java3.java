import java.util.*;

public class java3 
{
    public static void main(String[]args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите длину комнаты");
        float a = in.nextFloat();
        System.out.println("Укажите ширину комнаты");
        float b = in.nextFloat();
        float S = a * b;
        System.out.println("Площадь пола комнаты, что закрывается ковром = " + S + "\n");
    }
}
