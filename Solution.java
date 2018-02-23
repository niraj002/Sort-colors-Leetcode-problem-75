class Solution {
    public void sortColors(int[] nums) {
        // HashMap<Integer, Integer> h = new HashMap<>();
        // h.put(0,0);
        // h.put(1,0);
        // h.put(2,0);
        // int i=0;
        // for(i=0;i<nums.length;i++){
        //    if(nums[i] == 0) 
        //      h.put(0,h.get(0)+1);
        //    else if(nums[i]==1) 
        //      h.put(1,h.get(1)+1);
        //    else 
        //      h.put(2,h.get(2)+1);
        // }
        // //System.out.println(h.keyset());
        // for(i=0;i< h.get(0);i++){
        //     nums[i]=0;
        // }
        // for(i=h.get(0);i< h.get(1)+h.get(0);i++){
        //     nums[i]=1;
        // }
        // for(i=h.get(0)+h.get(1);i< h.get(2)+h.get(0)+h.get(1);i++){
        //     nums[i]=2;
        // }
        
        int i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]!=0){
                if(nums[j]==0){
                    //swap(nums[i],nums[j]);
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                else
                    j--;
            }
            else{
                i++;
            }
        }
        j=nums.length-1;
        while(i<j){
            if(nums[i]!=1){
                if(nums[j]==1){
                    //swap(nums[i],nums[j]);
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                else
                    j--;
            }
            else{
                i++;
            }
        }    
        
    }
}
