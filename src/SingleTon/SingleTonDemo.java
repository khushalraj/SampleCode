package SingleTon;

public class SingleTonDemo {
	public static void main(String[] args) {
		OnlyOne obj1 = OnlyOne.getObject();
		OnlyOne obj2 = OnlyOne.getObject();
		if (obj1.equals(obj2))
			System.out.println("objects are equal!!");
		else
			System.out.println("objects are not equal!!");

	}
}
