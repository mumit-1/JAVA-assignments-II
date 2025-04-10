import java.util.Scanner;
public class Task3{
  public static void main(String [] args){
    Scanner obj = new Scanner (System.in);
    String n1 = obj.nextLine();
    String n2 = obj.nextLine();
    int sum = 0;
    for(int i=0;i<n1.length();i++){
      sum+= (int) n1.charAt(i);
    }
     for(int i=0;i<n2.length();i++){
      sum+= (int) n2.charAt(i);
    }
     System.out.println(n1+" "+n2);
     System.out.println(sum);
  }
}