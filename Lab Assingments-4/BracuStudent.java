public class BracuStudent{
 public String name;
 public String studentRoute;
 public boolean pass;
 public BracuStudent(String a,String b){
    name=a;
    studentRoute=b;
 }
 public void showDetails(){
    System.out.println("Student Name: "+name+"\nLives in "+studentRoute+"\nHave Bus Pass? "+pass);
 }
 public void getPass(){
    pass=true;
 }
 public void updateHome(String a){
    studentRoute=a;
 }

}