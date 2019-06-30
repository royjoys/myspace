
public class SortingAlgo {

	public static int[] bubble(int[] a) {
		int temp;
		for(int i =0; i < a.length-1; i ++) {
			for(int j =0; j < a.length-1-i; j ++) {
				if(a[j] > a[j+1]) {
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
			
		}
		return a;
	}

	public static int[] selection(int[] a) {
		int temp;
		for(int i =0; i < a.length-1; i ++) {
			int min=i;
			for(int j =i+1; j < a.length; j++) {
				if(a[min]> a[j]) {
					min = j;
				}
			}
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		return a;
	}
	private static void print(int[] array) {
		System.out.print("{");
		for(int i : array) {
			System.out.print(i+", ");
		}
		System.out.print("}");
	}

	public static int[] insertion(int[] a) {
		int temp;
		for(int i =1; i < a.length; i ++) {
			int j =i;
			temp =a[j];
			while(j>0 && a[j-1] > temp) {
				a[j] = a[j-1];
				j--;
			}
			a[j]= temp;
		}
		return a;
	}

}
