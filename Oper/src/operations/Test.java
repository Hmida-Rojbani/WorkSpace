package operations;

public class Test {
	
	public static void main(String[] args) {
		int i = 5;
		long l = i;
		i =(int) l;
		i = (int) 2.5;
		byte b = (byte)128;//-128 -> 127
		System.out.println(b);
		int e =b +b;
		i = 1;
		int j = i++;
		// (j = i) , (i = i+1)
			j = ++i;
		//  (i = i+1), (j = i)
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		// y = 4 * 5  / 4 + 2
		
		System.out.println(x);
		System.out.println(y);
	}

}
