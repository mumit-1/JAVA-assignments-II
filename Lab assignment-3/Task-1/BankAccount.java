public class BankAccount{
  public String type="Not set";
  public int account;
  public void setInfo(int a,String b){
  type = b;
  account = a;
  System.out.println("Account information updated!");
  }
  public String printDetails(){
    String a = "Account No: "+account+"\n"+"Type: "+type;
    return a;
  }
}