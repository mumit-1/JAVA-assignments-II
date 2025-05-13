public class Pokemon{
  public String name;
  public Pokemon(String a){
    name=a;
  }
  public void attack(){
    System.out.println("Pikachu attacks with a basic move!");
  }
  public void attack(String a){
   System.out.println("Pikachu uses "+a+"!");
  }
   public void attack(String a,int b){
     System.out.println("Pokemon uses "+a+" with power "+b+"!");
  }
} 