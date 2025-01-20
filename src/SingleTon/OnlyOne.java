package SingleTon;
//Using Singleton class there is only one object is shared among all the classes.
//only one copy is used i.e called singleton object.
public class OnlyOne {
  //create private Constructor
	private OnlyOne() {

	}
/*    So if we make private constructor then we cannot access oustdie the class
	then class create object itself insicde class 
*/	private static OnlyOne onlyOneObj;

	
      public static OnlyOne getObject() {
		if (onlyOneObj == null) {
			System.out.println("inside if");
		 onlyOneObj = new OnlyOne();	;
		} 
		return onlyOneObj;
	}
}
