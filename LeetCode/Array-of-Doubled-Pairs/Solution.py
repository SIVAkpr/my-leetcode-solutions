class Solution {
public:
    bool canReorderDoubled(vector<int>& arr) {
        
        // map to store freq of all elements
        map<int, int> nums;
        for(auto& i : arr) nums[i]++;
        
        // we will pick smallest number, then we need to find it's double
        // if it's double exist then subtract
        // if don't exist means we can't pair it up
        
        while(nums.size() > 0) {
            int least = (*nums.begin()).first;
            int target;
            
            // if the current number is 0 then it's freq should be even
            // x = 0, 2*x = 0
            
            if(least == 0) {
                if(nums[least] % 2 != 0) return false;
                nums.erase(least);
            }
            
            else {
                
                // if curr number is -ve it's pair will be divided by 2
                // else multiplied by 2
                if(least < 0) {
                    if(least % 2 != 0) return false;
                    target = least / 2;
                }
                else target = 2 * least;

                // get min frequency of both pair numbers
                // if bigger num has freq 0 means pair can't be formed
                
                int mi = min(nums[target], nums[least]);
                if(mi == 0) return false;

                // else reomve them from the map
                
                nums[target] -= mi;
                nums[least] -= mi;

                if(!nums[target]) nums.erase(target);
                if(!nums[least]) nums.erase(least); 
            }
        }
        
        // we paired every number
        return true;
    }
};