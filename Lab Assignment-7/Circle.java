//Task-03
public class Circle extends Shape {
    public double areaResult;
    public int radius;
    public void area(){
      areaResult=3.1416*(radius*radius);
      System.out.printf("Area of Red Circle: %.2f\n", areaResult);
    }
}
