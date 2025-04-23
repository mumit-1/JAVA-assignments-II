public class Cargo{
  public static double total = 10.00;
  public static int count = 1;
  public int id;
    private String name;
    private double weight;
    private boolean status;
  public static double capacity(){
    return total;
  }
    public Cargo(String a,double b){
        name=a;
        weight=b;
        id=count;
        count++;
    }
    public void details(){
        System.out.println("Cargo ID: "+id+", Contents: "+name+", Weight: "+weight+", Loaded: "+status);
    }
    public void load(){
        if(total>=weight){

        status=true;
        total-=weight;
        System.out.println("Cargo "+id+" loaded for transport.");
        }
        else{
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }
    public void unload(){
        status=false;
        total+=weight;
        System.out.println("Cargo "+id+" unloaded.");
    }
}