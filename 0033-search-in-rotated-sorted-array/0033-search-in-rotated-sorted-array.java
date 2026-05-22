class Solution {
    int findPeek(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if( mid<arr.length-1 && arr[mid]>arr[mid+1] ){
                return mid;
            } 
            if(mid>0 && arr[mid-1]>arr[mid] ){
                return mid-1;
            }
            if(arr[mid]<arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    int binarySearch(int[] arr,int target,int start,int end){
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int peek=findPeek(nums);
        int ans=binarySearch(nums,target,0,peek);
        if(ans==-1){
            return binarySearch(nums,target,peek+1,nums.length-1);
        }else{
            return ans;
        }
    }
}