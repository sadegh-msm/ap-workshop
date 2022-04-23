package second;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * The type Music collection.
 */
public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    private ArrayList<Music> favorite;
    // A player for the music files.
    private final MusicPlayer player;


    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        player = new MusicPlayer();
        files = new ArrayList<Music>();
        favorite = new ArrayList<Music>();
    }

    /**
     * Add a file to the collection.
     *
     * @param music The file to be added.
     */
    public void addFile(Music music) {
        files.add(music);
    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();
    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        int count = 0;
        if (files.size() == 0) {
            System.out.println("your list is empty");
        } else {
            System.out.println(
                        "music name :" + files.get(index).getMusicName() +
                        " / Artist :" + files.get(index).getMusicSinger() +
                        " / year :" + files.get(index).getMusicYear());
            }
        }


    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        if (files.size() == 0) {
            System.out.println("your list is empty");
        } else {
            for (int i = 0; i < files.size(); i++) {
                System.out.println("music name :" + files.get(i).getMusicName() +
                        " / Artist :" + files.get(i).getMusicSinger() +
                        " / year :" + files.get(i).getMusicYear());
            }
        }
    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if (validIndex(index)) {
            System.out.println("this music is not valid");
        } else {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if (validIndex(index)) {
            System.out.println("this music is not valid");
        } else {
            player.startPlaying(files.get(index).getMusicName());
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        boolean validNum;

        if (index > files.size()) {
            validNum = false;
        }
        return true;
    }

    /**
     * Search music by name.
     *
     * @param name the name
     */
    public void searchMusicByName(String name){
        int count = 0;
        Music music = null;
        Iterator<Music> it = files.iterator();
        while (it.hasNext()){
            music = it.next();
            if (music.getMusicName().contains(name)){
                count ++;
                System.out.println(count + ". ");
                Music temp = music;
                listFile(files.indexOf(temp));
                break;
            }
        }
    }

    /**
     * Search music by singer.
     *
     * @param name the name
     */
    public void searchMusicBySinger(String name){
        int count = 0;
        Music music = null;
        Iterator<Music> it = files.iterator();
        while (it.hasNext()){
            music = it.next();
            if (music.getMusicSinger().contains(name)){
                count ++;
                System.out.println(count + ". ");
                Music temp = music;
                listFile(files.indexOf(temp));
                break;
            }
        }
    }
}