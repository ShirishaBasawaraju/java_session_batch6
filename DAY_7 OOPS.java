public class DAY_7 {
    public static void main(String [] args){
        class Solution {
            public boolean containsDuplicate(int[] nums) {
                for(int i = 0; i<nums.length;i++){
                    for(int j = i + 1; j < nums.length; j++){
                        if(nums[i]==nums[j]){
                            return true;
                        }
                    }
                }
                return false;
            }
        }
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
