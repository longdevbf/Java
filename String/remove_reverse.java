

public class remove_reverse {
    public static void main(String[] args) {
        String S_input = "Lap trinh java khong don gian";
        //xoa ki tu a
        S_input = S_input.replace(Character.toString('a'),"");
        //sau khi xoa
        System.out.println("Chuoi sau khi xoa 'a' la : " + S_input);
        //reverse
        String reversed = new StringBuffer(S_input).reverse().toString();
        System.out.println("Chuoi sau khi reverse la : " + reversed);
    }
    
}
