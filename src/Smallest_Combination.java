import java.util.ArrayList;
import entities.Pair;

public class Smallest_Combination {
	
	public static int computeSmallestValue(int num) {
		ArrayList<Pair> al = new ArrayList<Pair>();
		
		for(int i = 1; i < num; i++) {
			if (num % i == 0) {
				int k = num / i;
				al.add(new Pair(i,k));
			}
		}
		
		int minSum = al.get(0).sumOfElements();
		
		for(int i = 0; i < al.size(); i++) {
			if(al.get(i).sumOfElements() < minSum) {
				minSum = al.get(i).sumOfElements();
			}
		}
		
		return minSum;	
	}
	
	public static void main(String[] args) {
		int A = 456;
		
		// It works correctly :)
		System.out.println(computeSmallestValue(A));
	}

}
