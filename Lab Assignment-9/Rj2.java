public class Rj2 {
    public static void main (String [] args) {
        
        int arr[] = {2, 1, 9, 5, 3, 6};
        int len = arr.length;
        int count = 0;
      
         for ( int i = 0; i<(arr.length/2); i++ ) {
            len--;
            int temp = arr[len];
         
         arr[len]=arr[i];
         arr[i]=temp;
        }
          for ( int i = 0; i<(arr.length); i++ ) {
         System.out.print(arr[i]+",");
        }
    }
}