// problem link
// https://leetcode.com/problems/determine-color-of-a-chessboard-square/


class Solution {
public:
    bool squareIsWhite(string coordinates) {
        int c = coordinates[0], n = coordinates[1] - '0';

        if((c%2 == 0 && n % 2 == 0) || (c%2 == 1 && n%2 == 1)){
            return false;
        }else{
            return true;
        }
    }
};
