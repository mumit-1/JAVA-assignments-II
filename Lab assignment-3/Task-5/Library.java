public class Library{
public int capacity=0;
public int books=0;
public String[] arr ;
 public void setBookCapacity(int a){
   capacity+=a;
   arr= new String[capacity];
 }
 public void addBook(String a){
   
   if(capacity>books){
    arr[books]=a;
    
    System.out.println("Book '"+a+"' added to the library");
    books++;
    
   }
   else{
    System.out.println("Exceeds maximum capacity. You can't add more than "+capacity+" books");
   }
 }
 public void printDetail(){
   System.out.println("Maximum capacity: "+capacity);
    System.out.println("Total Books: "+books);
     System.out.println("Booklist:");
     for(int i=0;i<arr.length;i++){
       if(arr[i]!=null){
         System.out.println(arr[i]);
       }
       
     }
 }
}