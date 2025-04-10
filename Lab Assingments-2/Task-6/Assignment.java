public class Assignment{
 public int tasks;
 public String difficulty;
 public boolean submission;
 public void printDetails(){
   System.out.println("Number of tasks: "+tasks);
   System.out.println("Difficulty level: "+difficulty);
   System.out.println("Submission required: "+submission);
 } 
 public String makeOptional(){
   String a="";
   if(submission){
   submission=false;
   a="Assignment will not require submission";
   }
   else{
   a="Submission is already not required";
   }
   return a;
 }
}