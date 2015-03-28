package eclasstool.model.presentation;

import java.util.ArrayList;
import eclasstool.model.layers.*;

/**
 *  The Presentation object is derived from the main view 
 *  of Sections 2.2 and 2.3 of the requirements. 
 *
 * @author Leah Pichay (lpichay@calpoly.edu)
 * @author Jordan Tang (takong@calpoly.edu)
 * @author Tammy Kong (takong@calpoly.edu)
 */

public class Presentation
{
    /**
     * Title of specific presentation file user is viewing
     */
    private String title;
    /**
     * Consists of all the slides in presentation
     */
    private ArrayList<Slide> slides;
    /**
     * Index of current active slide being shown
     */
    private int currentSlide;
    
    /**
     * Presentation with a title and the list of slides.
     * Initializes list of slides.
     */
    public Presentation()
    {
        slides = new ArrayList<Slide>();
        currentSlide = 0;
    }
    
    /**
     *  Adds a slide to the slides collection.
     *
     * @param newSlide - Slide to be added.
     */
    public void add(Slide newSlide) 
    {
        slides.add(newSlide);
        System.out.println("Number of slides: " + slides.size());
    }
    /**
     * Deletes a slide from the collection
     * @param slide - index of slide to be deleted
     */
    public void delete(int slide)
    {
        slides.remove(slide);
        System.out.println("Number of slides: " + slides.size());
    }

    /**
     *  Edits current slide from the slides collection
     *  in the LectureEditor window.
     */
    /*@
      requires
        //
        // The current slide is a valid slide number.
        //
        (currentSlide < slides.size())
        &&
        (currentSlide >= 0);
    @*/
    public void edit()
    {
        System.out.println("In Presentation.edit()");
    }

    /**
     *  Shows a slide from the slides collection.
     */
    /*@
      requires
        //
        // The current slide is a valid slide number.
        //
        (currentSlide < slides.size())
        &&
        (currentSlide >= 0);
    @*/
    public void present()
    {
        System.out.println("In Presentation.present");
    }

    /**
     *  Changes slide shown in a presentation to the slide after.
     */
    /*@
      requires currentSlide < slides.size();
      ensures currentSlide == \old(currentSlide) + 1;
      @*/
    public void next()
    {
        // System.out.println("In Presentation.next");
        if (currentSlide < slides.size() + 1) {
            ++currentSlide;
        }
    }

    /**
     *  Changes slide shown in a presentation to the slide before.
     */
    /*@
      requires currentSlide > 1;
      ensures currentSlide == \old(currentSlide) - 1;
      @*/
    public void previous()
    {
        // System.out.println("In Presentation.previous");
        if (currentSlide > 0)
        {
            --currentSlide;
        }
    }

    /**
     *  Changes slide shown in a presentation to the first slide.
     */
    /*@
      requires slides.size() > 0;
      ensures currentSlide == 0;
      @*/
    public void first()
    {
        // System.out.println("In Presentation.first");
        currentSlide = 0;
    }

    /**
     *  Changes slide shown in a presentation to the last slide.
     */
    /*@
      requires currentSlide < slides.size();
      ensures currentSlide == slides.size() - 1;
      @*/
    public void last()
    {
        // System.out.println("In Presentation.last");
        if (currentSlide > 0) {
            currentSlide = slides.size() - 1;
        }
    }

    /**
     *  Changes slide shown in a presentation by given index.
     *
     * @param index Index of slide to be shown in viewer.
     */
    /*@
      requires
        //
        // The index given is a valid slide number.
        //
        (index < slides.size());
    @*/
    public void search(int index)
    {
        if (index < slides.size())
        {
            currentSlide = index;
            // System.out.println("In Presentation.search");
            // System.out.println("Changed Presentation.currentSlide.");
        }
    }

    /**
     *  Returns the active slide in the collection of slides.
     *
     * @return The currently selected slide.
     */
    /*@
      requires
        //
        // The index is a valid slide number
        // and there are slides saved.
        //
        (slides.size() > 0)
        &&
        (currentSlide >= 0)
        &&
        (currentSlide < slides.size());
    @*/
    public Slide getCurrentSlide() 
    {
        return slides.get(currentSlide);
    }
    /*@
      requires
      //
      // The index is a valid slide number.
      //
      (currentSlide >= 0)
      &&
      (currentSlide < slides.size());
    @*/
    public int getCurrentSlideNum()  {
    	return currentSlide;
    }
    
    /*@
      requires
      //
      // Slides have been created.
      //
      (slides.size() > 0);
    @*/
    public Slide[] getSlides() {
        return slides.toArray(new Slide[slides.size()]);
    }
}
