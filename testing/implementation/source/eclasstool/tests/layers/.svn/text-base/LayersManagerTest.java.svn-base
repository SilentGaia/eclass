package eclasstool.tests.layers;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import eclasstool.model.layers.*;

/****
 *
 * Class LayersManagerTest is the companion testing class for <a href=
 * LayersManager.html>LayersManager </a>.  It implements the following module
 * test plan:
 *                                    <pre>
 *    Phase 1: Unit test the constructor.
 *
 *    Phase 2: Unit test the simple get/set methods: 
 *        getCurLayer, setCurLayer.
 *
 *    Phase 3: Unit test add, saving the constructed results for subsequent
 *             tests.
 *
 *    Phase 4: Unit test getCurLayer, using items added in Phase 3.
 *
 *    Phase 5: Unit test delete, deleting the items added in Phase 3.
 *
 *    Phase 6: Repeat phases 1 through 5.
 * 
 *    Phase 7: Stress test by constructing and destruction layers collection of 
 *             100000 elements.
 *                                   </pre>
 */


public class LayersManagerTest {
	LayersManager tester;
                 	
	@Test
        public void testLayersManager() {
		tester = new LayersManager(null);
        	assertTrue(tester != null);
        	assertEquals(1, tester.getListSize());
	}

    	@Test
        public void testAddLayer() {
    		tester = new LayersManager(null);
			assertEquals(1, tester.getListSize());
			tester.addLayer();
			assertEquals(2, tester.getListSize());
			tester.addLayer();
			assertEquals(3, tester.getListSize());
        }

    	@Test
        public void testDeleteLayer() {
    		tester = new LayersManager(null);
			tester.addLayer();
			tester.addLayer();
			tester.addLayer();
			tester.addLayer();
			assertEquals(5, tester.getListSize());
			tester.deleteLayer();
			assertEquals(4, tester.getListSize());
        }


    	@Test
        public void testListSize() {
		tester = new LayersManager(null);
		for(int ndx = 0; ndx < 5; ndx++)
                {
			tester.addLayer();
                }
		assertEquals(5, tester.getListSize());
        }

}
