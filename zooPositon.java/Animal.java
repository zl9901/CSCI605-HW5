
public  class Animal  {
	String name="";
	int id=0;
	int x=0;
	int y=0;
	boolean flag=false;
	
	public Animal() {
		
	}
	
	public Animal(String name,int id) {
	this.name=name;
	this.id=id;
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
