package String;//字符串的反转

public class String_prac4 {
    public static void main(String[] args) {

        String result =reverse("abc");
        System.out.println(result);
    }

    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >= 0; i--) {//快捷键：str.length().forr。按住shift+F6可实现批量修改
            char c =str.charAt(i);
            result =result+c;
        }
        return result;
    }
}
