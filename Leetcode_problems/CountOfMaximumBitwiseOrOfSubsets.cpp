// problem link
// https://leetcode.com/problems/count-number-of-maximum-bitwise-or-subsets/


class Solution {
public:
    int countMaxOrSubsets(vector<int>& nums) {
        int n = nums.size();

        int total_val = 1 << n, max_val = 0,count = 0;
        for(int i : nums) max_val |= i;

        for(int i = 0;i < total_val;i++){
            int temp = i, k = 0, val = 0;

            while(temp > 0){
                if((temp & 1) != 0){
                    val |= nums[k];
                }
                temp >>= 1;
                k++;
            }

            if(val == max_val){
                count++;
            }
        }
        return count;
    }
};
