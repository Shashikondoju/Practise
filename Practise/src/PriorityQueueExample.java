import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pr=new PriorityQueue<Integer>();
		pr.add(100);
		pr.add(1);
		pr.add(211);
		pr.add(411);
		pr.add(131);
		pr.add(121);
//		System.out.println(pr.poll());
		System.out.println(pr);
	}
}
