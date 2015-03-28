package presentation;
import java.util.Collection;
/**
 * The Slide is the implementation of one slide 
 * in the Insert Lecture window for the E-Classroom.
 * The Slide contains the content of a slide.
 */
public abstract class Slide {

	/**
	 *Name of the slide
	 */
	String name;

	/**
	 * Check to see if slide is shown in LectureContent
	 */
	boolean active;

	/**
	 * Consists of all HTML text in slide
	 */
	Collection<HTMLElement> html;

	/**
	 * Consists of all text content in slide
	 */
	Collection<String> content;

	/**
	 * Adds an image to the specific slide.
	 */
	/*@
		requires
			//
			//filepath to image exists
			//
			(image.path != null);
	@*/
	abstract void addImage(Image image);

	/**
	 * Adds text to the specific slide.
	 */
	/*@
		requires
			//
			//string is not empty
			//
			(string != null);
		
		ensures
			//
			//string is is in the content of the Slide
			//
			(content.contains(string));
	@*/
	abstract void addText(String string);

	/**
	 * Refreshes slide to display text and format.
	 */
	/*@
		requires
			//
			// Makes sure slide has content to display
			//
			(html != null && content != null);

		ensures
		 (*most current content and images are displayed*);
	@*/
	abstract void renderHTML();
}
