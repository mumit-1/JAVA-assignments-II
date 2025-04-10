//Task-03
public class Shape2D{
  public double areaResult;
  public String areaName="Square";
  public Shape2D(){
    areaResult=5.0*5.0;
    System.out.println("A Square has been created with length: 5");
  }
  public Shape2D(int a,int b,int c,String d){
    if(d.equals("rectangle")){
      areaResult=a*b;
      areaName=d;
      System.out.println("A Rectangle has been created with length: "+a+" and breadth:  "+b);
    }
    else if(d.equals("Triangle")){
      areaResult=a*b*0.5;
      areaName=d;
      System.out.println("A Triangle has been created with height: "+a+" and base:  "+b);
    }
    else{
     double s=((a+b+c)/2.0);
     areaResult=Math.sqrt(s * (s - a) * (s - b) * (s - c));
     areaName="Triangle";
     System.out.println("A Triangle has been created with the following sides: "+a+", "+b+", "+c);
    }
  }
  public Shape2D(int a,int b){
    this(a,b,0,"rectangle");
  }
  public Shape2D(int a,int b,String c){
    this(a,b,0,c);
  }
  public Shape2D(int a,int b,int c){
    this(a,b,c,"");
  }
  public void area(){
    
    System.out.printf("The area of the %s is: %.2f\n", areaName, areaResult);

  }
  
}