import java.util.ArrayList;
/**
 * Write a description of class Tape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tape extends PhysicalMedia
{
    private String title;//Title of the tape
    private String tapeType;//Type of tape (analog/digital)
    private ArrayList<AudioTrack> trackList; //Tracks (as an ArrayList where the index in the list corresponds to
    //the number of the track on the tape)
    private int archiveNumber;//Archive number

    /**
     * Constructor for objects of class Tape
     */
    public Tape()
    {
        tapeMake(tapeType);
    }

    /**
     * 
     */
    public void tapeMake(String tapeType)
    {
       this.title = super.getTitle();
       this.archiveNumber = super.getArchiveNumber();
       trackList = super.getTrackList();
       this.tapeType = tapeType;
    }
}
