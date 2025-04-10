// Task-02
public class Toy{
 public String name;
 public int price;
 public Toy(String a,int b){
   name=a;
   price=b;
   System.out.println("A new toy has been made!");
 }
 public void updatePrice(int a){
   price=a;
 }
 public void updateName(String a){
   System.out.println("Changing old name: "+name);
   name=a;
   System.out.println("New name: "+name);
 }
 public void showPrice(){
   String a= "Price: "+price+" Taka";
   System.out.println(a);
 }
}