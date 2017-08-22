
public class PlusTen extends Observer {

	 public PlusTen(Subject subject){
		this.subject =subject;
		this.subject.attach(this);
	}
	public void update(){
			System.out.println("Plus Ten:"+(subject.getState()+10));
		}

}
