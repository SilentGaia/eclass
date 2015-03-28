package presentation;

import java.util.List;

/**
 * The Presentation object is derived from the main view 
 * of Sections 2.2 and 2.3 of the requirements. 
 */
 
public abstract class Presentation
{
    String title; // Title of specific presentation file user is viewing
    List<Slide> slides;  // Consists of all the slides in specific presentation file
    int currentSlide; // index of current active slide being shown
	
	/**
	 *  Adds a slide to the slides collection.
	 */
	abstract void add(Slide newSlide);

	/**
	 *  Edits a slide from the slides collection.
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
	abstract void edit();

	/**
	 * Shows a slide from the slides collection.
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
	abstract void present();
	
	/**
	 * Changes slide shown in a presentation to the slide after.
	 */
	/*@
      requires currentSlide < slides.size();
      ensures currentSlide == \old(currentSlide) + 1;
     @*/
	abstract void next();
	
	/**
	 * Changes slide shown in a presentation to the slide before.
	 */
	/*@
      requires currentSlide > 1;
      ensures currentSlide == \old(currentSlide) - 1;
     @*/
	abstract void previous();
	
	/**
	 * Changes slide shown in a presentation to the first slide.
	 */
	/*@
      requires slides.size() > 0;
      ensures currentSlide == 0;
     @*/
	abstract void first();
	
	/**
	 * Changes slide shown in a presentation to the last slide.
	 */
	/*@
      requires currentSlide < slides.size();
      ensures currentSlide == slides.size() - 1;
     @*/
	abstract void last();
	
	/**
	 * Changes slide shown in a presentation by given index.
	 */
	/*@
	  requires
	    //
        // The index given is a valid slide number.
        //
	    (index < slides.size());
	@*/
	abstract void search(int index);
}
