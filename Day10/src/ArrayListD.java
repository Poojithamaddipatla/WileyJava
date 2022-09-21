import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		//ArrayList: AbstractArryaList, Collection,Object, List, AbstractCollection
		numbers.add(80);//int-->Integer
		numbers.add(87);
		numbers.add(67);
		numbers.add(98);
		numbers.add(54);
		System.out.println(numbers);	
		numbers.add(1,78);
		System.out.println(numbers);
		ArrayList<Integer> numbers1=new ArrayList<Integer>();
		numbers1.add(99);
		numbers1.add(99);
		numbers1.add(99);
		numbers.addAll(numbers1);
		Iterator<Integer> numberIterator=numbers.iterator();
		while(numberIterator.hasNext()) {
			int data=numberIterator.next().intValue();
			System.out.println(data);
			if(data%2==0)
			numberIterator.remove();
		}
		
		System.out.println(numbers);
	}

}
