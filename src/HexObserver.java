
public class HexObserver extends Observer {
	public HexObserver(Subject subject){
		this.subject =subject;
		this.subject.attach(this);
	}
	public void update(){
			System.out.println("Hex strig:"+Integer.toHexString(subject.getState()));
		}
	}


