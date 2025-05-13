public class PlatinumCard extends CreditCard{
    public PlatinumCard(String a,String b){
        super(a,b,100);
    }
    public void spendCash(int m){
        System.out.println("Previous Reward Points: "+rewardPoints);
        rewardPoints+=(m/50);
        System.out.println("Reward points after spending "+m+" taka: "+rewardPoints);
    }
}