
public class Aardvark extends Animal  {
	String name="";
	boolean flag=false;
	public Aardvark() {
		
	}
	
	public Aardvark(String name) {
	this.name=name;
	}
	
	public String getSpecies() {
		boolean flag=false;
		return "Aardvark";
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
	
	public String huntOrGraze(int parameter) {
		if(parameter==0) {
			return "I'm hungry,let's hunt";
		} 
		if(parameter==1){
			return "I'm hungry,let's graze";
		}else {
			return "you are wrong";
		}
	}
}
