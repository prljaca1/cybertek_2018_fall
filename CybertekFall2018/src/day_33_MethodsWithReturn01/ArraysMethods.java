package day_33_MethodsWithReturn01;

import java.util.Arrays;
import java.util.Random;

public class ArraysMethods {
	/*
	 * Method:getIntArray5
	 * Params/Args:nothings
	 * Return: int array
	 * 
	 * Createsban array with 5 ints and assigns random numbers,
	 * between 0-100 then returns that array
	 * 
	 * getIntArray5()->[43,28,78,94,3]
	 * 
	 */
 public static void main(String[] args) {
	int [] nums=new int[5];
	Random rdm=new Random();
	 
	 for(int i =0; i<nums.length; i++) {
		 nums[i]=rdm.nextInt(101);
	 }
	 System.out.println(Arrays.toString(nums));
	 
	 
	 int[] nums2= {rdm.nextInt(101),
			       rdm.nextInt(101),
			       rdm.nextInt(101),
			       rdm.nextInt(101),
			       rdm.nextInt(101)};
	 System.out.println(Arrays.toString(nums2));

    //call getIntArray5 method and use it?
	 int[]mynums=getInArray5();
	 
	 System.out.println(Arrays.toString(mynums));
	 
	 System.out.println(Arrays.toString(getInArray5()));
 
 //TODO:create two arrays using getInArrays5 method and
// compare Sums of bath and print out which is larger;
	 int[] Nums1=getInArray5();
     int[] Nums2=getInArray5();
 
     int sumOfNums1=0, sumOfNums2=0;
     for (int num:Nums1) {
    	 sumOfNums1+=num;
     }
     for (int num:Nums2) {
    	 sumOfNums2+=num;
     }
     if(sumOfNums1 > sumOfNums2) {
    	 System.out.println("First Array Sum is larger: " + sumOfNums1);
    	 System.out.println("Second Array Sum: " + sumOfNums2);
     }else if(sumOfNums2 > sumOfNums1) {
    	 System.out.println("Second Array Sum is larger: " + sumOfNums2);
    	 System.out.println("First Array Sum: " + sumOfNums1);
     }else {
    	 System.out.println("Sum of both arrays are equal. First Array: " + sumOfNums1);
    	 System.out.println("Second Array Sum: " + sumOfNums2);
     }
 }

   public static int[] getInArray5() {
	 int []nums=new int[5];
	 Random rdm=new Random();

	 for(int i=0; i<nums.length; i++) {
		 nums[i]=rdm.nextInt(101);

	 }
	 return nums;
 }













}










