public class Car extends Vehicle {
    public String model;
    public int doors;
    public boolean ai;

    public Car(String a,String b,int c,int d,int e,boolean f){
        super(a,c);
        setWheels(e);
        model=b;
        doors=d;
        ai=f;
    }
    public String toString(){
        String a = "Car " + super.toString() + ", Model: "+model+", Doors: "+doors+", AI: "+ai;
        return a;
    }
    
    public void startAutoPilot(){
        if(ai==true){
            System.out.println(super.getBrand()+" "+model+" AutoPilot Started");
        }
        else{
            System.out.println(super.getBrand()+":"+model+" has NO AutoPilot");
        }
    }
}