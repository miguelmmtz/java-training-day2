import java.util.LinkedList;

public class SwordProblem {
	public static void main(String[] args) {
		findAliveSoldier(5,1);
	}
	public static void findAliveSoldier(int soldiers, int start) {
		LinkedList<Integer> circle = new LinkedList<Integer>();
		for(int i=1; i<=soldiers; i++) {
			circle.add(i);
		}
		
		for(int i= start-1; i < circle.size(); i++) {
			System.out.println(circle.get(i)+" vivo");
			circle.remove(i+1);
		}
	}
}
