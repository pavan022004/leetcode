class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length, col = image[0].length;
        int newarr [][] = new int[row][col];

        for(int i=0; i<newarr.length; i++) {
            int index = 0;
            for(int j=col-1; j>=0; j--) {
                if(image[i][j] == 0)
                    newarr[i][index++] = 1;
                else
                    newarr[i][index++] = 0;
            }
        }

        return newarr;
    }
}