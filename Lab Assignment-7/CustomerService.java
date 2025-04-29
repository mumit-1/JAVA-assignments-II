public class CustomerService{
 public int size;
 public String[] arr;
 public CustomerService(int a){
    size=a;
    arr= new String[size];
 }
 public void addCustomer(String a){
    if(arr[size-1]==null) {
    for(int i=0;i<size;i++){
         if(arr[i]==null) {
            arr[i]=a;
            System.out.println("Added: "+a);
            break;    
         }       
    }
    }
    else{
        System.out.println("Queue is full. Cannot add "+a);
    }
 }
 public void serveCustomer(){
    if(arr[0]!=null){
        System.out.println("Serving "+arr[0]);
        arr[0]=null;
    } 
    else System.out.println("No customers to serve");
    for(int i=0;i<size-1;i++){
      arr[i]=arr[i+1];
    }
    arr[size-1]=null;

 }

}