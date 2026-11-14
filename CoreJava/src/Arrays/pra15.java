package Arrays;

public class pra15 {
    public static void main(String[] args) {
        int a[][][] = {{{10, 12}}};
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.println(a[i][j][k]);
                }
            }
        }
    }
}
