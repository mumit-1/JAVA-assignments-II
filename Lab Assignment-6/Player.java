//Task-08
public class Player{
    public static int total;
    public static int count;
    public static String[] arr = new String[11];
    public String name;
    public String country;
    public int jersey;

    public static void info(){
        System.out.println("Total number of players: "+total);
        System.out.print("Players enlisted so far: ");
        boolean check1=false;
        for(int i=0;i<11;i++){
            if(arr[i]!=null) {
                System.out.print(arr[i]);
                if(i<(count-1)) System.out.print(" , ");
            }
            
        }
        System.out.println();
    }
    public Player(String a,String b, int c){
        name=a;
        country=b;
        jersey=c;
        arr[count] = a;
        count++;
        total++;
    }
    public String player_detail(){
        String a="Player Name: "+name+"\nJersey Number: "+jersey+"\nCountry: "+country;
        return a;
    }


}