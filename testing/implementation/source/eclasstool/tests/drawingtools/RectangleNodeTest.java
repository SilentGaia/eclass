package eclasstool.tests.drawingtools;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.geom.Point2D;
import eclasstool.model.drawingtools.*;

import org.junit.Test;

public class RectangleNodeTest {

	@Test
	public void test() {
		RectangleNode node = new RectangleNode(new Color(0, 0, 0));
		node.translate(10, 10);
		assertEquals(true, node.contains(new Point2D.Double(10, 10)));
	}

}
