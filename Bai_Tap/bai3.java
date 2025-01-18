
public class bai3 {

    public static int fibonacci(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }   
        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    public static void main(String[] args) {
        double m = 14;
        int i = 0;
        while (true) {
            if (fibonacci(i) < m) {
                i++;
            } else {
                break;
            }
        } 
        if(m<fibonacci(i +  1)){
            System.out.println(i);
        }

    }
}

   
