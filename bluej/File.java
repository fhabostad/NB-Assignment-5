
/**
 * Write a description of class HDfile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class File extends Media
{
    private String nameOfHd;//Name of HD (ex “Radio Music Archive”, “Radio Jingle Archive” etc)
    private String fileName;//File name (like “Uptown Funk.mp3”)
    private String filePath;//Path to file (like “d:\\Music\”)
    private int fileSize;//Filesize (in kB) 

    /**
     * Constructor for objects of class HDfile
     */
    public File()
    {
        makeFile(nameOfHd, fileName, filePath, fileSize);
    }
    
    /**
     * 
     */
    public void makeFile(String nameOfHd, String fileName, String filePath, int fileSize)
    {
        //make a file
        this.nameOfHd = nameOfHd;
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileSize = fileSize;
    }

}
