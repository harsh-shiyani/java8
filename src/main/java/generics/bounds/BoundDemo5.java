package generics.bounds;

import java.util.ArrayList;
import java.util.List;

public class BoundDemo5
{
	public static void main(String[] args)
	{
		List<Family> families = new ArrayList<>();
		List<GrandFather> grandFatherList = new ArrayList<>();
		grandFatherList.add(new GrandFather("GrandFather"));
		List<Father> fatherList = new ArrayList<>();
		fatherList.add(new Father("Father"));
		List<Son> sonList = new ArrayList<>();
		sonList.add(new Son("Son"));
		List<GrandSon> grandSonList = new ArrayList<>();
		grandSonList.add(new GrandSon("GrandSon"));


	}
	public static void addMember(List<? super Father> list)
	{
		list.add(new GrandSon("Son"));
		// list.add(new GrandFather("GF"));
		// list.add(new Family("Family"));
		list.add(new Father("Father"));
	}

}


