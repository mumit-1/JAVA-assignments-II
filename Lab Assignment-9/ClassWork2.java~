public class ClassWork2{
  public static String fun(String s, int n){
    if(s.length()==4){
      return n+s+n;
    } else if(n%2==0){
      System.out.println(s+n+n+3);
      return fun(s+n, n+3);
    } else {
      System.out.println(s+n+(n-1));
      return fun(s+n, n-1);
    }
  }
  public static void main(String[] args){
    String s = fun("",1);
    System.out.println(s);
  }
}

