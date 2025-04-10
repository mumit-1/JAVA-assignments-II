public class Student {
  public String name="Not set";
  public double CGPA;
  public int credits=9;
  public String dept="CSE";
  public String scholership ="Not set";
  public void showDetails(){
  System.out.println("Name :"+name);
  System.out.println("Department "+dept);
  System.out.println("CGPA: "+CGPA);
  System.out.println("Credits: "+credits);
  System.out.println("Scholarship Status: "+scholership);
  }
  public void checkScholarshipEligibility(){
    String a="";
      if(CGPA>=3.7){
      a=name+" is eligible for Merit based scholarship";
      scholership="Merit based scholership";
       System.out.println(a);
    }
    else if(CGPA>=3.5 && credits>10){
      a=name+" is eligible for scholarship.";
      scholership="Eligible for scholership";
       System.out.println(a);
    }
    else if(CGPA>=3.5 && CGPA<3.7){
      a=name+" is eligible for Need-based scholarship.";
      scholership="Need based scholership";
       System.out.println(a);
    }
   
    else{
      a=name+" is not eligible for scholership";
       scholership="No Scholership";
      System.out.println(a);
    }
  }
  public void updateDetails(String a,double b,int c,String d){
    name = a;
    CGPA = b;
    credits =c;
    dept = d;
      
  }
   public void updateDetails(String a,double b,int c){
       name = a;
    CGPA = b;
    credits =c;
  }
    public void updateDetails(String a,double b){
        name = a;
    CGPA = b;
  }
}