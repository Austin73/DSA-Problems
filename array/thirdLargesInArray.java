first solution - just traverse an array and find thrid highest number

    long first=Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
                if(nums[i] > first)
                {
                        third=second;
                        second=first;
                        first= nums[i];
                }
                else if(nums[i]< first && nums[i] > second)
                {
                        third= second;
                        second= nums[i];
                }
                else if(nums[i] < second && nums[i] > third)
                {
                        third= nums[i];
                }
                else
                {
                        
                }
        }
            
            if(third != Long.MIN_VALUE)
                    return (int) third;
            else
                    return (int) first;
        
        
 2nd Solution using linked list (this solution is scalable ,it can be extended to find more than 3rd highest element in array)
 
 nlogk
 If tree set size is greater than 3 then remove the first element. This will result into overall complexity as O(nlogk)

public int thirdMax(int[] nums) {
        TreeSet<Integer> ts = new TreeSet();
        for(int i: nums){
            ts.add(i);
            if(ts.size() > 3){
                ts.remove(ts.first());
            }
        }
        if(ts.size() < 3){
            return ts.last();
        }
        return ts.first();
    }
 
 
