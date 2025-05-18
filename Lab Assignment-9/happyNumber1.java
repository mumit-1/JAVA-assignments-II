public class happyNumber1 {
    public static boolean isHappyNumber (int n) {
        
        int sumMain=0;
        int count=0;
        for ( int j = 0; sumMain!=1; j++) {
        int sum = sumMain;
        
        for ( int i = 10; n>0; i++ ) {
            int div = n%i ;
            sum += div*div;
            n = n/i;
            i--;
            

        }
        if(sum==1){
          sumMain=sum;
          
          break;
        }
        else if(count>9){
          
          break;
        }
        else{
          n=sum;
          count++;
        }
        }
        if(sumMain==1) return true;
        else return false;
    }
    public static void main (String [] args) {
        boolean check = isHappyNumber(7);
            System.out.println(check);
    }
}