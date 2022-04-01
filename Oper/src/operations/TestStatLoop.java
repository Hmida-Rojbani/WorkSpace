package operations;

public class TestStatLoop {

	public static void main(String[] args) {
		int i =-5;
//		while (i>0) {
//			System.out.println(i);
//			i--;
//		}
//		
//		do {
//			System.out.println(i);
//			i--;
//		}while(i>0);
//		
//		int[] tab = {1,2,3};
//		
//		for (int j = 0, k = 8; j < tab.length; j++, k--) {
//			System.out.println(tab[j]);
//			
//		}
//		
//		for (int elt : tab) {
//			System.out.println(elt);
//		}
//		
		int[] tab = {1,2,3};
		OUTER_LOOP:for (int j = 0; j < tab.length; j++) {
			INNER_LOOP:for (int j2 = 0; j2 < tab.length; j2++) {
				if(j2 == 1)
					break OUTER_LOOP;
				System.out.println(" J : "+j+ " J2 :"+j2);
				
			}
		}
		
		OUTER_LOOP:for (int j = 0; j < tab.length; j++) {
			INNER_LOOP:for (int j2 = 0; j2 < tab.length; j2++) {
				if(j2 == 1)
					continue OUTER_LOOP;
				System.out.println(" J : "+j+ " J2 :"+j2);
				
			}
		}
		
	}
}
