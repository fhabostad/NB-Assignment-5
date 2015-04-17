import java.time.Duration;
/**
 * Write a description of class News here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class News extends AudioTrack
{
    private String title; // Title/heading of the news story
    private String newsStory;//News story (a short description of the news)
    private String journalistName;//Name of the journalist
    private Duration duration; //Duration (mm:ss)
    private Duration dateProduced;//Date produced
    private Duration dateBroadcasted;//Date broadcasted
    private String reference; //Reference to the medium containing the news.

    /**
     * Constructor for objects of class News
     */
    public News()
    {
        News(newsStory, journalistName, dateProduced, dateBroadcasted);
    }

    /**
     * 
     */
    public void News(String newsStory, String journalistName, Duration dateProduced, Duration dateBroadcasted)
    {
        this.title = title;
        this.duration = duration;
        this.reference = reference;
        this.newsStory = newsStory;
        this.journalistName = journalistName;
        this.dateProduced = dateProduced;
        this.dateBroadcasted = dateBroadcasted;
    }
}
