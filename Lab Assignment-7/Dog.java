public class Dog extends Animal{
    public String name;
    public String getName(){
        return name;
    }
    public void updateSound(String a){
        sound=a;
    }
    public Dog(){
        System.out.println("The dog says hello!");
    }
}
