//find first nd last pos in sorted array
class Solution 
{
    public int startIndex(int[] nums,int target)
    {
        int ind = -1;
        int s = 0;
        int h = nums.length-1;
        while(s<=h)
        {
            int mid = (s + h)/2;
            
            if(nums[mid]>=target)
                h = mid-1;
            else
                s = mid+1;
            
            if(nums[mid]==target)
                ind = mid;
        }
        return ind;
    }
    public int lastIndex(int[] nums,int target)
    {
        int ind = -1;
        int s = 0;
        int h = nums.length-1;
        while(s<=h)
        {
            int mid = (s + h)/2;
            
            if(nums[mid]<=target)
                s = mid+1;
            else
                h = mid-1;
            
            if(nums[mid]==target)
                ind = mid;
        }
        return ind;
    }
    public int[] searchRange(int[] nums, int target) 
    {
        int[] temp = new int[2];
        
        temp[0] = startIndex(nums,target);
        
        temp[1] = lastIndex(nums,target);
        
        return temp;
    }
}
