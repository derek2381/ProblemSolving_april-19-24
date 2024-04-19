// problem link
// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/


class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        int total_sum = 0, sum = 0, n = arr.size();

        for(int i = 0;i < n;i++){
            sum = 0;
            int count = 1;
            for(int j = i;j < n;j++){
                sum += arr[j];
                if(count%2 == 1){
                    total_sum += sum;
                }
                count++;
            }
        }


        return total_sum;
    }
};
