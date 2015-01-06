
public class TestDynamicArray {
public static void main(String[] args) {
	DynamicArray da1=new DynamicArray(2);
	da1.add(2);
	da1.add(3);
	da1.add(5);
	da1.add(10);
	da1.add(15);

	//for(int i=0;i<da1.getSize();i++)
	//System.out.println(da1.array[i]);
//	int number =da1.getAt(1);
//	System.out.println(number);
	da1.removeAt(1);
	for(int i=0;i<da1.getSize();i++)
		System.out.println(da1.array[i]);
}
}
