
import java.util.Scanner;

public class fibonacci {

    //tinh fibonacci bang vong lap
    public static int tinh_so_n(int n, int s, int x, int y) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i < n + 1; i++) {
            s = x + y;
            x = y;
            y = s;
        }
        return s;
    }

    //phuong phap de quy
    public static int de_quy(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return de_quy(n - 1) + de_quy(n - 2);
    }

    //nhap gia tri va tinh so fibonacci gan nhat
    public static int find(int val) {
        int s = 0, x = 0, y = 1;
        while (true) {
            s = x + y;
            x = y;
            y = s;
            if (s < val) {
                continue;
            } else {
                break;
            }    
        }
        return x;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Nhap so thu tu n cua day fibonacci : ");
        Scanner myObj = new Scanner(System.in);
        n = myObj.nextInt();
        int value = tinh_so_n(n, 0, 0, 1);
        System.out.println("Gia tri cua so fibonacci thu N la : " + value);
        //gia tri muon tim kiem so fibonacci gan nhat voi gia tri cua n
        int val;
        val = myObj.nextInt();
        int valuee = find(val);
        System.out.println("Gia tri can tim la : " + valuee);
    }
}
