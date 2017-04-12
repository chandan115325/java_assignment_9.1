import java.util.ArrayList;
import java.util.Iterator;

 class HDTV {
	String Brandname;
	int Size;
	
	public HDTV(String brand_name, int size)
	{
		this.Brandname = brand_name;
		this.Size = size;
	}
}

  class ArrayListExamples{
	 
	public static void main(String[] args)
	{
	HDTV tv1 = new HDTV("Samsung",48);
	HDTV tv2 = new HDTV("Sony",48);
	HDTV tv3 = new HDTV("VU",48);
	
	ArrayList<HDTV>tv = new ArrayList<HDTV>();
	
	tv.add(tv1);
	tv.add(tv2);
	tv.add(tv3);
	
	Iterator itr =  tv.iterator();
	
	while(itr.hasNext())
	{
		HDTV t = (HDTV)itr.next();
		System.out.println("Brandname :"+t.Brandname+", Size :"+t.Size);
	}
	}
}