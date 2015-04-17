import java.time.Duration;
/**
 * Write a description of class AudioTracks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AudioTrack
{
    // 
    private String title;
    private String description;
    private Duration duration;
    private String reference;
    private int durationSecs;
    private int durationMins;
    
    /**
     * Constructor for objects of class AudioTracks
     */
    public AudioTrack()
    {
        audioTrack(title, duration, reference);
    }
    
    /**
     * 
     */
    public void audioTrack(String title, Duration duration, String reference)
    {
        this.title = title;
        this.duration = duration;
        this.reference = reference;
    }
       
    /**
     * 
     */
    public Duration getTrackDuration()
    {
        return duration;
    }
    
    /**
     * 
     */
    public String getTitle()
    {
        return title;
    }
    
    public String getTrackReference()
    {
        return reference;
    }
    
}
