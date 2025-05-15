public class ClassWork1{
    public static int calculate(int n) {
        if (n <= 0){
            return 4;
        }
        else if (n % 2 != 0){
            return n + calculate(n - 1);
        }
        else{
            return n * calculate(n - 2);
        }
    }   
    public static void main(String[] args) {
        int result = calculate(8);
        System.out.println(result);
        int result2 = calculate(5);
        System.out.println(result2);
    }
}

