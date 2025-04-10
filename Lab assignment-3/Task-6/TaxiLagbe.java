public class TaxiLagbe{
  public String taxi_num;
  public String location;
  public int total_passenger=0;
  public String[] arr = new String[4];
  public int fare;
  
  public void storeInfo(String a,String b){
    taxi_num=a;
    location=b;
  }
  public void addPassenger(String a,int b){
    
      if(4<=total_passenger){
       System.out.println("Taxi Full! No more passengers can be added");
     }
     else{
     arr[total_passenger]=a;
    total_passenger++;

    fare+=b;
     System.out.println("Dear "+a+"! Welcome to TaxiLagbe");
     }
  }
   public void addPassenger(String a,int b,String c,int d){
     if(4<=total_passenger){
       System.out.println("Taxi Full! No more passengers can be added");
     }
     else{
     arr[total_passenger]=a;
    total_passenger++;
    fare+=b;
     System.out.println("Dear "+a+"! Welcome to TaxiLagbe");
     arr[total_passenger]=c;
    total_passenger++;
    fare+=d;
     System.out.println("Dear "+c+"! Welcome to TaxiLagbe");
     }
    
  }
   public void printDetails(){
    System.out.println("Taxi Number: "+taxi_num);
    System.out.println("This taxi can cover "+location+" area");
    System.out.println("Total Passenger: "+total_passenger);
    System.out.println("Passenger lists: ");
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=null){
      System.out.print(arr[i]+" ");
      }
      
    }
    System.out.println();
    System.out.println("Total collected fare: "+fare+" Taka");
   }
}