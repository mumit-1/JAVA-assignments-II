public class Song{
  public static int songCount=0;
  public String name;
  public String singer;
  public int duration;
  public Song next;
  public int id;
  public boolean played=false;
 public Song(String a,String b,int c){
  name=a;
  singer=b;
  duration=c;
  next=null;
  id=songCount;
  songCount++;
  
 }
 public void songInfo(){
   System.out.println("Title: "+name+",  Artist: "+singer+" \nLength: "+duration+" minutes");
 }
}