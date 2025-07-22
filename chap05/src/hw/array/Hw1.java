package hw.array;

public class Hw1 {

	public static void main(String[] args) {
		int[] hight = {152, 180, 165, 158, 171};
		
//		Arrays.sort(hight);
//		
//		for (int i = 0; i < hight.length; i++) {	
//			System.out.println(hight[i]);
//		}
		
	    for (int i = 0; i < hight.length - 1; i++) {
	        for (int j = 0; j < hight.length - i - 1; j++) {
	            if (hight[j] > hight[j + 1]) {
	                int temp = hight[j];
	                hight[j] = hight[j + 1];
	                hight[j + 1] = temp;
	            }
			}
		}
	    
	    for (int i = 0; i < hight.length; i++) {
			System.out.println(hight[i]);
		}
	} 
}
