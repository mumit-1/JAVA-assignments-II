import java.util.Scanner;
public class Task1{
  public static void main(String [] args){
    Scanner obj = new Scanner(System.in);
    int max =-99999;
    int min=9999;
    int sum=0;
    for(int i=0;i<=10;i++){
      int n = obj.nextInt();
      if(n%2!=0){
        if(n>max){
          max=n;
        }
        if(n<min){
          min=n;
        }
        sum+=n;
      }
    }
    if(sum>0){
      int avg = 0;
      avg=sum/10;
       System.out.println("Sum = "+sum);
        System.out.println("Maximum = "+max);
         System.out.println("Minimum = 5"+min);
          System.out.println("Average = "+avg);
    }
    else{
      System.out.print("No odd positive numbers found");
    }
  }
}