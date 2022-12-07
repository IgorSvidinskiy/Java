import java.util.Scanner;

public class java4 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a distance:");
        float S = in.nextFloat();
        System.out.println("Enter a speed moving:");
        float V = in.nextFloat();
        System.out.println("Enter a ETA:");
        float t = in.nextFloat();

        if(t <= 0){t = S / V; System.out.printf("ETA is " + t + " hours");}
        else if(S <= 0){S = V * t; System.out.printf("Distance is " + S + " km");}
        else if(V <= 0){V = S / t; System.out.println("Speed is " + V + " km/h");}
    }
}