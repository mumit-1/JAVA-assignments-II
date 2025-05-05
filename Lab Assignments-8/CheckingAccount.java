public class CheckingAccount extends Account{
    public static int count;
    public CheckingAccount(){
      super(0.0);
        count++;
    }
    public CheckingAccount(double a){
        super(a);
        count++;
    }

}