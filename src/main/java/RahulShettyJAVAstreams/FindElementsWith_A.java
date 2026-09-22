package RahulShettyJAVAstreams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class FindElementsWith_A {
	//@Test
	public void regular() {
		ArrayList<String> names = new ArrayList();
		names.add("America");
		names.add("Japan");
		names.add("australia");
		names.add("Germany");
		names.add("Antartica");
		int count=1;
		for(int i=0;i<names.size();i++) {
			String NamewithA = names.get(i);
			if(NamewithA.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
		}
	//@Test
	public void regular2() {
		ArrayList<String> names=new ArrayList();
		names.add("America");
		names.add("Japan");
		names.add("australia");
		names.add("Germany");
		names.add("Antartica");
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	}
	
	//@Test
	public void streamMap() {
		Stream.of("Mango","Orange","Apple","Gogo").filter(s->s.endsWith("o")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
}
	@Test
	public void streamMap2() {
		//List 1
		String []a= {"Apples","Mango","grapes","sapota"};
		List<String>a2=Arrays.asList(a);
		//List 2
		ArrayList<String> names = new ArrayList();
		names.add("Carrot");
		names.add("Potato");
		names.add("Tomato");
		//Concatnate two lists
		Stream<String> newname =  Stream.concat(names.stream(), a2.stream());
		newname.filter(s->s.endsWith("o")).sorted().forEach(s->System.out.println(s));
		//in just sorted order
		newname.sorted().forEach(s->System.out.println(s));
		}
	}

