public class Student {
    public String name;
    private String program;
    public Student(String a,String b) {
        name = a;
        program = b;
    }
    public void updateName(String a) {
        name = a;
    }
    public void updateProgram(String a) {
        program = a;
    }
    public String accessProgram() {
        return program;
    }
}