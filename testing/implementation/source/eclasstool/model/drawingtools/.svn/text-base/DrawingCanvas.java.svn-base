package eclasstool.model.drawingtools;

import java.awt.*;
import java.util.*;

/**
   A simple canvas with round nodes and straight edges.
*/
public class DrawingCanvas extends Canvas
{
   public Node[] getNodePrototypes()
   {
      Node[] nodeTypes =
         {
            new CircleNode(Color.BLACK),
            new RectangleNode(Color.BLACK)
         };
      return nodeTypes;
   }

   public Edge[] getEdgePrototypes()
   {
      Edge[] edgeTypes = 
         {
            new LineEdge()
         };
      return edgeTypes;
   }
}