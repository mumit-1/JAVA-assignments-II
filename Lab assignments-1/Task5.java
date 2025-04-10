import java.util.Scanner;
public class Task5{
  public static void main(String [] args){
    Scanner obj = new Scanner (System.in);
    System.out.print("Enter the length of the array:");
    int n = obj.nextInt();
    int[] arr1 = new int[n];
    for(int i=(n-1);i>=0;i--){
      
      arr1[i]=obj.nextInt();
    }
    for(int i=0;i<n;i++){
      System.out.print(arr1[i]+" ");
    }
    System.out.println(" ");
  }
}