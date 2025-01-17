//thư viện nhập của javajava
import java.util.Scanner;
public class ptb2 {
    public static void ptbac2(float a, float b, float c){
        if(a == 0){
            if(b == 0){
                if(c == 0){
                    System.out.println("Phuong trinh vo so nghiem !");
                }
                else{
                    System.out.println("Phuong trinh vo nghiem !");
                }
            }
            else{
                float x = -c/b;
                System.out.println("Phuong trinh co nghiem don la : " + x);
            }
        }
        else{
            float delta = b*b - 4 * a * c;
            float x1 = (float)(-b + Math.sqrt(delta))/(2 * a);
            float x2 = (float)(-b - Math.sqrt(delta))/(2 * a);
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem !");
            }
            else if( delta == 0){
                float x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep : " +  x);
            }
            else{
                System.out.println("Phuong trinh co 2 nghiem phan biet la : "+ x1 + " va " + x2);
            }
            
        }
        
    }

public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Nhap vao tham so phuong trinh bac 2 : (a, b, c)"  );
    float a, b, c;
    a = myObj.nextFloat();
    b = myObj.nextFloat();
    c = myObj.nextFloat();
    ptbac2(a, b, c);


}
}
