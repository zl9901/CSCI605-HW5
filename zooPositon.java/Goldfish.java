
public class Goldfish extends Animal {
	int x=0;
	int y=0;
	String name="";
	boolean flag=false;
	int id=0;
	public Goldfish() {
		
	}
	
	public Goldfish(String name,int id) {
	this.name=name;
	this.id=id;
	}
	
	public String getSpecies() {
		return "Goldfish";
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	public int numberOfFish() {
		return 100;
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
