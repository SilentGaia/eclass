package eclasstool.tests.drawingtools;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.geom.Point2D;
import eclasstool.model.drawingtools.*;

import org.junit.Test;

public class PointNodeTest {

	@Test
	public void test() {
		PointNode node = new PointNode();
		node.translate(10, 10);
		assertEquals(false, node.contains(new Point2D.Double(10, 10)));
	}

}
