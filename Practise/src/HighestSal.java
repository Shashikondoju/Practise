import java.util.Comparator;
import java.util.PriorityQueue;

public class HighestSal {
	public static void main(String[] args) {
		EmpComp com=new EmpComp();
		PriorityQueue<Employe>pr=new PriorityQueue<>(10,com);
		pr.add(new Employe("a",300));
		pr.add(new Employe("b",400));
		pr.add(new Employe("c",200));
		pr.add(new Employe("d",100));
		
		System.out.println(pr);
	}
}

class EmpComp implements Comparator<Employe>{

	@Override
	public int compare(Employe o1, Employe o2) {
		return (int) (o1.sal-o2.sal);
	}
	
}
