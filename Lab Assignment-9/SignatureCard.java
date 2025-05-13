public class SignatureCard extends CreditCard{
      public SignatureCard(String a,String b){
        super(a,b,200);
    }
    public void spendCash(int m){
        System.out.println("Previous Reward Points: "+rewardPoints);
        rewardPoints+=((m/50)*2);
        System.out.println("Reward points after spending "+m+" taka: "+rewardPoints);
    }
    public void cardDetails(){
        super.cardDetails();
        System.out.println("Possible Number of Companions for Lounge: 5");
    }
}