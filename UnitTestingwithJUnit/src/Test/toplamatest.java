package Test;

import Sinif.Islemlerim;
import junit.framework.TestCase;

public class toplamatest extends TestCase {

	private Islemlerim top;
	protected void setUp() throws Exception {
		super.setUp();
		top = new Islemlerim();
	}
	public void testim()
	{
		
		assertEquals(4,top.toplamaislemi(2, 2));
	
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		top=null;
	}

}
