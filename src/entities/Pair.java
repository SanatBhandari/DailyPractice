package entities;

public class Pair {
	private int first;
	private int second;
	
	public Pair(int first, int second) {
		super();
		this.first = first;
		this.second = second;
	}

	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	public int sumOfElements() {
		int sum = this.first + this.second;
		return sum;
	}

}
