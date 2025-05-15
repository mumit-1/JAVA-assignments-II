public class Bike extends Vehicle {
    public String model;
    public boolean sideCar;

    public Bike(String a,String b,int c,int d,boolean f){
        super(a,c);
        setWheels(d);
        model=b;
        sideCar=f;
    }
    public String toString(){
      String a = "bike " + super.toString() + ", Model: "+model+", Sidecar: "+sideCar;
        return a;
    }
    public void doAWheelie(){
        if(sideCar==true) System.out.println("Wheelie Failed. "+super.getBrand()+":"+model+" has SideCar");
        else System.out.println(super.getBrand()+":"+model+" is doing Wheelie!!");
    }
}