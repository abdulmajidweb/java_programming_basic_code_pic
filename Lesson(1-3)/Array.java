class Array{
    public static void main(String[] args){
        /*int[] mark = {1, 2, 3, 4}; new int[4];
        mark[0] = 1;
        mark[1] = 2;
        mark[2] = 3;
        mark[3] = 4;*/
        //two dimensonal array
        int[][] mark = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("mark["+ i +"][" + j + "] = " + mark[i][j]);
            }
        }
    }
}


