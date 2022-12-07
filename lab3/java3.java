public class java3 
{
    public static void main(String[]args)
    {
        int SecondsPerMinute = 60;
        int MinutesPerHour = 60;
        int HoursPerDay = 26;
        int DaysPerWeek = 7;

        System.out.printf("Количество минут в неделе:\n");
        System.out.println(SecondsPerMinute * MinutesPerHour * HoursPerDay * DaysPerWeek);
    }
}