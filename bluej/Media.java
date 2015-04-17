//Forsøk på å importere Duration class
//Husk å last ned nyaste Java JDK/SDK
import java.util.*;
import java.time.Duration;
/**
 * Creates a new media and adds it to a list.
 * 
 * @author (Eirik Nesje) 
 * @version (1.0)
 */
public class Media
{
    // instance variables - replace the example below with your own
    private String title;
    private int durationMins;
    private int durationSecs;
    private Media media;
    private Duration duration;
       
    /**
     * Constructor for objects of class Media
     */
    public Media()
    {
        mediaGenetics(title, duration);
    }
    
    /**
     * Makes a new HashMap for all the media and adds the media to it.
     */
    public void mediaGenetics(String title , Duration duration)
    {   
        this.title = title;
        this.duration = duration;
        //this.duration = duration;
        //media = new Media();

    }
    
    /**
     * @Return the media title.
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @Returns the duration of the media.
     */
    
    public Duration getDuration()
    {
        return duration;
    }
    
   
   /**
    * Search the media and return either the media or gives an error.
    * @Returns the media searched.
    */
   /*
   public void findMedia(String description)
   {
       //En sjekk i tilfelle nullpointer
       if(media != null)
       {
           medium.getMedia(description);
       }
       else
       System.out.println("There is no such media in the list");
   }
   */
}
