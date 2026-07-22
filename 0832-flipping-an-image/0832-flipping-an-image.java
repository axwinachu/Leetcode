class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] res=new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                res[i][j]=image[i][image.length-1-j];
            }
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(res[i][j]==0){
                    res[i][j]=1;
                }else{
                    res[i][j]=0;
                }
            }
        }
        return res;
    }
}