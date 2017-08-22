
public class BinnaryObserver extends Observer {
	public BinnaryObserver(Subject subject){
	this.subject =subject;
	this.subject.attach(this);
}
	public void update(){
		System.out.println("Binary strig:"+Integer.toBinaryString(subject.getState()));
	}
}
