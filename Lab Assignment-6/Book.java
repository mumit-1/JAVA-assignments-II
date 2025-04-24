//Task-03
public class Book{
  public static int total_books_sold;
  public static double total_revenue;
  public String name;
  public double price;
  public Book(String a,double b) {
    name=a;
    price=150-(150*(b/100));
    total_books_sold++;
    total_revenue+=price;
  }
  public void bookDetails(){
    System.out.println("Title: "+name+" \nPrice after Discount: "+price+" TK");
  }
}