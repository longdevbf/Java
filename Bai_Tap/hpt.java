public class hpt {
    public static double gt(double a) {
        if(a == 0){
            return 1;
        }
        if(a == 1){
            return 1;
        }
        return a*gt(a - 1);
    }
    public static void main(String[] args) {
        double n = 5;
        double S = 0.0;
        
        for(int i = 0 ; i < n; i++){
            S += ((i + 1) + Math.sqrt(i + 1))/((i +1) + gt(i + 2));
        }
        System.out.println(S);
       
    }
}
