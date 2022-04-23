package second;

public class MainSec {
    public static void main(String[] args){
        MusicCollection pop = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        Favorite favorite = new Favorite();
        Music m1 = new Music("without me", "halsey", 2015);
        Music m2 = new Music("car radio", "top", 2010);
        Music m3 = new Music("sweater weather", "tn", 2018);
        Music m4 = new Music("void", "tn", 2005);
        Music m5 = new Music("dont start now", "dua lipa", 2020);
        Music m6 = new Music("dreamin", "53 t", 2010);

        pop.addFile(m1);
        pop.addFile(m5);
        rock.addFile(m2);
        rock.addFile(m3);
        rock.addFile(m4);
        country.addFile(m6);

        favorite.addFavorite(m1);
        favorite.addFavorite(m3);

        System.out.println("the number of music in rock category : " + rock.getNumberOfFiles());
        System.out.println();
        System.out.println("rock list : ");
        rock.listAllFiles();
        System.out.println();
        System.out.println("favorite list :");
        favorite.listFavorite();
        System.out.println();
        favorite.removeFavorite(3);
        pop.stopPlaying();
        System.out.println();

        rock.searchMusicByName("sweater weather");
        System.out.println();
        country.searchMusicBySinger("53 t");
    }
}
