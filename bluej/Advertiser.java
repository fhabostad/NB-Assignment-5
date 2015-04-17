import java.time.Duration;
/**
 * Write a description of class Advertiser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Advertiser extends AudioTrack
{ 
    private String product; //The product being advertised
    private String title; //Title of the jingle X
    private String reference; //Reference to the medium containing the jingle 
    private Duration duration;
    private String investor; //The company paying for the advertisement

    /**
     * Constructor for objects of class Advertiser
     */
    public Advertiser()
    {
        Advertise(product, investor);
    }
    
    /**
     * 
     */
    public void Advertise(String product, String investor)
    {
        this.duration = getTrackDuration();
        this.title = getTrackTitle();
        this.reference = getTrackReference();
        this.product = product;
        this.investor = investor;
    }
    
}
