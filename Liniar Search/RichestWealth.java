class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for(int i=0;i<accounts.length;i++){ // rows..
            int sum =0;
            for(int j=0;j<accounts[i].length;j++){ // col..and eterate every col of the row..
                sum+=accounts[i][j];
            }
            if(sum>maxwealth){
                maxwealth=sum;
            }
        }
        return maxwealth;
    }
}