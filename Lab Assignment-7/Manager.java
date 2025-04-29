public class Manager extends SportsPerson{
     public int total_match;
     public int total;
        public Manager(String a,String b,String c,int d){
        super(a,b,c);
        total_match=d;
        total =(total_match * 1000);
    }
        public void printDetails(){

        System.out.println(super.getNameTeam());
        System.out.println("Total win: "+total_match+"\nMatch Earning: "+total+"K");
    }
}