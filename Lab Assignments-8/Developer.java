public class Developer extends Employee{
    public String dev;
    public double total;
 public Developer(String a,int b,int c,String d){
    super(a,b,c);
    dev=d;
   
 }
     public void calculateSalary(){
        if(dev.equals("Java")){
            total= 700 + super.getBaseSalary() ;
       }
       else{
        total=super.getBaseSalary() ;
       }
    }
        public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: "+dev+" \nFinal Salary: $"+total);
    }
}