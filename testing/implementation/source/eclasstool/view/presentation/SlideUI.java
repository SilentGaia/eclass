package eclasstool.view.presentation;
import java.awt.Color;
import java.util.*;

import javax.swing.*;

import eclasstool.model.drawingtools.DrawingCanvas;
import eclasstool.view.drawingtools.*;
import eclasstool.view.layers.CustomListCellRenderer;
import eclasstool.model.layers.*;

public class SlideUI extends JLayeredPane {
	private JEditorPane lectureContent;
	private ArrayList<CanvasPanel> privateLayers;
	private ArrayList<CanvasPanel> publicLayers;
	private DrawingToolsUI toolbox;
	//private JEditorPane jEditorPane;
	private LayersManager manager;
	private int currentPrivateLayer;
	private int currentPublicLayer;
	private DefaultListModel publicModel, privateModel;
	private javax.swing.JList publicList;
	private javax.swing.JList privateList;
	private boolean listsInited;

	/**
	 * Default constructor for an empty slide.
	 * @param toolbox drawing toolbar toolbox for the overall classroom
	 */
	public SlideUI(DrawingToolsUI toolbox)  {
		super();
		initLectureContent();
		initComponents(toolbox);
		lectureContent.setText("");
		publicList = new javax.swing.JList();
		privateList = new javax.swing.JList();
		publicModel = new DefaultListModel();
		privateModel = new DefaultListModel();
		publicList.setCellRenderer(new CustomListCellRenderer());
		privateList.setCellRenderer(new CustomListCellRenderer());
		publicList.setModel(publicModel);
		privateList.setModel(privateModel);
		listsInited = false;
	}

	/**
	 * Constructor for a pre-set slide.
	 * @param toolbox Drawing toolbar toolbox for the overall classroom
	 * @param string HTML for the pre-set slide content.
	 */
	public SlideUI(DrawingToolsUI toolbox, String string)  {
		//this.lectureContent = lectureContent;
		//lectureContent.setBounds(0, 0, 780, 413);
		//lectureContent.setOpaque(true);
		//add(lectureContent);
		//lectureContent.setMinimumSize(new java.awt.Dimension(440, 213));
		//lectureContent.setPreferredSize(new java.awt.Dimension(440, 213));
		//super();
		System.out.println(string);
		initLectureContent();
		lectureContent.setText(string);
		initComponents(toolbox);
		publicList = new javax.swing.JList();
		privateList = new javax.swing.JList();
		publicModel = new DefaultListModel();
		privateModel = new DefaultListModel();
		publicList.setCellRenderer(new CustomListCellRenderer());
		privateList.setCellRenderer(new CustomListCellRenderer());
		publicList.setModel(publicModel);
		privateList.setModel(privateModel);
		listsInited = false;
		moveToFront(lectureContent);
		repaint();
	}

	/**
	 * Returns the DefaultListModel object for the public layers model.
	 * @return DefaultListModel object for the public layers model.
	 */
	public DefaultListModel getPublicModel()  {
		return publicModel;
	}

	/**
	 * Returns the DefaultListModel object for the private layers model.
	 * @return DefaultListModel object for the private layers model.
	 */
	public DefaultListModel getPrivateModel()  {
		return privateModel;
	}

	/**
	 * Returns the JList object for the public layers list.
	 * @return JList object for the public layers list.
	 */
	public JList getPublicList()  {
		return publicList;
	}

	/**
	 * Returns the JList object for the private layers list.
	 * @return JList object for the private layers list.
	 */
	public JList getPrivateList()  {
		return privateList;
	}

	/**
	 * Initialized the components of the Slide.
	 * @param toolbox The default Drawing tools toolbox.
	 */
	public void initComponents(DrawingToolsUI toolbox)  {
		currentPrivateLayer = 0;
		currentPublicLayer = 0;
		this.manager = new LayersManager(toolbox);
		this.toolbox = toolbox;
		this.setMinimumSize(new java.awt.Dimension(780, 1009));
		this.setPreferredSize(new java.awt.Dimension(780, 1009));
		add(lectureContent);
		lectureContent.setBounds(0, 0, 780, 1009);
		privateLayers = new ArrayList<CanvasPanel>();
		publicLayers = new ArrayList<CanvasPanel>();
		addLayer(true);
		addLayer(false);	
		moveToFront(privateLayers.get(0));

	}

	/**
	 * Initialized the lecture content.
	 */
	public void initLectureContent()  {
		lectureContent = new JEditorPane();
		lectureContent.setContentType("text/html");
		lectureContent.setMinimumSize(new java.awt.Dimension(780, 1009));
		lectureContent.setPreferredSize(new java.awt.Dimension(780, 1009));
	}

	/**
	 * Adds a layer to the public list if it is public, else, adds a layer to
	 * the private list.
	 * @param isPublic True if belongs in public list, false if belongs in private list.
	 */
	public void addLayer(boolean isPublic)  {
		DrawingCanvas canvas = new DrawingCanvas();
		DrawingToolBar toolbar = toolbox.getToolBar();
		CanvasPanel currLayer = new CanvasPanel(toolbar, canvas);
		currLayer.setBounds(0, 0, 780, 1009);
		currLayer.setOpaque(false);
		currLayer.setBackground(new Color(0,0,0,0));
		add(currLayer);
		if(isPublic)  {
			publicLayers.add(currLayer);
			currentPublicLayer++;
		}
		else  {
			privateLayers.add(currLayer);
			currentPrivateLayer++;
		}
	}

	/**
	 * Returns the index of the current layer.
	 */
	public void getLayerIndex()  {
		System.out.println("Private layer index: " + getIndexOf(privateLayers.get(1)));
	}

	/**
	 * Moves the current slide to the front of the JLayeredPane
	 * @param isPublic The variable for whether or not a layer is public.
	 * @param index The current index of the layer.
	 */
	public void moveCurrToFront(boolean isPublic, int index)  {
		index--;
		moveToFront(isPublic ? publicLayers.get(index) : privateLayers.get(index));
		//setPosition(isPublic ? publicLayers.get(index) : privateLayers.get(index), PALETTE_LAYER);
	}
	
	public void getLayer(boolean isPublic, int index)  {
		for(int i = 0; i < publicLayers.size(); i++)  {
			moveToFront(publicLayers.get(i));
		}
		for(int i = 0; i < privateLayers.size(); i++)  {
			moveToFront(privateLayers.get(i));
		}
		moveToFront(isPublic ? publicLayers.get(index) : privateLayers.get(index));
	}
	/**
	 * Returns the layer manager model..
	 * @return Returns the LayersManager model.
	 */
	public LayersManager getLayersManager()  {
		return manager;
	}

	/**
	 * Returns whether or not the lists have been initiated yet.
	 * @return True if lists have been initiated, else, returns false.
	 */
	public boolean getListsInited()  {
		return listsInited;
	}

	/**
	 * Sets the private instance variable listsInited to the passed in
	 * boolean variable.
	 * @param bool The boolean variable that listsInited is to be set to.
	 */
	public void setListsInited(boolean bool)  {
		listsInited = bool;
	}
	
	/**
	 * Edits the lecture content.
	 * @param string HTML for the lecture content.
	 */
	public void editLectureContent(String html)  {
		System.out.println("In editLectureContent");
		lectureContent.setText(html);
		repaint();
	}
	
	
}
