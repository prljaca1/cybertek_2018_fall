package DAY_34_Methods03;

public class VarArgs {
public static void main(String[] args) {
	sum(10,20);
    sumAll();
    sumAll(10);
    sumAll(12,34,345);
    sumAll(234,76,345,98,56,12);//no limited int 
    shoppinglist("rice","tomato","mango","milk");

}
public static void sum(int n1,int n2) {
	System.out.println(n1+n2);
}
public static void sumAll(int...nums) {//(int ...) just can be inside the method
	                    //(boolean...nums)
	System.out.println("Numbers of inputs:"+ nums.length);
    int  sum=0;
    for (int num:nums) {
    	sum+=num;
    }
System.out.println("Sum is" +sum);
}
/* methods shoppinglist 
Args:String var args
It will print shopping items in single line,separated by space
shopping list ("apples","kiwis","banana")->
prints:"Shopping List :apples Kiwi Banana"
*/

public static void shoppinglist(String...list) {
	System.out.print("Shopping List: ");
   for(String item:list) {
    System.out.print(item+" ");
   }
System.out.println();
}










}
