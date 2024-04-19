// problem link
// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/


class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        int Xor_val = 0;
        for(int i : nums){
            Xor_val ^= i;
        }

        int count = 0;

        while(k > 0 || Xor_val > 0){
            if((k & 1) == 0 && (Xor_val & 1) != 0){
                count++;
            }else if((k&1) != 0 && (Xor_val & 1) == 0){
                count++;
            }
            k >>= 1;
            Xor_val >>= 1;
        }

        return count;
    }
};
