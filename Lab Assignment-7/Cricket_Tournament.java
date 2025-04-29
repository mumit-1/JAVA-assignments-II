public class Cricket_Tournament extends Tournament{
  public int team_couunt;
  public String type="No type";
  public String detail(){
    String a="Cricket Tournament Name: "+super.getName()+"\nNumber of Teams: "+team_couunt+"\nType: "+type;
    return a;
  }
  public Cricket_Tournament(String a,int b,String c){
    super.setName(a);
    team_couunt=b;
    type=c;

  }
    public Cricket_Tournament(){
  }
}