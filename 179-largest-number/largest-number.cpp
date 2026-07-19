class Solution {
public:
    string largestNumber(vector<int>& arr) {
        sort(arr.begin(), arr.end(), [](int a, int b) {
            string sa = to_string(a);
            string sb = to_string(b);
            return sa + sb > sb + sa;
        });
        string a = "";
        for (int i = 0; i < arr.size(); i++) {
            a += to_string(arr[i]);
        }
        if (a[0] == '0') return "0";
        return a;
    }
};