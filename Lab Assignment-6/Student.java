public class Student{
    public static int total ;
    public static int cse ;
    public static int notCse ;
    private String name;
    private String dept;
    private double cg;
    private int id;

    public static void printDetails(){
        System.out.println("Total Student(s): "+total+"\nCSE Student(s): "+cse+"\nOther Department Student(s): "+notCse);
    }
    public Student(String a, double b,String c){
        name=a;
        cg=b;
        dept=c;
        id=(++total);
        if(c.equals("CSE")) cse++;
        else notCse++;
    }
    public Student(String a, double b){
        this(a,b,"CSE");
    }
    public void individualDetail(){

        System.out.println("ID: "+id+"\nName: "+name+"\nCGPA: "+cg+"\nDepartment: "+dept);
    }
}