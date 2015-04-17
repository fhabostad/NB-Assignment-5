import java.util.ArrayList;
import java.time.Duration;
/**
 * Write a description of class CD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CD extends PhysicalMedia
{
    private String title; //Title of the album
    private String artistName; //Name of artist (if the CD is a collection of various artists, use
    //“Various Artists” as name)
    private int yearReleased; //Year released
    private String recordLabel; //Record label (EMI, Polygram, Sony, Warner Music Group etc)
    private Duration totalDuration; //Total duration (sum of the duration of each track)
    private ArrayList<Media> trackList; //Tracks (as an ArrayList where the index in the list corresponds to
    //the number of the track on the CD)
    private int archiveNumber; //Archive number
    
    
    /**
     * Constructor for objects of class CD
     */
    public CD()
    {
        cdMake(artistName, yearReleased, recordLabel, totalDuration);
    }

    /**
     *
     */
    public void cdMake(String artistName, int yearReleased, String recordLabel, Duration totalDuration)
    {
        this.title = getTitle();
        this.archiveNumber = getArchiveNumber();
        this.artistName = artistName;
        this.yearReleased = yearReleased;
        this.recordLabel = recordLabel;
        this.totalDuration = totalDuration;
        trackList = getTrackList();                
    }
}
