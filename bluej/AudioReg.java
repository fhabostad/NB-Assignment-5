import java.util.ArrayList;
/**
 * Write a description of class AudioReg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AudioReg
{
    //ArrayList to keep all the AudioTracks in one place
    private ArrayList<AudioTrack> audioRegistry;
    /**
     * Makes a Arraylist with Audiotracks
     */
    public AudioReg()
    {
        makeAudioList();
    }

    /**
     * 
     */
    public void makeAudioList()
    {
        //make ArrayList
        audioRegistry = new ArrayList<AudioTrack>();
    }    
    
    /**
     * Adds a track to the AudioRegistry
     */
    public void addTrack(AudioTrack track)
    {
        audioRegistry.add(track);
    }
    
    /**
     * 
     */
    public ArrayList<AudioTrack> getAudioList()
    {
        return audioRegistry;
    }
    
    /**
     * 
     */
    public String getAllTracksAsString()
    {
        String audioTrackList="";
        for(AudioTrack track : audioRegistry)
        {            
             audioTrackList += track.getTrackTitle() + "/n";
         }
        return audioTrackList;
    }      
    
}
