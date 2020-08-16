

public class Storage {
	 public static boolean testAdd()     {
		 MyList<String> aStorage = new MyLinkedList<String>();
	        String theStrings[] = { "a", "b", "c" };
	        boolean rValue = true;
	        for ( int index = 0; index < theStrings.length; index ++ )
	                aStorage.addLast(theStrings[index]);
	        for ( int index = 0; index < theStrings.length; index ++ )
	                rValue &= aStorage.removeFirst().equals(theStrings[index]);
//	        rValue &= aStorage.removeLast() == null;
//	        aStorage.add("c");
	        if(rValue) {
	        	System.out.println("testAdd success");
	        }
	        return rValue;
	    }
	 
	   public static void exampleOfHowToUseIt(MyLinkedList<String> aStorage)   {
//		   aStorage.add("a");
	        aStorage.add(0, "0");
	        aStorage.add(aStorage.size(), "1");
	        aStorage.add(aStorage.size() + 1, "2");
	        //System.out.println("aStorage: " + aStorage );
	        for(int i=0;i<aStorage.size();i++) { 
	        	System.out.println("aStorage: " +aStorage.head.element );
	        	aStorage.head=aStorage.head.next;
	        }
	    }
	   
	   public static boolean testRemoveIndex() {
		   MyList<String> aStorage = new MyLinkedList<String>();
		   String theStrings[] = { "a", "b", "c" };
	        boolean rValue = true;
	        for ( int index = 0; index < theStrings.length; index ++ )
                aStorage.addLast(theStrings[index]);
	        rValue &= aStorage.remove(1).equals(theStrings[1]);
	        if(rValue) {
	        	System.out.println("testRemoveIndex success");
	        }
	        return rValue;
	   }
	   
	   public static boolean testAddIndex() {
		   MyList<String> aStorage = new MyLinkedList<String>();
		   String theStrings[] = { "a", "b", "c" };
	        boolean rValue = true;
	        for ( int index = 0; index < theStrings.length; index ++ )
                aStorage.addLast(theStrings[index]);
	        aStorage.add(1, "d");
	        rValue &= aStorage.remove(1).equals("d");
	        if(rValue) {
	        	System.out.println("testAddIndex success");
	        }
	        return rValue;
	   }
	   
	   public static boolean testClear() {
		   MyList<String> aStorage = new MyLinkedList<String>();
		   String theStrings[] = { "a", "b", "c" };
	        boolean rValue = true;
	        for ( int index = 0; index < theStrings.length; index ++ )
                aStorage.addLast(theStrings[index]);
	        aStorage.clear();
	        if(aStorage.removeLast()==null) {
	        	System.out.println("testClear success");
	  	    	return true;
	        }else {
	        	return false;
	        }
	        //return rValue;
	   }
	      
	   
	    public static void test(MyLinkedList<String> aStorage)   {
	                if ( ! testAdd() )
	                        System.err.println("testAdd failed");
	                if ( ! testRemoveIndex() )
	                        System.err.println("testRemoveIndex failed");
	                if ( ! testAddIndex() )
	                        System.err.println("testAddIndex failed");
	                if ( ! testClear() )
	                        System.err.println("testClear failed");
	    }
	    
	    public static void main(String args[] )     {
	    	MyList<String> aStorage=new MyLinkedList<>();
	        test(new MyLinkedList<>());
	        exampleOfHowToUseIt(new MyLinkedList<String>());
	    }

}
