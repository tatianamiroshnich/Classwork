public class TwoDArray {
    public static void main(String[] args) {
        String[][] twoD = new String[3][6];
        int i, j = 0;
        char c = 'a';
        for (i = 0; i < twoD.length; i++) {
            for (j = 0; j < twoD[0].length; j++) {
                twoD[i][j] = c + "";
            }
            c++;
        }
        for (i = 0; i < twoD.length; i++) {
            for (j = 0; j < twoD[0].length; j++) {
                System.out.print(twoD[i][j] + (j + 1) + " ");
            }
            System.out.println();
        }


    }
}
