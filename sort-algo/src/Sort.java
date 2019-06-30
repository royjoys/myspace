public class Sort {
	
	public static void main(String[] args) {
		
		int[] array = {12,5,7,23,2,54};
		
		//array = SortingAlgo.bubble(array);
		//array = SortingAlgo.selection(array);
		array = SortingAlgo.insertion(array);
		print(array);
		
	}

	private static void print(int[] array) {
		System.out.print("{");
		for(int i : array) {
			System.out.print(i+", ");
		}
		System.out.print("}");
	}

}
