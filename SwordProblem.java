import java.util.LinkedList;

public class SwordProblem {
	public static void main(String[] args) {
		findkillerSoldier(100,1);
	}
	public static void findkillerSoldier(int soldiers, int start) {
		LinkedList<Integer> circle = new LinkedList<Integer>();
		for(int i=1; i<=soldiers; i++) {
			circle.add(i);
		}
		
		/*
		 * int killerSoldier represents the soldier who has the sword
		 */
		
		int killerSoldier;
		
		for(int i= start-1; i < circle.size() && circle.size() > 1; i++) {
			killerSoldier = circle.get(i);
			System.out.print("Soldier "+killerSoldier+" has the sword, ");
			if(killerSoldier==circle.getLast()) {
				System.out.println("soldier "+circle.getFirst()+" will die");
				circle.removeFirst();
//				System.out.println(circle);
				i=-1;
			} else if(circle.get(i+1)==circle.getLast()){
				System.out.println("soldier "+circle.get(i+1)+" will die");
				circle.remove(i+1);
//				System.out.println(circle);
				i=-1;
			} else {
				System.out.println("soldier "+circle.get(i+1)+" will die");
				circle.remove(i+1);
//				System.out.println(circle);
			}
		}
		System.out.println("\n\nSoldier "+circle+" wont die");
	}
}
