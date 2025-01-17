public class check_string {
    public static boolean string(String a){
        for(int i = 0; i < a.length(); i++){
            //kiem tra neu co ki tu chu nao thi tra ve false
            if(a.charAt(i) >= 'a' && a.charAt(i) <= 'z'){
                return false;
            }     
        }
        return true;
    }
    public static int cnt(String a){
        int count = 1;//so luong so la : so dau cach + 1
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == ' '){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String S_input1 = "2 34.5 -12.9 0 12 1.98";
        String S_input2 = "2 34.5 -12a.9 0 12 1b.98"; 
        if(string(S_input2)){
            System.out.println("true, co " + cnt(S_input1) + " so");
        }
        else{
            System.out.println("false");
        }
    }
}
