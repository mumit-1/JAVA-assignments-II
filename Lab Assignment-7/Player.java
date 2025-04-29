public class Player extends SportsPerson{
    public int total_goal;
    public int total;
    public int total_match;
    public double ratio;

    public Player(String a,String b,String c,int d,int e){
        super(a,b,c);
        total_goal=d;
        total_match=e;
        total =(total_goal * 1000) + (total_match * 10);
    }
    public void calculateRatio(){
        ratio = (double) total_goal / total_match;
    }
    public void printDetails(){

        System.out.println(super.getNameTeam());
        System.out.println("Total Goal: "+total_goal+", Total Played: "+total_match+"\nGoal Ratio: "+ratio+"\nMatch Earning: "+total+"K");
    }
}