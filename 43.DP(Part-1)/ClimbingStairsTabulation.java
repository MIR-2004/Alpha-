public class ClimbingStairsTabulation {
    public static void main(String[] args) {
        int n = 4;
        int w[] = new int[n+1];
        w[0] = 1;
        w[1] = 1;
        
        for(int i = 2; i<w.length; i++){
            w[i] = w[i-1]+w[i-2];
        }

        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i]+" ");
        }
    }
}
