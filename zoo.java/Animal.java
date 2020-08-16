
public  class Animal  {
	String name="";
	boolean flag=false;
	
	public Animal() {
		
	}
	
	public Animal(String name) {
	this.name=name;
	}
	
	public String getSpecies() {
		return "";
	}
	
	public String getName() {
		return name;
	}
	
	public boolean amIHome() {
		return flag;
	}
	
	public String areYouHome() {
		return "I am sleeping at home";
	}
	
	public void goHome() {
		System.out.println("sending the anmial go home now......");
		flag=false;
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
	
	public String huntOrGraze() {
		return "I'm hungry,let's graze";
	}
}
