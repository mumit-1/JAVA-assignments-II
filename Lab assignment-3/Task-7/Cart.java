public class Cart {
   public int cart_num;
   public int quantity=0;
   public double discount;
   public double sum;
   public String[] arr1=new String[3];
   public double[] arr2 = new double[3];
   public void create_cart(int a){
    cart_num=a;
   }
   public void addItem(String a,double b){
     if(quantity<3){
    arr1[quantity]=a;
    arr2[quantity]=b;
    sum+=b;
    quantity++;
    System.out.println(a+" added to cart "+cart_num+"\n"+"You have "+quantity+" item(s) in your cart now.");
   }
     else{
       System.out.println("You already have 3 items on your cart");
     }
   }
      public void addItem(double b,String a){
     if(quantity<3){
    arr1[quantity]=a;
    arr2[quantity]=b;
    quantity++;
    sum+=b;
    System.out.println(a+" added to cart "+cart_num+"\n"+"You have "+quantity+" item(s) in your cart now.");
   }
     else{
       System.out.println("You already have 3 items on your cart");
     }
   }
      public void giveDiscount(int a){
        discount=a;
      }
      public void cartDetails(){
        if(discount>0)  sum=sum-(sum*(10.0/100.0));
        System.out.println("Your cart(c"+cart_num+") :");
        for(int i=0;i<arr1.length;i++){
          if((arr1[i]!=null) && (arr2[i]!=0)){
          System.out.println(arr1[i]+" - "+arr2[i]);
          }
        }
        System.out.println("Discount Applied: "+discount+"%");
        System.out.println("Total price: "+sum);
      }
}