//Task-04
public class Student {
  public int id;
  public double cg;
  public String[] course= new String[4];
  public int count=0;
  public Student(int a,double b){
  id=a;
  cg=b;
  if(cg>0){
    System.out.println("A student with ID "+id+" and cgpa "+cg+" has been created.");
  }
  else{
    System.out.println("A student with ID "+id+" has been created.");
  }
  }
  public Student(int a){
   this(a,0);
  }
  public void addCourse(String a){
    if(cg==0){
      System.out.println("Failed to add "+a+" \nSet CG first");
    }
    else{
      
      if(cg>=3) {
        if(count<4){
        course[count]=a;
        count++;
        }
        else{
          System.out.println("Failed to add " + a);
          System.out.println("Maximum 4 courses allowed.");
        }
        }
        else{
          if(count<3){
        course[count]=a;
        count++;
        }
        else{
           System.out.println("Failed to add " + a);
           System.out.println("CG is low. Can't add more than 3 courses.");
        }
       
      }
      }
  
      
      
    }
  

  public void addCourse(String[] a){
    for(int i=0;i<a.length;i++){
      addCourse(a[i]);
    }
  }
  public void showAdvisee(){
  System.out.println("Student ID: "+id+", CGPA: "+cg);
  if(course[0]==null){
   System.out.println("No course added.");
  }
  else{
    System.out.println("Added courses are:");
    for(int i=0;i<count;i++){
      System.out.print(course[i]+" ");
    }
    System.out.println("");
  }
  }
  public void removeAllCourse(){
    for(int i=0;i<count;i++){
     course[i]=null;
    }
    count=0;
  }
  public void storeCG(double a){
   cg=a;
  }
  public void storeID(int a){
   id=a;
  }
}
