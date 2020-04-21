import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

	public int findDuplicate(List<Integer> numbers)
	{
		int highest=numbers.size()-1;
		int total=getSum(numbers);
		int duplicate=total-(highest*(highest+1)/2);
		return duplicate;
	}
	
	
	
	private int getSum(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int num:numbers)
		{
			sum+=num;
		}
		return sum;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<10;i++)
		{
			list.add(i);
		}
		System.out.println(list.size());
		list.add(1000);
		System.out.println(list.size());
		DuplicateNumber n=new DuplicateNumber();
		System.out.println("Duplicate number is"+"  "+n.findDuplicate(list));

	}

}
