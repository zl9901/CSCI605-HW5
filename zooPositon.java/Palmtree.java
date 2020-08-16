
public class Palmtree extends Animal {
	int x=0;
	int y=0;
	String name="";
	int id=0;
	public Palmtree() {
		
	}
	
	public Palmtree(String name,int id) {
	this.name=name;
	this.id=id;
	}
	
	public String getSpecies() {
		return "PalmTree";
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
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

