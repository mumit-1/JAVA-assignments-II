public class KKFlavouredTea extends KKTea{

    public KKFlavouredTea(String x,int a,int b){
//      String n = ;
        super("KK "+x+" Tea",a,b);
        
    }
//    public void productDetail(){
//        System.out.println(super.productDetail()+"\nWeight: "+w+", Tea Bags: "+bags);
//            
//    }

    public static void updateSoldStatusFlavoured( KKFlavouredTea t){
        total++;
        flavour++;
        t.status=true;
    }
}