class MinPathSum {
    public int minPathSum(int[][] grid) {
        int length1 = grid.length;
        int length2 = grid[0].length;
        int cost[][] = new int[length1][length2];
        for(int i=0;i<length1;i++){
            if(i!=0){
                cost[i][0]=grid[i][0]+cost[i-1][0];
                
            }
            else{
                cost[0][0] = grid[0][0];
            }
        }
        for(int i=0;i<length2;i++){
            if(i!=0){
                cost[0][i]=grid[0][i]+cost[0][i-1];
                
            }
            else{
                cost[0][0] = grid[0][0];
            }
        }
        
        
        for(int i=1;i<length1;i++){
            for(int j=1;j<length2;j++){
                
                cost[i][j] = grid[i][j]+Math.min(cost[i][j-1],cost[i-1][j]);
                
            }
        }
        
        return cost[length1-1][length2-1];
        
    }
}
