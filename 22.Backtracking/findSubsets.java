public class findSubsets {

    private static void subsets(String s, int i, String ans){
        if(i == s.length()){
            System.err.println(ans);
            return;
        }

        subsets(s, i+1, ans+s.charAt(i));
        subsets(s, i+1, ans);

    }
    public static  void main(String args[]){
        String  s = "abcd";

        subsets(s, 0, new String());
    }
}
