public class Tennis_Tournament extends Tournament{
    public int player_count;
    public String detail(){
    String a="Tennis Tournament Name: "+super.getName()+"\nNumber of Players: "+player_count;
    return a;
  }
   public Tennis_Tournament(String a,int b){
    super.setName(a);
    player_count=b;
    

  }
}