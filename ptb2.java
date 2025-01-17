
//thư viện nhập của javajava
import java.util.Scanner;

public class ptb2 {
    public static void ptbac2(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    // kiem tra neu a, b, c = 0 thi vo so nghiem
                    System.out.println("Phuong trinh vo so nghiem !");
                } else {
                    // nguoc lai a, b = 0 va c = 0 thi vo nghiem
                    System.out.println("Phuong trinh vo nghiem !");
                }
            } else {
                // a = 0 thi co nghiem don la x = -c/b
                float x = -c / b;
                System.out.println("Phuong trinh co nghiem don la : " + x);
            }
        } else {
            // delta
            float delta = b * b - 4 * a * c;
            // 2 nghiem phan biet
            float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a);
            float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a);
            // kiem tra delta theo truong hop
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem !");
            } else if (delta == 0) {
                float x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep : " + x);
            } else {
                System.out.println("Phuong trinh co 2 nghiem phan biet la : " + x1 + " va " + x2);
            }

        }

    }

    public static void main(String[] args) {
        // ham nhap scanner
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap vao tham so phuong trinh bac 2 : (a, b, c)");
        float a, b, c;// khai bao a,b,c voi kieu du lieu float
        a = myObj.nextFloat();// nhap dung kieu du lieu nextFloat()
        b = myObj.nextFloat();
        c = myObj.nextFloat();
        // goi ham va run code
        ptbac2(a, b, c);

    }
}
