public class KKTea extends Tea{
    public int bags;
    public int w;
    public static int total;
    public static int regular;
    public static int flavour;
    public KKTea(int a,int b){
        super("KK Regular Tea",a);
        bags=b;
        w=b*2;
    }
    public KKTea(String x,int a,int b){
        super(x,a);
        bags=b;
        w=b*2;
    }
    public void productDetail(){
      super.productDetail();
        System.out.println("Weight: "+w+", Tea Bags: "+bags);
            
    }
    public static void totalSales(){
        System.out.println("Total Sales: "+total+"\nKK Regular Tea: "+regular);
        if(flavour>0){
            System.out.println("KK Flavoured Tea: "+flavour);
        }

    }
    public static void updateSoldStatusRegular(KKTea t){
        total++;
        regular++;
        t.status=true;
    }
}