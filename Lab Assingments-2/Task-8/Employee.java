public class Employee{
  public String name;
  public double Salary = 30000.0;
  public String designation = "junior";
  public void newEmployee(String a){
    name=a;
  }
   public void displayInfo(){
    System.out.println("Employee Name: "+name);
    System.out.println("Employee Salary: "+Salary);
    System.out.println("Employee Designation: "+designation);
   }
   public void calculateTax(){
     double tax = 0.0;
     if(Salary>50000.0){
//      tax = ;
     
      System.out.println(name+" Tax Amount: "+Salary*(30.0/100.0)+" Tk");
     }
     else if(Salary>30000.0){
//      tax = ;
     
      System.out.println(name+" Tax Amount: "+Salary*(10.0/100.0)+" Tk");
     }
     else{
      System.out.println("No need to pay tax");
     }
   }
   public void promoteEmployee(String a){
     int sum=0;
     for(int i=0;i<a.length();i++){
       sum+= (int) a.charAt(i);
     }
     //lead
     if(sum==406){
       Salary+=50000.0;
     }
     //manager
     else if(sum==731){
       Salary+=75000.0;
     }
     //senior
     else if(sum==656){
       Salary+= 25000;   
     }
       System.out.println(name+" has been promoted to "+a);
       System.out.println("New Salary: "+Salary+" Tk");
   }
}




