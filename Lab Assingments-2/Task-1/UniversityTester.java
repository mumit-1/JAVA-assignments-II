public class UniversityTester{
  public static void main(String [] args){
  University o1 = new University();
  University o2 = new University();
  System.out.println(o1+"\n"+o2); 
 // University@25c641f4
//  University@2482e274 
//  They are not same 
   System.out.println(o1.name+" "+o1.country);
   System.out.println(o2.name+" "+o2.country);
 //  They are not same   
   o1.name= "Imperial College London";
   o1.country= "England";
   o2.name= "BRAC University";
   o2.country= "Bangladesh";
   System.out.println(o1.name+"\n"+o1.country);
   System.out.println(o2.name+"\n"+o2.country);
   // they have changed and they are nor same
  }
}