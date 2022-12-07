import java.io.*;
import java.util.*;

public class java1 {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        int i = Integer.parseInt(in.nextLine());
        double d = Double.parseDouble(in.nextLine());
        String s = in.nextLine();
        
        System.out.println("Int: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);
    }
}