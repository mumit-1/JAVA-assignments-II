import java.util.Scanner;
public class Task2{
  public static void main (String [] args){
    Scanner obj = new Scanner(System.in);
    int n1=obj.nextInt();
    int n2=obj.nextInt();
    int max=0;
    int min=0;
    if(n1>n2) {
      max=n1;
      min=n2;
    }
    else {
      max=n2;
      min=n1;
    }
    int count=0;
    for(int i=min;i<=max;i++){
     int count2=0;
      for(int k=2;k<i;k++){
        if(i%k==0){
          count2++;
        }
      }
      if(count2==0){
        count++;
      }
    }
    System.out.println("There are "+count+" prime numbers between "+min+" and "+max);
  }
}