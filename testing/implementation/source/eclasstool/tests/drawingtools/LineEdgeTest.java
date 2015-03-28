package eclasstool.tests.drawingtools;

import eclasstool.model.drawingtools.*;
import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.geom.Point2D;

import org.junit.Test;

public class LineEdgeTest {

	private LineEdge edge;
	private CircleNode node;
	private CircleNode node2;
	
	public LineEdgeTest()
	{
		edge = new LineEdge();
		node = new CircleNode(new Color(0, 0, 0));
		node2 = new CircleNode(new Color(0, 0, 0));
	}
	
	@Test
	public void testContains() {
		node.translate(10, 10);
		node2.translate(20, 20);
		edge.connect(node, node2);
		assertEquals(node, edge.getStart());
	}

	@Test
	public void testConnect() {
		node.translate(20, 20);
		node2.translate(50, 50);
		edge.connect(node, node2);
		assertEquals(node, edge.getStart());
		assertEquals(node2, edge.getEnd());
	}

	@Test
	public void testGetStart() {
		node.translate(10, 20);
		node2.translate(30, 20);
		edge.connect(node, node2);
		assertEquals(node, edge.getStart());
	}

	@Test
	public void testGetEnd() {
		node.translate(20, 20);
		node2.translate(50, 50);
		edge.connect(node, node2);
		assertEquals(node2, edge.getEnd());
	}

}
