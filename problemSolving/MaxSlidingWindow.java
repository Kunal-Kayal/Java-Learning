package problemSolving;

import java.util.*;

public class MaxSlidingWindow {

	public static void main(String[] args) {
		int a[]= {1,4,2,34,56,3,4,7,3,1,7,8};
		int k=3;
		int ans[]=solution(a, k);
		for(int x: ans) {
			System.out.print(x+" ");
		}

	}
	static int[] solution(int[] a,int k) {
		int n = a.length;
		int ans[]= new int[n-k+1];
		Deque<Integer> dq = new LinkedList<Integer>();
		if(n==0 ||  n==1) return a;
		int i=0;
		for( ; i<k;i++) {
			while(!dq.isEmpty() && dq.peekLast()<=a[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		for(;i<n;i++) {
		   ans[i-k]=a[dq.peekFirst()];
		   while(!dq.isEmpty() && dq.peekFirst()<=i-k) {
			   dq.removeFirst();
		   }
		   while(!dq.isEmpty() && dq.peekLast()<=a[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
			ans[i-k]=a[dq.peekFirst()];
		}
		
		
		return ans;
	}

}
