#include<math.h>
bool isPowerOfTwo(int n) {
    if(n<0){
        return false;
    }
    int count=0;
    for(int i=0;i<32;i++){
        int res=pow(2,i);
        if(res==n){
            return true;
            count=1;
        }
        else{
            count=0;
        }
    }
    if(count==1){
        return true;
    }
    else{
        return false;
    }
}