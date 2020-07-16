package javaTutorial;

public class BitwiseOperator {

	public static void main(String[] args) {

		int x, y, z, p, q, rightsift, leftsift;
		x = 5;
		y = 5 | 5;
		z = 5 & 5;
		p = 5 ^ 5;
		rightsift = x >> 1;
		leftsift = x << 1;

		// 5-->101-->010-->2
		// 5-->101-->1010->
		// ---------
//         &    101-->5
//         |     101--5
//         ^     000-->0
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(p);
		System.out.println(rightsift);
		System.out.println(leftsift);

	}

}
