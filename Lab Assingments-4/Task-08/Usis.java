public class Usis{
    // public String name;
    public String[] deptNameArr = new String[5];
    public int[] idArr=new int[5];
    public  String[] course = new String[3]; 
    public  String[] advised = new String[5]; 
    public int count;
    public Usis(){
        System.out.println("Usis is ready to use!");
    }
    public void login(Student a){
        if(a.email==null && a.password==null){
            // System.out.println("");
            System.out.println("Email and password need to be set.");
        }
        else{
            System.out.println("Login successful");
        }
    }
    public void advising(Student a){
         if(a.email==null && a.password==null){
            System.out.println("Please login to advise courses!");
         }
         else{
            System.out.println("You haven't selected any courses.");
         }
    }
    public void advising(Student a,String b,String c,String d,String e){
        if(e==null){
            advised[count]=a.name;
            String X1 = b+" "+c+" "+d;
           course[count]=X1;
           deptNameArr[count]=a.deptName;
           idArr[count]=a.id;
           System.out.println("Advising successful!");
           count++;
        }
        else{
             System.out.println("You need special approval to take more than 3 courses.");
        }
    }
    public void advising(Student a,String b,String c,String d){
        advising(a,b,c,d,null);
    }
    public void allAdviseeInfo(){
        System.out.println("Total Advisee: "+count);
        for(int i=0;i<count;i++){
            System.out.println("Name: "+advised[i]+" ID: "+idArr[i]+" \nDepartment: "+deptNameArr[i]+"\nAdvised Courses: \n"+course[i]+"\n==============");
        }
    }

}