import java.time.Duration;
/**
 * Write a description of class Soundeffects here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundEffects extends AudioTrack
{
    private String title; //Title/Name of soundeffect
    private Duration duration; //Duration (mm:ss)
    private String description;//Description of the soundeffect
    private String reference; //Reference to the medium containing the sound effect.

    /**
     * Constructor for objects of class Soundeffects
     */
    public SoundEffects()
    {
        SoundEffect(description);
    }

    /**
     * 
     */
    public void SoundEffect(String description)
    {
        this.title = title;
        this.duration = duration;
        this.reference = reference;
        this.description = description;
    }
}
