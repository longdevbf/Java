
import java.util.Scanner;

public class Hello {
    static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
        int a = myObj.nextInt();
        int b = myObj.nextInt();
        System.out.println(sum(a, b));
     
}
}