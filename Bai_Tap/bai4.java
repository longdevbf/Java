public class bai4 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12};
        int n = 12;
        int S = 0;
        for(int i = 0;i < n; i++){
            if(a[i] % 3 == 0){
                S += a[i];
            }
        }
        System.out.println(S);
        
    }
}
