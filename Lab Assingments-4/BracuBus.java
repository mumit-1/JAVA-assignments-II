public class BracuBus{
 public String location;
 public int max=2;
 public int count;
 public String[] passenger = new String[max];
 public BracuBus(String a,int b){
    location=a;
    max=b;
 }
 public BracuBus(String a){
    this(a,2);
 }
 public void board(){
    System.out.println("No passengers");
 }
 public void board(BracuStudent a){
    if(a.pass==true ){
        if(count<max){
            if(a.studentRoute==location){
                    passenger[count]=a.name;
                    System.out.println(a.name+" boarded the bus.");
                    count++;
            }
            else{
                System.out.println("You got on the wrong bus!");
            }
    
        }
        else{
            System.out.println("Bus is full!");
        }
    }
    else{
        System.out.println("You don't have a bus pass!");
    } 
 }
 public void board(BracuStudent a,BracuStudent b){
    board(a);
    board(b);
 }
 public void showDetails(){
    System.out.println("Bus Route: "+location+" \nPassenger Count: "+count+" (Max: "+max+")\nPassengers on Board: ");
    for(int i=0;i<(count);i++){
        if(passenger[i]!=null) System.out.print(passenger[i]+" ");
       
    }
    System.out.println();
 }
}