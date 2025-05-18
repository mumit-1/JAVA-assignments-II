public class Rj {
    public static void main (String [] args) {
        
        int arr[] = {9, -5, 7, 9, -5, 5, 7};
        int len = arr.length;
        int count = 0;
        //first printing as it is
         for ( int i = 0; i<len; i++ ) {
         System.out.print(arr[i]+",");
        }
         // then i am changing the value
        for ( int i = 0; i<len; i++ ) {
           
            for( int j = (i+1); j<len ; j++) {
              if(arr[i]==arr[j]){
                arr[j]=0;
              }
            }
        }
       System.out.println("");
       // then printing the new array
        for ( int i = 0; i<len; i++ ) {
         System.out.print(arr[i]+",");
        }
    }
}