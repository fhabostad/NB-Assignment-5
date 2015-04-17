import java.util.HashMap;
import java.util.Set;
/**
 * This class is a mediaregistry. This class is responsible for making 
 * a new HashMap and some help functions to use it properly.
 * 
 * @author (Eirik Nesje) 
 * @version (1.0)
 */
public class MediaReg
{
    //Hashmap to keep all the Media in one place
    private HashMap<String, Media> medium;
    private Media media;

    /**
     * Constructor of MediaReg class. 
     * @Runs MediaList().
     */
    public MediaReg()
    {
        MediaList();
    }

    /**
     * Creates a new HashMap.
     */
    public void MediaList()
    {
        //make HashMap
        medium = new HashMap<String, Media>();
    }
    
    /**
     * Runs a for each loop and gets all the HashMap keys and returns them.
     * @Return the whole Medialist.
     */
    public String GetMediaList()
    {
        //return MediaList();
        String returnString = " ";
        Set<String> keys = medium.keySet();
        for(String Media : keys)
        {
            returnString += " " + Media;
        }
        return returnString;
    }
    
    /**
     * @Returns the whole HashMap list.
     */
    public HashMap<String, Media> HashMap()
    {
        return medium;
    }
    
    /**
     * Adds a media to the HashMap media list.
     */
    public void addMedia(String description, Media media)
    {
        medium.put(description, media);
    }
    
    /**
     * Removes a media from the HashMap media list.
     * @Returns the media removed.
     */
    public Media removeMedia(String description)
    {
        return medium.remove(description);
    }
    
    /**
     * Gets the media described from the mediaregistry.
     */
    public void getMedia(String description)
    {
        media = medium.get(description);
    }
    
}
