import java.util.Scanner;
import java.util.Arrays;
import java.util.Vector;

public class array{
    //dem so phan tu trong day
    public static int count(int[] a, int n){
        int c = 0;
        for(int i = 0; i < n; i++){
            if(a[i] % 3 != 0){
                c ++;
            }
        }
        return c;
    }
    //tong cac phan tu nam trong khoang [-5, 25]
    public static int sum(int[] a){
        int sum = 0;
        for(int i = -5; i <= 25; i++){
            sum += i;
        }
        return sum;
    }
    //phan tu lon nhat trong day chia het cho 3
    public static int max_divide_3(int[] a, int n){
        int max = a[0];
        for(int i = 1; i <n; i++){
            if(a[i] > max && a[i] % 3 == 0){
                max = a[i];
            }
        }
        return max;
    }
    //sap xep day so de cac phan tu co gia tri tuyet doi tang dan
    public static void sort_by_ttd(int[] a, int n){
        for(int i = 0; i < n; i++){
            a[i] = Math.abs(a[i]);
        }
        Arrays.sort(a);
        System.out.println("Sau khi sap xep la : ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void remove(int[] a, int n){
        Vector<Integer> vector = new Vector<>();
        for(int i = 0; i < n; i ++ ){
            if(a[i] % 5 == 0 && a[i] % 3 != 0){
                continue;
            }
            else{
                vector.add(a[i]);
            }
        }
        System.out.println("Day so sau khi loai bo so chia het cho 5 va khong chia het cho 3 la : ");
        for(Integer x : vector){
            System.out.print(x + " ");
        }
    }
    //end

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = myObj.nextInt();
        }

        //dem so phan tu chia het cho 3 
        int cnt = count(a, n);
        System.out.println("So phan tu khong chia het cho 3 trong day la " +  cnt);
        //tong cac phan tu tu -5 den 25
        System.out.println("Tong cac phan tu trong khoang [-5, 25] : " + sum(a));
        //xac dinh phan tu lon nhat chia het cho 3 
        System.out.println("Phan tu lon nhat chia het cho 3 la : " + max_divide_3(a, n));
        //sap xep day so de co gia tri tuyet doi tang dan
        sort_by_ttd(a, n);
        //xoa phan tu chia het cho 5  nhung khong chia het cho 3
        remove(a, n);
    }
}

