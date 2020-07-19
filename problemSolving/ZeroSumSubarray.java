package problemSolving;

public class ZeroSumSubarray {

	public static void main(String[] args) {
		int arr[]= { 1,4,-2,8,3,-6,7,2};
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum==0){
					flag=true;
					break;
				}
			}
		}
		System.out.println(flag);

	}

}
