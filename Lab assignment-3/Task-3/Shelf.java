public class Shelf{
public int capacity;
public int books;
 public void showDetails(){
  System.out.println("Shelf Capacity :" + capacity);
  System.out.println("Number of books :"+books);
 }
 public void addBooks(int a){
   if(capacity<=0){
     System.out.println("Zero capacity. Cannot add books.");
   }
   else if(capacity<(books + a)){
    System.out.println("Exceeds capacity");
   }
   else {
     books+=a;
     System.out.println(a+" books added to shelf");
   }
 }
}