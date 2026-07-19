class Solution {
public:
    bool reorderedPowerOf2(int n) {
        string sort_num = to_string(n);
        sort(sort_num.begin(), sort_num.end());

        for (int i = 0; i < 31; i++) {
            int power = 1 << i;
            string temp = to_string(power);
            sort(temp.begin(), temp.end());

            if (temp == sort_num) return true;
        }
        return false;
    }
};