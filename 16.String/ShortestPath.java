public class ShortestPath {
    public static float FindShortestPath(String path){
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            if(path.charAt(i) =='W'){
                x--;
            }else if(path.charAt(i) =='E'){
                x++;
            }else if(path.charAt(i) =='N'){
                y++;
            }else{
                y--;
            }
        }

        int cal = (x*x) + (y*y);
        return (float)Math.sqrt(cal);

    }
    public static void main(String[] args) {

        String path = "WNEENESENNNEWEENSSS";

        System.out.println(FindShortestPath(path));

    }
}