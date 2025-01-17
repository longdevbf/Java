
import java.util.Scanner;

public class tinh_tong {
    // ham tinh giai thua
    public static long giaithua(long x) {
        if (x == 0 || x == 1)
            return 1; // Điều kiện dừng
        long result = 1;
        for (long i = 2; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    // ham tinh tong cua S
    public static long tong(long n, long x) {
        long s = 1 + n * x;
        long val = n;// gan val = 1 de bat dau vao vong lap nhan

        for (int i = 1; i < n; i++) {
            val = (long) (val * (n - i) * Math.pow(x, i + 1)) / giaithua(i + 1);// nhan tiep
            s += val;
            val /= (long) Math.pow(x, i + 1);// chia di x ^i + 1 de nhan tiep
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        // tong S = 1 + n*x/1! + n*(n -1)*x^2/2! +...+ n!*x^n/n!;
        long n = myObj.nextLong();
        long x = myObj.nextLong();
        long value = tong(n, x);// call function
        System.out.println("Value : " + value);
    }
}
