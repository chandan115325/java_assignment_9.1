import java.util.ArrayList;
import java.util.Iterator;

//a program to create a class HDTV
 class HDTV {
	String Brandname;
	int Size;
	
	//parameterized constructor to initialize the data members
	public HDTV(String brand_name, int size)
	{
		this.Brandname = brand_name;
		this.Size = size;
	}
}
//ArrayListExamples created to create HDTV objects and using ArrayList Collection to add the objects.
  class ArrayListExamples{
	 
	public static void main(String[] args)
	{
	// Three objects created of HDTV class	
	HDTV tv1 = new HDTV("Samsung",48);
	HDTV tv2 = new HDTV("Sony",48);
	HDTV tv3 = new HDTV("VU",48);
	
	//ArrayList tv is created to store the objects of HDTV
	ArrayList<HDTV>tv = new ArrayList<HDTV>();
	
	// objects are added to the ArrayList
	tv.add(tv1);
	tv.add(tv2);
	tv.add(tv3);
	//Getting Iterator
	Iterator itr =  tv.iterator();
	
	//Traversing the ArrayList object
	while(itr.hasNext())
	{
		HDTV t = (HDTV)itr.next();
		System.out.println("Brandname :"+t.Brandname+", Size :"+t.Size);
	}
	}
}