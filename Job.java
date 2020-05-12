
public class Job
{
   private String title;
   private double salary;
   private String employee;
   
   public Job(String title, double salary, String employee)
   {
      this.title = title;
      this.salary = salary;
      this.employee = employee;
   }
   
   public Job(String title, double salary)
   {
      this.title = title;
      this.salary = salary;
      employee = null;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public double getSalary()
   {
      return salary;
   }
   
   public String getEmployee()
   {
      return employee;
   }
   
   public void setSalary(double salary)
   {
      this.salary = salary;
   }
   
   public boolean isAvailable()
   {
      if(employee == null)
         return true;
      else
         return false;
   }
   
   public void hire(String employee)
   {
      this.employee = employee;
   }
   
   public void fire()
   {
      employee = null;
   }
}
