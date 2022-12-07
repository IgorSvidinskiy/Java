import java.io.*;
import java.util.*;

public class java2 
{
    public static void main(String args[])throws FileNotFoundException
    {
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "sgt.Smith" + separator + "Development" + separator +"Java" + separator +"lab6" + separator + "file.txt";
        File f1 = new File(path);

        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter a first name");
        String s1 = in.nextLine();
        System.out.println("Please, enter a family name");
        String s2 = in.nextLine();
        
        Scanner scanner = new Scanner(f1);
        while(scanner.hasNextLine()){System.out.println("\n" + scanner.nextLine());}
        scanner.close();
    }
}
