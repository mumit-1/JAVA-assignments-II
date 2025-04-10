public class CellPhone{
  public String model = "umknown";
  public int count = 0;
  public String[] contact_arr = new String[3];
  
  public void printDetails(){
    System.out.println("Phone model "+model);
    if(count==0){
      System.out.println("Contacts Stored 0");
    }
    
    if(count>0 && count<4){
    System.out.println("Contacts Stored "+count);
    System.out.println("Stored Contacts: ");
    for(int i=0;i<count;i++){
     System.out.println(contact_arr[i]+" "); 
    }
    System.out.println();
    }
    }
  public void storeContact(String c){
 
  if(count>2){
     System.out.println("Memory full. New contact can't be stored.");
  }
  else {
     System.out.println("Contact Stored");
     contact_arr[count]=c;
     count++;
   
  }
  }
}