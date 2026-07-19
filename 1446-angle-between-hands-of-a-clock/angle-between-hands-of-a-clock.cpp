class Solution {
public:
    double angleClock(int hour, int minutes) {
        double minutes2 = minutes*6;
        double anglehour = hour*30 + minutes*0.5;
        if(anglehour>=360) {
            anglehour = anglehour-360;
        }
        double diff = abs(anglehour-minutes2);
        if(diff>180) {
            diff = 360-diff;
        }
        return diff;
    }
};