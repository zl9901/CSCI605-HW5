
public class Aardvark extends Animal  implements carnivore,herbivore{
	int x=0;
	int y=0;
	String name="";
	boolean flag=false;
	int id=0;
	public Aardvark() {
		
	}
	
	public Aardvark(String name,int id) {
	this.name=name;
	this.id=id;
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
	
	public String areYouHome() {
		return "I am sleeping at home";
	}
	
	public void goHome() {
		flag=true;
		System.out.println("sending the anmial go home now......");
	}
	
	public int getID() {
		return id;
	}
	
	public String hunt() {
		return "I'm hungry,let's hunt";
	}
	
	public String graze() {
		return "I'm hungry,let's graze";
	}
	
	public void position() {
		 x= (int )(Math.random()*9000);
		 y=(int )(Math.random()*9000);
		System.out.println("("+x+","+y+")");
	}
	
	public void move(int num1,int num2) {
		 x=x+ num1;
		 y=y+num2;
		 System.out.println("now the new position is");
		System.out.println("("+x+","+y+")");
	}
}
