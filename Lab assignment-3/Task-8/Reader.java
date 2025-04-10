public class Reader {
  public String reader="New user";
  public int capacity;
  public String[] arr;
  public int total=0;
  public String createReader(String a,int b){
    reader = a;
    capacity = b;
    arr = new String[capacity]; 
    String x="A new reader is created!";
    return x;
  }
  public void addBook(String a){
    if(total<capacity){
   
    arr[total++] = a;
    
    }
    else{
     System.out.println("No more capacity");
    }
  }
  public void readerInfo(){
    System.out.println("Name: "+reader+"\n"+"Capacity: "+capacity+"\nBooks:"); 
    if(total == 0) System.out.println("No books added yet");
    for(int i=0;i<capacity;i++){
      if(arr[i]!=null){
      System.out.println("Book 2: "+arr[i]);
      }
    }
  }
}