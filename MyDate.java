
public class MyDate
{
   private int month, day, year;
   
   public MyDate(int day, int month, int year)
   {
      set(day, month, year);
   }
   
   public int getMonth()
   {
      return month;
   }
   public int getDay()
   {
      return day;
   }
   public int getYear()
   {
      return year;
   }
   
   public void set(int day, int month, int year)
   {
      this.year = year;
      switch(month)
      {
         default: 
            this.month = 1;
            if(day >= 1 && day <= 31)
               this.day = day;
            else
               this.day = 1;
            break;
            
         case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            if(day >= 1 && day <= 31)
            {
               this.month = month;
               this.day = day;
            }
            else
            {
               this.month = month;
               this.day = 1;
            }
            break;
            
         case 4: case 6: case 9: case 11:
            if(day >= 1 && day <= 30)
            {
               this.month = month;
               this.day = day;
            }
            else
            {
               this.month = month;
               this.day = 1;
            }
            break;
            
         case 2:
            if(day >= 1 && day <= 28)
            {
               this.month = month;
               this.day = day;
            }
            else
            {
               this.month = month;
               this.day = 1;
            }
            break;
      }
   }
   public String toString()
   {
      return day + "/" + month + "/" + year;
   }
}
