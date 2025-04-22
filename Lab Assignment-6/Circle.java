public class Circle{
    public static int count;
    private int radius;
    private double area;
    public Circle(int a){
        count++;
        radius=a;
    }
    public int getRadius(){
        return radius;
    }
    public double area(){
        return 3.1416*(radius*radius);
    }
}