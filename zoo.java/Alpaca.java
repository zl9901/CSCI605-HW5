
public class Alpaca extends Animal  {
	String name="";
	boolean flag=false;
	public Alpaca() {
		
	}
	
	public Alpaca(String name) {
	this.name=name;
	}
	
	public String getSpecies() {
		boolean flag=false;
		return "Alpaca";
	}
	
	public String getName() {
		return name;
	}
	
	public boolean amIHome() {
		return flag;
	}
	
	public void goHome() {
		flag=true;
		System.out.println("sending the anmial go home now......");
	}
	
	public String huntOrGraze() {
		return "I'm hungry,let's graze";
	}
}
