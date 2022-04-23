package second;

/**
 * The type Music.
 */
public class Music {
    private String musicSinger;
    private int musicYear;
    private String musicName;

    /**
     * Instantiates a new Music.
     *
     * @param musicName   the music name
     * @param musicSinger the music singer
     * @param musicYear   the music year
     */
    public Music(String musicName, String musicSinger, int musicYear) {
        this.musicSinger = musicSinger;
        this.musicYear = musicYear;
        this.musicName = musicName;
    }

    /**
     * Gets music singer.
     *
     * @return the music singer
     */
    public String getMusicSinger() {
        return musicSinger;
    }

    /**
     * Gets music year.
     *
     * @return the music year
     */
    public int getMusicYear() {
        return musicYear;
    }

    /**
     * Gets music name.
     *
     * @return the music name
     */
    public String getMusicName() {
        return musicName;
    }
}
