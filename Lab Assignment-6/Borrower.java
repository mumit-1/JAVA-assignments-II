//Task-05
public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  private int took;
  private String[] book = new String[3];
  private String name;
  public static void bookStatus(){
    System.out.println("Available Books:");
    for(int i=0;i<3;i++){
      System.out.println(book_name[i]+" : "+book_count[i]);
    }
  }
  public Borrower(String a){
    name=a;
  }
  public void borrowBook(String a){
        int ok=-1;
        for(int i=0;i<3;i++){
      if(book_name[i].equals(a)) ok = i; 
    }
    if(book_count[ok]!= 0){

    book[took] = a;
    took++;
    int ballon = -1;
    for(int i=0;i<3;i++){
      if(book_name[i].equals(a)) ballon = i; 
    }
    book_count[ballon]--;
    }
    else{
      System.out.println("This book is not available.");
    }
  }
  public void borrowerDetails(){
    System.out.println("Name : "+name+"\nBooks Borrowed:");
    for(int i=0;i<3;i++){
      if(book[i]!=null) System.out.println(book[i]+" ");
    }
  }
  public static int remainingBooks(String a){
    int check1=-1;
        for(int i=0;i<3;i++){
      if(book_name[i].equals(a)) check1 = i; 
    }
  return book_count[check1];
  }

}
