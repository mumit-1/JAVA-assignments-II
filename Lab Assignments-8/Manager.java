public class Manager extends Employee{
    public double bonus;
    public double total;
    public Manager(String a,int b,int c,int d){
        super(a,(double)b,c);
        bonus=d;
        total=b;
    }
    public void calculateSalary(){
        if(super.getHoursWorked()>40){
            total= (bonus/100.0)*super.getBaseSalary() + super.getBaseSalary() ;
       }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: "+bonus+" %\nFinal Salary: $"+total);
    }
    public void requestIncrement(int a){
        if(super.getHoursWorked()>80){
            if(super.getHoursWorked()>100){
                double x = super.getBaseSalary();
                System.out.println("$"+a+" Increment approved.");
                
                super.setBaseSalary(a+x);
            }
            else{
                double x = super.getBaseSalary();
                System.out.println("$"+(a/2)+" Increment approved.");
                
                super.setBaseSalary(((double)a/2.0)+x);
            }

        }
        else{
            System.out.println("Increment denied.");
        }
    }
}