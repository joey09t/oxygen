package cg;
import java.util.*;
public class Demo2 {

	public static void main(String[] args) {
		// generic collection
//		Set<String> col=new HashSet();
	//	Set<String> col=new LinkedHashSet();
	//	Set<String> col=new TreeSet<String>();

		List<String> col=new ArrayList<String>();
		
		
		col.add("Ram");
		col.add("Sham");
		col.add("Abdul");
		//col.add(55); //new Integer(55); //auto boxing
		col.add(null);

		col.add("Ganesh");
		col.add("Ram");
		System.out.println(col);
		System.out.println(col.size());
		System.out.println("=================");
		for(String s:col)
		{
			System.out.println(s);
		}
		System.out.println("=================");
		Iterator<String> it=col.iterator();
		while(it.hasNext())
		{
			String ss=it.next();
			System.out.println(ss);
		}
		

	}

}
