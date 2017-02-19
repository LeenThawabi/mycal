





import static org.junit.Assert.*;

import org.junit.Test;







public class test {



	@Test

	public void test() {

		model model=new model();
		

		int r1=model.operations(8, 5, "+");

		assertTrue(r1==13);

		

		int r2=model.operations(15, 2, "-");

		assertTrue(r2==13);

		

		int r3=model.operations(5, 2, "*");

		assertTrue(r3==10);
		

		int r4=model.operations(16, 2, "/");

		assertTrue(r4==8);

		



		

		int r5=model.operations(1000000, 100, "/");

		assertTrue(r5==10000);

		

		int r6=model.operations(10000, 100000, "*");

		assertTrue(r6==1000000000);

		


		

		

	}



}
