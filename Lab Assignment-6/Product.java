//Task-01
public class Product{
  private String name="Unknown";
  private double price=0.0;
  private int quantity;
  public Product(String a,double b){
    name=a;
    price=b;
  }
    public Product(){

  }
  public void displayInfo(boolean a){
   if(a==true) System.out.println("Product Name: "+name+" \nPrice: $"+price+" \nQuantity: "+quantity);
   else System.out.println("Product Name: "+name+" \nPrice: $"+price);
  }
  public void displayInfo(){
   displayInfo(false);
  }
  public void setQuantity(int a){
   quantity=a;
  }
  
  public int getQuantity(){
   return quantity;
  }
  
  public double getPrice(){
   return price;
  }
}