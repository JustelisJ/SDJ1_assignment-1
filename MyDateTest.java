import java.util.Scanner;
public class MyDateTest
{

   public static void main(String[] args)
   {
      int day, month, year;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a date (dd mm yyyy)");
      day = input.nextInt();
      month = input.nextInt();
      year = input.nextInt();
      input.close();
      
      MyDate date1 = new MyDate(day, month, year);
      MyDate date2 = new MyDate(day, month, year);
      
      System.out.println(date1);
      System.out.println(date2);
      
      date1.set(20, 25, 1684);
      date2.set(55, 12, 2000);
     
      System.out.println(date1);
      System.out.println(date2);
   }

}
