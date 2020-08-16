import java.util.Scanner;
public class Animal1 {
	Class[] classes;
	   static Animal[] animals = {
               new polarBear("Katya"),new Ferret("Jade"),new Alpaca("Hans"),new Camel("Peter"),new Skunk("Ann"),new Aardvark("Bob")
        };
	   public static void printSpecies(Animal thisOne)      {
		   System.out.println("I am a " + thisOne.getSpecies());
	   }
	   public static void printName(Animal thisOne) {
		   System.out.println("My name is " + thisOne.getName());
	   }
	   public static void printHomeStatus(Animal thisOne)   {
		   System.out.println("I am" + ( thisOne.amIHome() ? " " : " not " ) + "home."  );
		   if ( thisOne.amIHome() ) 
			   System.out.println(thisOne.areYouHome());
	   }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class[] classes;
        for ( int index = 0; index < animals.length; index ++ ) {
                printSpecies(animals[index]) ;
                printName(animals[index]) ;
                if(index==4) {
                	System.out.println("choose the way you want");
                	System.out.println("0 for hunting 1 for grazing");
                	Scanner hp=new Scanner(System.in);
                	int num=hp.nextInt();
                	System.out.println(animals[index].huntOrGraze(num));
                }
                else if(index==5) {
                	System.out.println("choose the way you want");
                    System.out.println("0 for hunting 1 for grazing");
                    Scanner hp=new Scanner(System.in);
                    int num1=hp.nextInt();
                    	System.out.println(animals[index].huntOrGraze(num1));
                    }else {
                	System.out.println(animals[index].huntOrGraze());
                    }
                printHomeStatus(animals[index]) ;
                animals[index].goHome();
                printHomeStatus(animals[index]) ;
                System.out.println();
                // if I am a tiger send me to hunt and ask if I am hungry - implement 1
                // if I am a gazelle send me to graze and ask if I am hungry - implement 2
        }

	}
}
