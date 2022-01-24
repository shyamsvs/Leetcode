class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum = 0;
        int costSum = 0;
        int ans = 0;
        int sum = 0;

        for(int i=0; i<gas.length; i++){
            sum+= gas[i];
            if(sum >= cost[i]){
                sum-= cost[i];
            }
            else{
                ans = i+1;
                sum = 0;
            }
            gasSum += gas[i];
            costSum += cost[i];
        }

        if(gasSum < costSum) return -1;
        return ans;
    }
}
