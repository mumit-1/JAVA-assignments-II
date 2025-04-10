import java.util.Scanner;
public class Task4{
  public static void main(String [] args){
   Scanner obj = new Scanner (System.in);
   String n1 = obj.nextLine();
   String n2 = "";
   for(int i=0;i<n1.length();i++){
     int ascii = (int) n1.charAt(i);
     if(ascii >= 97 && ascii <= 122 ){
       if(ascii==97) n2 += (char) 122;
//       else if(ascii==122) n2 += (char) 97;
       else n2 += (char) --ascii;
     }
   }
   System.out.println(n2);
  }
}