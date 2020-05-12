import java.util.Scanner;

public class Date
{
   public static void main(String[] args)
   {
      int day, month, year;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the date (day, month, year)");
      day = input.nextInt();
      month = input.nextInt();
      year = input.nextInt();
      input.close();
      
      /*if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day >= 1 && day <= 31))
      {
         System.out.println(day + "/" + month + "/" + year);
      }
      else
      {
         if((month == 4 || month == 6 || month == 9 || month == 11) && (day >= 1 && day <= 30))
         {
            System.out.println(day + "/" + month + "/" + year);
         }
         else
         {
            if(month == 2 && day >= 1 && day <= 28)
            {
               System.out.println(day + "/" + month + "/" + year);
            }
            else
            {
               System.out.println("Illegal date");
            }
         }
      }*/
      
      switch(month)
      {
         default: 
            System.out.println("Illegal date");
            break;
         case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            if(day >= 1 && day <= 31)
            {
               System.out.println(day + "/" + month + "/" + year);
            }
            else
            {
               System.out.println("Illegal date");
            }
            break;
         case 4: case 6: case 9: case 11:
            if(day >= 1 && day <= 30)
            {
               System.out.println(day + "/" + month + "/" + year);
            }
            else
            {
               System.out.println("Illegal date");
            }
            break;
         case 2:
            if(day >= 1 && day <= 28)
            {
               System.out.println(day + "/" + month + "/" + year);
            }
            else
            {
               System.out.println("Illegal date");
            }
            break;
      }
   }
}
