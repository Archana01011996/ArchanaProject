package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Streams {

	public static void main(String[] args) {
		
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Archana");
		names.add("RenukaPrasad");
		names.add("Arnav");
		names.add("Abhinav");
		names.add("Ram");
		//1.There is no life for intermediate op if there is no terminal op
		//names.stream().filter(s->s.startsWith("A")).count();
	//	filter(s->s.startsWith(=  intermediate operator
		//count=terminal operatorn 
		//2.terminal operation will execute only if inter op(filter) returns true
		//3.we can create stream
		//4.how to use filter in Stream API
		
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		//creating stream
		Long d=Stream.of("Archana","RenukaPrasad","Arnav","Abhinav","Ram").filter(s->
		{
		s.startsWith("A");
		return true;
		}
		).count();
	
		
		System.out.println(c);
		
		//printing all the names in arraylisy who have length>4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//to fetching first and only 1 match which has length>4
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		//converting names to uppercase
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println());
		//sort  //
		names.stream().sorted().forEach(s->System.out.println(s));
		
		List<String> name=Arrays.asList("Archana","RenukaPrasad","Arnav","Abhinav","Ram");
		name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> names1=Arrays.asList("Man","Don","Women");
	Stream<String>	newStream=Stream.concat(names.stream(),names1.stream());
//	newStream.sorted().forEach(s->System.out.println(s));
	//match argument
   boolean flag =newStream.anyMatch(s->s.equalsIgnoreCase("Archana"));
   Assert.assertTrue(flag);
	
   List<String> ls=Stream.of("Archana","RenukaPrasad","Arnav","Abhinav","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
  System.out.println( ls.get(0));
	
  //get unique number printed
  
  List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
  //print unique number
  values.stream().distinct().forEach(s->System.out.println(s));
  //for getting 3 rd index item after sorting
  List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
  System.out.println(li.get(2));
  
  
	
	}

}
