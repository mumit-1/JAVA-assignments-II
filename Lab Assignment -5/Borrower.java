public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
  
  public static void bookStatus(){
    System.out.println("Available Books: ");
    for(int i=0;i<3;i++){
      System.out.println(book_name[i]+": "+book_count);
    }
  }
  public void borrowbook(String a){
    
  }
}