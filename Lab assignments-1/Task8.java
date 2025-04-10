import java.util.Scanner;
public class Task8{
  public static void main(String [] args){
   Scanner obj = new Scanner (System.in);
   System.out.print("Row: ");
   int row = obj.nextInt();
   System.out.print("Column: ");
   int col = obj.nextInt();
   int[][] arr2D = new int[row][col];
   for(int i=0;i<arr2D.length;i++){
     for(int k=0;k<arr2D[i].length;k++){
       arr2D[i][k] = obj.nextInt(); 
     }
   }
   System.out.println("2D array:");
     for(int i=0;i<arr2D.length;i++){
     for(int k=0;k<arr2D[i].length;k++){
       System.out.print(arr2D[i][k]+" "); 
     }
     System.out.println();
   }
     System.out.println("1D array:");
        for(int i=0;i<arr2D.length;i++){
     for(int k=0;k<arr2D[i].length;k++){
       System.out.print(arr2D[i][k]+" "); 
     }
     
   }
          System.out.println();
  }
}