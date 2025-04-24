//Task-02
public class Passenger{
 public static int no_of_passenger;
 public static double total_fare;
 private String name;
 private double weight;
 private double distance;
 private double fare;
   public void storeBaggageWeight(double a){
      weight=a;
     fare+=(weight*10);
     total_fare+=(weight*10);
       
    }
 public Passenger(String a,double b){
        name=a;
        distance=b;
        fare+=((distance*20.0));
        
        no_of_passenger++;
        total_fare+=fare;
    }
  
    public void passengerDetails(){
        System.out.println("Name: "+name+" \nFare: "+fare+" TK");
    }
}