package eclasstool.tests.presentation;

import static org.junit.Assert.*;

import org.junit.Test;
import eclasstool.model.presentation.*;

/****
 *
 * Class PresentationTest is the companion testing class for <a href=
 * Presentation.html> Presentation </a>.  It implements the following module
 * test plan:
 *                                    <pre>
 *    Phase 1: Unit test the constructor.
 *
 *    Phase 2: Unit test the simple get/set methods: 
 *             getCurrentSlide, edit.
 *
 *    Phase 3: Unit test add, saving the constructed results for subsequent
 *             tests.
 *
 *    Phase 4: Unit test last, using items added in Phase 3.
 *
 *    Phase 5: Unit test getCurrentSlide, using items added in Phase 3.
 *
 *    Phase 6: Unit test previous, using items added in Phase 3.
 *
 *    Phase 7: Unit test next, using items added in Phase 3.
 *
 *    Phase 8: Unit test delete, deleting the items added in Phase 3.
 *
 *    Phase 9: Unit test first.
 *
 *    Phase 10: Unit test present, using item from Phase 9.
 *    
 *    Phase 11: Repeat phases 1 through 10.
 * 
 *    Phase 12: Stress test by constructing and destructing slides 
 *              collection of 100000 elements.
 *                                   </pre>
 */

public class PresentationTest 
{
    Presentation testPresentation;
    public PresentationTest()
    {
        testPresentation = new Presentation();
    }

    @Test
        public void testAdd() 
        {
                testPresentation = new Presentation();
		testPresentation.add(new Slide(null));
		assertEquals(1, testPresentation.getSlides().length);
        }
    @Test
	public void testDelete()
	{
		testPresentation = new Presentation();
		testPresentation.add(new Slide(null));
		testPresentation.delete(0);
		assertEquals(0, testPresentation.getSlides().length);
	}
    @Test
        public void testEdit() 
        {
        }

    @Test
        public void testPresent() 
        {
        }

    @Test
        public void testNext() 
        {
		testPresentation = new Presentation();
		Slide temp1 = new Slide(null);
		testPresentation.add(temp1);
		Slide temp2 = new Slide(null);
		testPresentation.add(temp2);
		testPresentation.first();
		testPresentation.next();
		assertEquals(temp2, testPresentation.getCurrentSlide());
        }

    @Test
        public void testPrevious() 
        {
		testPresentation = new Presentation();
                Slide temp1 = new Slide(null);
                testPresentation.add(temp1);
                Slide temp2 = new Slide(null);
                testPresentation.add(temp2);
		Slide temp3 = new Slide(null);
		testPresentation.add(temp3);
                testPresentation.last();
                testPresentation.previous();
                assertEquals(temp2, testPresentation.getCurrentSlide());
        }

    @Test
        public void testFirst() 
        {
		testPresentation = new Presentation();
                Slide temp1 = new Slide(null);
                testPresentation.add(temp1);
                Slide temp2 = new Slide(null);
                testPresentation.add(temp2);
                Slide temp3 = new Slide(null);
                testPresentation.add(temp3);
                testPresentation.last();
		testPresentation.first();
		assertEquals(temp1, testPresentation.getCurrentSlide());
        }

    @Test
        public void testLast() 
        {
		testPresentation = new Presentation();
                Slide temp1 = new Slide(null);
                testPresentation.add(temp1);
                Slide temp2 = new Slide(null);
                testPresentation.add(temp2);
                Slide temp3 = new Slide(null);
                testPresentation.add(temp3);
                testPresentation.first();
		testPresentation.last();
		assertEquals(temp3, testPresentation.getCurrentSlide());
        }

    @Test
        public void testSearch() 
        {
		testPresentation = new Presentation();
                Slide temp1 = new Slide(null);
                testPresentation.add(temp1);
                Slide temp2 = new Slide(null);
                testPresentation.add(temp2);
                Slide temp3 = new Slide(null);
                testPresentation.add(temp3);
                testPresentation.search(1);
		assertEquals(temp2, testPresentation.getCurrentSlide());
        }

    @Test
        public void testGetCurrentSlide() 
        {
		testPresentation = new Presentation();
                Slide temp1 = new Slide(null);
                testPresentation.add(temp1);
		assertEquals(temp1, testPresentation.getCurrentSlide());

                Slide temp2 = new Slide(null);
                testPresentation.add(temp2);
        	assertEquals(temp2, testPresentation.getCurrentSlide());
	}
}
