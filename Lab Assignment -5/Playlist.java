public class Playlist{
  public Song start;
  public Song last;
  public String name;
  public Playlist(String a){
    name=a;
    System.out.println(a+" created.");
  }
  public void info(){
    System.out.println(name+" has the following songs:");
    if(start==null){
     System.out.println("No songs in "+name+".");
    }
    else{
      Song t = start;
      int count =1;
      while(t!=null){
        System.out.println("Song-"+(count++) );
        t.songInfo();
        t=t.next;
      }   
      t=start;
      while(t.next!=null){
       
        t=t.next;
      }   
      last=t;
    }
    
  }
  public void addSong(Song a){
    
    if(start==null){
        start = a;
        System.out.println(a.name+" added to "+name+".");
        return;
    }
    Song t =start;
     while(t.next!=null){
        t=t.next;
      }
  t.next=a;
  System.out.println(a.name+" added to "+name+".");
}
   public void addSong(Song a,int b){
   
   if(start==null){
       start = a;
       return;
   }
   if(b>Song.songCount){
     System.out.println("Cannot add song to Index "+b);
   }
   else if(b==0){
     Song t=start;
     start=a;
     start.next=t;
     System.out.println(a.name+" added to "+name+".");
   }
   else{
   Song t = start;
   Song t2 = null;
   int count1=0;
   while(t.next!=null){
     if(count1==(b-1)){
       
      t2=t.next;
      t.next=a;  
      a.next=t2;
      count1++;
      System.out.println(a.name+" added to "+name+".");
     break;
     }
     count1++;
      t=t.next;
   }
   }
   
}
   public void playSong(String a){
   Song t=start;
   boolean t2=false;
   while(t.next!=null){
     if(a.equals(t.name)){
//       System.out.println("Playing "+t.name+" by "+t.singer+".");
       t2=true;
       break;
     }

     t=t.next;
   }
     if(t2==true){
       System.out.println("Playing "+t.name+" by "+t.singer+".");
       t.played=true;
     }
     else{
       System.out.println(a+" not found in "+name+".");
     
     }
   }
   public void playSong(int a){
   Song t=start;
   boolean t2=false;
   Song t3=null;
   int count =0;
   while(t.next!=null){
     if(count==a){
//       System.out.println("Playing "+t.name+" by "+t.singer+".");
       t2=true;
       break;
     }
     count++;
     t=t.next;
   }
     if(t2==true){
       System.out.println("Playing "+t.name+" by "+t.singer+".");
       t.played=true;
     }
     else{
       System.out.println("Song at Index "+a+" not found in "+name+".");
     
     }
   }
   public void deleteSong(String a){
     Song t=start;
     int count1=0;
     int t2=-11;
     Song t3=null;
     while(t.next!=null){
     if(a.equals(t.name)){
       t2=count1;
       t3=t.next;
       break;
     }
     count1++;
     t=t.next;
   }
     if(t2==0){
       start=t.next;
       --Song.songCount;
        System.out.println(a+" deleted from "+name+".");
     }
     else if(t2>-1){
       t=start;
     int count2=0;
     Song t4=null;
     while(t.next!=null){
     if(count2==(t2-1)){
       t.next=t3;
       
       break;
     }
     count2++;
     t=t.next;
   }
     --Song.songCount;
     System.out.println(a+" deleted from "+name+".");
     }
     else{
      System.out.println(a+" not found in "+name+".");
     }
     
   }
   public int totalSong(){
     
       return --Song.songCount;
   }
   
   public void merge(Playlist a){
     last.next=a.start;
     System.out.println("Merge Completed!");
   }

}


