package testngtutorial;

import org.testng.annotations.Test;

public class PS1 extends PS{
	
	@Test
	public void testRun()
	{
		doThis();  //parent class method
		PS2 ps2=new PS2(3);  //constructor
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
	//	PS3 ps3=new PS3(10);
		System.out.println(ps2.multiply());
		System.out.println(ps2.divide());
		
	}
	}
	

