import java.util.ArrayList;
import java.util.List;
public class staticblock {
	private static List<String> list;

	static
	{
		 list = new ArrayList<String>();
	        list.add("Annie");
	        list.add("William");
	        list.add("Scott");
	        list.add("Malvin");
	    }
	void display() {
		System.out.println(list);
	}
	
	public static void main(String[] args)
	{
		staticblock a= new staticblock();
		a.display();
		
		
	}
}
