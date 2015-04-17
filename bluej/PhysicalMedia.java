
import java.util.ArrayList;
import java.time.Duration;
/**
 * Write a description of class Physical here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhysicalMedia extends Media
{
    // instance variables - replace the example below with your own
    private int archiveNumber;
    private String title;
    private ArrayList<Media> mediaTracks;
    /**
     * Constructor for objects of class Physical
     */
    public PhysicalMedia()
    {
        makeTrackList();       
    }
    
    /**
     * 
     */
    public void makeTrackList()
    {
        mediaTracks = new ArrayList<Media>();
        this.title = super.getTitle();
    }
    
    /**
     * 
     */
    public ArrayList<Media> getTrackList()
    {
        return mediaTracks;
    }
    
    /**
     * 
     */
    public String listAllTracks()
    {
        String audioTrackList="";
        for(Media track : mediaTracks)
        {            
            audioTrackList += track.getTitle() + "/n";
         }
        return audioTrackList;
    }
    
    /**
     * 
     */
    public int getArchiveNumber()
    {
        return archiveNumber;
    }
    
    /**
     * 
     */
    public String getTitle()
    {
        return title;
    }
}
