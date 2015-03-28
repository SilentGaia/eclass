package eclasstool.model.presentation;

import java.util.*;
import java.io.*;
import eclasstool.model.layers.*;

/**
 *  The Slide is the implementation of a slide in a lecture
 *  
 *  A Slide is formatted in the Lecture Editor and
 *  viewed and presented in the Presentation Viewer.
 *
 * @author Jordan Tang (jtang22@calpoly.edu)
 * @author Leah Pichay (lpichay@calpoly.edu)
 */
public class Slide {

    /**
     * Name of the slide.
     */
    private String name;

    /**
     * Check to see if slide is shown in a lecture.
     */
    private boolean active;
    private String content;
    /**
     * Layer manager for this slide
     */
    private LayersManager layersManager;
    /**
     * Object representaiton of a slide
     * Initializes with a layer manager
     */
    public Slide(LayersManager layersManager) 
    {
        this.layersManager = layersManager;
    }
    public void addText(String string)
    {
        content = string;
    }
    public String getText()
    {
        return content;
    }
    /**
     *  Returns the layers for each slide.
     *
     * @return manager of the layers of a slide.
     */
    /*@
      requires
        //
        //layersManager is initialized
        //
        (layersManager != null);
    @*/
    public LayersManager getLayers() {
        return layersManager;
    }
    
    public String getSlideContent() {
        StringBuilder contentBuilder = new StringBuilder();
/*
        try {
            //BufferedReader in = new BufferedReader(new FileReader("presentation1/slide1.html"));
            BufferedReader in = new BufferedReader(new
            String str;
            while ((str = in.readLine()) != null) {
                contentBuilder.append(str);
            }
            in.close();
        } catch (IOException exc) {
            System.out.println("Bye bye.");
        }
*/
        Scanner scanner = new Scanner(getClass().getClassLoader().
            getResourceAsStream("eclasstool/view/presentation/lectureMockup.html"));
        while (scanner.hasNextLine())
        {
            contentBuilder.append(scanner.nextLine());
        }
        return contentBuilder.toString();
    }
}
