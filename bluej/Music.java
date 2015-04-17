import java.time.Duration;
/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends AudioTrack
{
    private String title; //(name of song)        
    private Duration duration; //(mm:ss)
    private String artist;//Name of Artist
    private String reference; //Reference to the medium containing the music.
    private Duration date;//Date last played
    private int timesPlayed;//Number of times played
    /**
     * Constructor for objects of class Music
     */
    public Music()
    {
        musicTrack(artist);
    }

    /**
     * 
     */
    public void musicTrack(String artist)
    {
        this.duration = getTrackDuration();
        this.title = getTitle();
        this.reference = getTrackReference();
        this.artist = artist;
        timesPlayed = 0;
        //date = something;
        
    }
    
    public void trackPlayed()
    {
        timesPlayed = timesPlayed + 1;
    }
}
