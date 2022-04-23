package second;

import java.util.ArrayList;

/**
 * The type Favorite.
 */
public class Favorite {
    private ArrayList<Music> favorite;

    /**
     * Instantiates a new Favorite.
     */
    public Favorite() {
        favorite = new ArrayList<Music>();
    }

    /**
     * Valid index boolean.
     *
     * @param index the index
     * @return the boolean
     */
    public boolean validIndex(int index) {
        boolean validNum;

        if (index > favorite.size()) {
            validNum = false;
        }
        return true;
    }

    /**
     * Add favorite.
     *
     * @param music the music
     */
    public void addFavorite(Music music) {
        favorite.add(music);
    }

    /**
     * Remove favorite.
     *
     * @param index the index
     */
    public void removeFavorite(int index) {
        if (validIndex(index)) {
            System.out.println("this music is not valid");
        } else {
            favorite.remove(index);
        }
    }

    /**
     * List favorite.
     */
    public void listFavorite() {
        int count = 0;
        if (favorite.size() == 0) {
            System.out.println("your list is empty");
        } else {
            for (int i = 0; i < favorite.size(); i++) {
                count++;
                System.out.println(count + ". ");
                listFiles(i);
            }
        }
    }

    /**
     * List files.
     *
     * @param index the index
     */
    public void listFiles(int index){
        System.out.println(
                "music name :" + favorite.get(index).getMusicName() +
                " / Artist :" + favorite.get(index).getMusicSinger() +
                " / year :" + favorite.get(index).getMusicYear());
    }
}
