import java.util.Scanner;
import java.util.Random;
public class Animal1 {
	Class[] classes;
	   static Animal[] animals = {
               new polarBear("Katya",1),new Alpaca("Hans",2),new Aardvark("Bob",3),new Goldfish("Jade",4),new Palmtree("Steve",5)
        };
	   static carnivore cv= new polarBear();
	   static carnivore cv1=new Aardvark();
	   static herbivore hv=new Alpaca();
	   static herbivore hv1=new Aardvark();
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
        for ( int index = 0; index < 3; index ++ ) {
                printSpecies(animals[index]) ;
                System.out.println("My ID is "+animals[index].getID());
                printName(animals[index]) ;
                if(index==2) {
                	System.out.println("choose the way you want");
                	System.out.println("0 for hunting 1 for grazing");
                	Scanner hp=new Scanner(System.in);
                	int num=hp.nextInt();
                	if(num==0) {
                		System.out.println(cv1.hunt());
                	}
                	if(num==1) {
                		System.out.println(hv1.graze());
                	}
                }
                else if(index==1){
                	System.out.println(hv.graze());
                }else {
                	System.out.println(cv.hunt());
                }
                printHomeStatus(animals[index]) ;
                animals[index].goHome();
                printHomeStatus(animals[index]) ;
                System.out.println();
                // if I am a tiger send me to hunt and ask if I am hungry - implement 1
                // if I am a gazelle send me to graze and ask if I am hungry - implement 2
        }
        for ( int index = 3; index < animals.length; index ++ ) {
            printSpecies(animals[index]);
            System.out.println("My ID is "+animals[index].getID());
            printName(animals[index]);
            if(index==4) {
            	System.out.println("show the position where fish is");
            	animals[index].position();
            	System.out.println("choose the x and y coorinate you want the animal to move");
            	Scanner hp1=new Scanner(System.in);
            	int num1=hp1.nextInt();
            	Scanner hp2=new Scanner(System.in);
            	int num2=hp2.nextInt();
            	animals[index].move(num1,num2);
            }else {
            	System.out.println("show the position where Parmtree is");
            	animals[index].position();
            	System.out.println("choose the x and y coorinate you want the tree to move");
            	Scanner hp1=new Scanner(System.in);
            	int num1=hp1.nextInt();
            	Scanner hp2=new Scanner(System.in);
            	int num2=hp2.nextInt();
            	animals[index].move(num1,num2);
            }
            System.out.println();
        }
	}
}
