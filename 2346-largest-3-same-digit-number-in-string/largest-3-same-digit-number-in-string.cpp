class Solution {
public:
   string largestGoodInteger(string num) {
    string best = "";
    for (int i = 0; i < num.size() - 2; i++) {
        if (num[i] == num[i+1] && num[i] == num[i+2]) {
            string triplet = num.substr(i, 3); 
            if (triplet > best) {
                best = triplet;
            }
        }
    }
    return best;
}

};

