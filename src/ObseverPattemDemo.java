
public class ObseverPattemDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinnaryObserver(subject);
		new OctalObserer(subject);
		new HexObserver(subject);
		new PlusTen(subject);
		
		System.out.println("First state chage: 15");
		subject.setState(15);
		subject.setState(10);

	}

}
