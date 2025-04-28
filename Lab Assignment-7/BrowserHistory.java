public class BrowserHistory{
    public int count=0;
    public String rn;
    public int size;
    public String[] arr ;
    public BrowserHistory(int a){
        size=a;
        arr = new String[size];
    }
    public void showHistory(){

        if(arr[0]==null) System.out.println("No web pages visited yet.");
        else{
            System.out.println("Browser History: ");
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }
        }
    }
    public void currentWeb(){
          if(count==0 && arr[count]==null) System.out.println("You have not visited any website yet!");
        else{
            System.out.println("Current web page: "+arr[count-1]);
        }
    }
    public void visitWeb(String a){
        if(count<size){
            arr[count]=a;
            count++;
            System.out.println("Visited: "+a);
        }
        else{
            System.out.println("History is full. Cannot visit "+a+" web page.");
        }
    }
    public void back(){
        arr[count-1]=null;
        count--;
    }
}