
public class OctalObserer extends Observer {

	public OctalObserer(Subject subject){
		this.subject =subject;
		this.subject.attach(this);
	}
	public void update(){
			System.out.println("Octal strig:"+Integer.toOctalString(subject.getState()));
		}
	}