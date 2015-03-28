package eclasstool.tests.layers;


import static org.junit.Assert.*;

import org.junit.Test;
import eclasstool.model.layers.*;

public class LayerTest {
	Layer tester;


	@Test
	public void testLayer() {
		tester = new Layer(null);
		assertTrue(tester != null);
		assertEquals(true, tester.getVisibility());
        assertEquals(0, tester.getBkgOpacity());
		assertEquals(100, tester.getInkOpacity());
	}

	@Test
	public void testAdjustBKG() {
		tester = new Layer(null);
		assertEquals(0, tester.getBkgOpacity());
		tester.adjustBKG(61);
		assertEquals(61, tester.getBkgOpacity());
	}

	@Test
	public void testAdjustInk() {
		tester = new Layer(null);
		assertEquals(100, tester.getInkOpacity());
		tester.adjustInk(46);
		assertEquals(46, tester.getInkOpacity());
	}

	@Test
	public void testChangeVisbility() {
		tester = new Layer(null);
		assertEquals(true, tester.getVisibility());
		tester.changeVisibility();
		assertEquals(false, tester.getVisibility());
	}
	
}
