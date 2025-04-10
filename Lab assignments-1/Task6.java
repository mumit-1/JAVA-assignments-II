import java.util.Scanner;
public class Task6{
  public static void main(String [] args){
    System.out.print("N=");
    Scanner obj = new Scanner (System.in);
    int n = obj.nextInt(); 
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = obj.nextInt();
    }
    for(int i=0;i<n;i++){
      int count =0;
      for(int k=(i+1);k<n;k++){
        if(arr[i]!=-99999999 && arr[i] == arr[k]){
          count++;
          arr[k]=-99999999;
        }
      }
      if(arr[i]!=-99999999){
      System.out.println(arr[i]+" - "+(++count)+" Times"); 
      }
    }
  }
}