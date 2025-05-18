import java.util.Scanner ;

public class duplicate {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String : ");
        String s1 = sc.nextLine();
        int length = s1.length();
        String s2 = "";
        char[] arr = new char[length];
        for(int i = 0; i<(length) ; i++ ){
          arr[i]=s1.charAt(i);
        }
        int[] arr2 = new int[50];
         int countX = 0;
        for (int i = 0; i<(length) ; i++ ){
                    
          boolean chk = false;
          if(i!=0){
          for(int k=1;k<arr2.length;k++){
          if(i==arr2[k]) chk = true;
          }
          }
             
          if(chk==false){
            
                   int count =0;
          int need = -1;

          for(int j=(i+1);j<length;j++){
            
            if(arr[i]==arr[j]){
              count++;
              if(count>0){
                arr2[countX]=need;
                countX++;
            }
              need=j;
             
            }
            
            
            
          }
          if(need>=0){
             arr[i]='.';
             arr[need]='.';
             
            }
        }
          else{
            
          }
          }
 
        for(int i=0;i<length;i++){
          if(arr[i]!='.'){
            s2+=arr[i];
          }
        }
       if (s2.isEmpty()) {
    System.out.println("No characters left!");
} else {
    System.out.println(s2);
}
//        System.out.println();  
    }
}