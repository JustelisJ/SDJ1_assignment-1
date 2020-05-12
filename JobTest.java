
public class JobTest
{

   public static void main(String[] args)
   {
      Job person1 = new Job("the builder", 1679.48, "Bob");
      Job person2 = new Job("driver", 6553.85);
      
      
      
      System.out.println(person1.getEmployee() + " " + person1.getTitle() + " " + person1.getSalary());
      
      
      
      System.out.println(person2.getSalary());
      person2.setSalary(1197.55);
      System.out.println(person2.getSalary());
      
      
      
      if(person1.isAvailable())
      {
         System.out.println(person1.getTitle() + " is available");
      }
      else
      {
         System.out.println(person1.getTitle() + " is not available");
      }
      if(person2.isAvailable())
      {
         System.out.println(person2.getTitle() + " is available");
      }
      else
      {
         System.out.println(person2.getTitle() + " is not available");
      }
      
      
      
      person1.fire();
      person2.hire("Gas");
      
      
      
      if(person1.isAvailable())
      {
         System.out.println(person1.getTitle() + " is available");
      }
      else
      {
         System.out.println(person1.getTitle() + " is not available");
      }
      if(person2.isAvailable())
      {
         System.out.println(person2.getTitle() + " is available");
      }
      else
      {
         System.out.println(person2.getTitle() + " is not available");
      }
   }

}
