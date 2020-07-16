package javaTutorial;

public class ProductTable {

	public static void main(String[] args) {
		int i,j,result;
		for(i=1;i<=11;i++)
		{
			for(j=1;j<=20;j++)
			{
				result=j*i;
				System.out.print(result+"\t");
			}
			System.out.println();
		}

	}

}
