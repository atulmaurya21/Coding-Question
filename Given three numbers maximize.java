import java.util.*;
class solution{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        System.out.println("Enter length of Array");
	    int n=in.nextInt();

	    int[] ar=new int[n];
	    System.out.println("Enter Array Elements");
	    for(int i=0;i<n;i++)
	    ar[i]=in.nextInt();

        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;

        // Traverse the array once to find the maximum values
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, leftMax + y * a[i] + rightMax);
            leftMax = Math.max(leftMax, x * a[i]);
            rightMax = Math.max(rightMax, z * a[i]);
        }

        return ans;
 