class day_7Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        day_7Solution solution = new day_7Solution();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(solution.containsDuplicate(nums1)); 
        System.out.println(solution.containsDuplicate(nums2)); 
        System.out.println(solution.containsDuplicate(nums3));
    }
}
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indexes[] = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    indexes[0] = i;
                    indexes[1] = j;
                    break;
                }
            }
        }
        return indexes;
    }
    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
            
           
            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            int[] result1 = solution.twoSum(nums1, target1);
            System.out.println("Indexes for nums1: " + result1[0] + ", " + result1[1]); 
    
        
            int[] nums2 = {3, 2, 4};
            int target2 = 6;
            int[] result2 = solution.twoSum(nums2, target2);
            System.out.println("Indexes for nums2: " + result2[0] + ", " + result2[1]); 
    
            int[] nums3 = {3, 3};
            int target3 = 6;
            int[] result3 = solution.twoSum(nums3, target3);
            System.out.println("Indexes for nums3: " + result3[0] + ", " + result3[1]);
        }
}
}
#creation of class and object
class Student{
            String name;
            int id;
            int age;
            String branch;

            public void makeNoise(){
                System.out.println(" students are talking");
            }
            public void Studying(){
                System.out.println("students are studying");
            }
            public static void main(String [] args){
            Student s1  = new Student(){
               
                s1.name = "shirisha";
                s1.id = 70;
                s1.age = 18;
                s.branch = "cse";
                System.out.println(s1);
            }

        }
    }
