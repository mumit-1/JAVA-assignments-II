public class Task9{
  public static void main(String [] args){
    int[][] A = {{1,  0,  0,  1},
                 {0,  1,  0,  0},
                 {1,  0,  1,  0},
                 {0,  1,  0,  1}};
//    int[][] A = {{1, 0, 0},
//                 {0, 1, 0},
//                 {0, 0, 1}};
    int sum=0;
    for(int i=0;i<A.length;i++){
      sum+=A[i][i];
    }
    int sum2=0;
    for(int i=0;i<A.length;i++){
      for(int k=0;k<A.length;k++){
        if(i!=k){
          sum2+=A[i][k];
        }
      }
    }
    if(sum==3 && sum2==0){
      System.out.println("Identity Matrix");
    }
    else{
      System.out.println("not an Identity Matrix");
    }
  }
}