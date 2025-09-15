public class findPermutation {

    public static void permutation(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String str = s.substring(0, i) + s.substring(i+1);
            permutation(str, ans+ch);
        }
    }

    public static void main(String args[]){
        String s =  "abc";
        permutation(s, new String());
    }
}
