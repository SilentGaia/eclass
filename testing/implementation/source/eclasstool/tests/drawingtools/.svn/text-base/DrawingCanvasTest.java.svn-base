package eclasstool.tests.drawingtools;

import eclasstool.model.drawingtools.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class DrawingCanvasTest {

	@Test
	public void testGetNodePrototypes() {
		DrawingCanvas canvas = new DrawingCanvas();
		int nodeCount = canvas.getNodePrototypes().length;
		
		assertEquals(2, nodeCount);
	}

	@Test
	public void testGetEdgePrototypes() {
		DrawingCanvas canvas = new DrawingCanvas();
		int edgeCount = canvas.getEdgePrototypes().length;
		
		assertEquals(1, edgeCount);
	}

	@Test
	public void testGetNodes() {
		DrawingCanvas canvas = new DrawingCanvas();
		int nodeCount = canvas.getNodes().size();
		
		assertEquals(0, nodeCount);
	}

	@Test
	public void testGetEdges() {
		DrawingCanvas canvas = new DrawingCanvas();
		int edgeCount = canvas.getEdges().size();
		
		assertEquals(0, edgeCount);
	}

}
