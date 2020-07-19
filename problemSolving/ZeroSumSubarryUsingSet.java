package problemSolving;

import java.util.*;

public class ZeroSumSubarryUsingSet {

	public static void main(String[] args) {
		int arr[]= {1,2,4,-1,-6,8,7,2};
		boolean flag = false;
		Set<Integer> s= new HashSet<>();
		int sum=0;
		s.add(sum);
		for(int i=0;i<arr.length;i++) {
			s.add(sum);
			sum+=arr[i];
			if(s.contains(sum)) {
				flag=true;
				break;
				
			}
			
		}
		System.out.println(flag);
		

	}

}
