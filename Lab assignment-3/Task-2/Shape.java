public class Shape {
  public double result;
  public String shape;
  public void setParameters(String a, double b){
    shape=a;
    result = 3.1416 * (b*b);
  }
  public void setParameters(String a, double b,double c){
      shape=a;
     if(shape.equals("Triangle")){
       result = 0.5 * b * c;
     }
     else{
       result = b * c;
     }
  }
  public String details(){
    String a = "Shape Name: "+shape+"\n"+"Area :"+result;
    return a;
  }
}