import java.util.*;

public class ReverseString{
    public static void main(String[] args) {
        int i = 0;
        while(i<1){
            String ans = StringReverse();
            System.out.println(ans);
        }
    }
    static String StringReverse(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter thr String (press E for exit): ");
        String s = in.nextLine();
        String reverse = "";
             
        int length = s.length(); 
        for (int i = length-1; i>=0; i--){
            reverse = reverse +s.charAt(i);
        }
        return reverse;
    }
    
}