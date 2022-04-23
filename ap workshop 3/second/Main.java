package second;

import java.util.Scanner;

public class Main {

    private static void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        Favorite favorite = new Favorite();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. add music\n" +
                "2. remove music\n" +
                "3. remove favorite\n" +
                "4. show music\n" +
                "5. show favorite\n" +
                "6. play music\n" +
                "7. search by name\n" +
                "8. search by artist\n" +
                "9. exit");

        int menuChoice = scanner.nextInt();
        System.out.println("choose music category:\n" +
                "1. rock\n" +
                "2. pop\n" +
                "3. jazz\n" +
                "4. country");
        int categoryChoice = scanner.nextInt();

        if (menuChoice == 1) {
            if (categoryChoice == 1) {
                System.out.println("Enter the name of music");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.println("Enter the name of its singer");
                String singer = scanner.next();
                System.out.println("Enter publish year");
                int year = scanner.nextInt();
                Music music = new Music(name, singer, year);

                rock.addFile(music);

                System.out.println("do you want add this song to favorite list ?");
                String favoriteChoice = scanner.next();
                if (favoriteChoice.equals("yes")) {
                    favorite.addFavorite(music);
                }
            } else if (categoryChoice == 2) {
                System.out.println("Enter the name of music");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.println("Enter the name of its singer");
                String singer = scanner.next();
                System.out.println("Enter publish year");
                int year = scanner.nextInt();
                Music music = new Music(name, singer, year);

                pop.addFile(music);

                System.out.println("do you want add this song to favorite list ?");
                String favoriteChoice = scanner.next();
                if (favoriteChoice.equals("yes")) {
                    favorite.addFavorite(music);
                }
            } else if (categoryChoice == 3) {
                System.out.println("Enter the name of music");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.println("Enter the name of its singer");
                String singer = scanner.next();
                System.out.println("Enter publish year");
                int year = scanner.nextInt();
                Music music = new Music(name, singer, year);

                jazz.addFile(music);

                System.out.println("do you want add this song to favorite list ?");
                String favoriteChoice = scanner.next();
                if (favoriteChoice.equals("yes")) {
                    favorite.addFavorite(music);
                }
            } else if (categoryChoice == 4) {
                System.out.println("Enter the name of music");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.println("Enter the name of its singer");
                String singer = scanner.next();
                System.out.println("Enter publish year");
                int year = scanner.nextInt();
                Music music = new Music(name, singer, year);

                country.addFile(music);

                System.out.println("do you want add this song to favorite list ?");
                String favoriteChoice = scanner.next();
                if (favoriteChoice.equals("yes")) {
                    favorite.addFavorite(music);
                }
            }
        } else if (menuChoice == 2) {
            System.out.println("choose a category:\n" +
                    "1.rock\n" +
                    "2.pop\n" +
                    "3.jazz\n" +
                    "4.country");
            int removeChoice = scanner.nextInt();
            if (removeChoice == 1) {
                rock.listAllFiles();
                pressAnyKeyToContinue();
                System.out.println("Enter the number of music");
                int index = scanner.nextInt();
                rock.removeFile(index);
            } else if (removeChoice == 2) {
                pop.listAllFiles();
                pressAnyKeyToContinue();
                System.out.println("Enter the number of music");
                int index = scanner.nextInt();
                pop.removeFile(index);
            } else if (removeChoice == 3) {
                jazz.listAllFiles();
                pressAnyKeyToContinue();
                System.out.println("Enter the number of music");
                int index = scanner.nextInt();
                jazz.removeFile(index);
            } else if (removeChoice == 4) {
                country.listAllFiles();
                pressAnyKeyToContinue();
                System.out.println("Enter the number of music");
                int index = scanner.nextInt();
                country.removeFile(index);
            }
        } else if (menuChoice == 3) {
            favorite.listFavorite();
            pressAnyKeyToContinue();
            System.out.println("Enter the number of music");
            int index = scanner.nextInt();
            rock.removeFile(index - 1);
        } else if (menuChoice == 4) {
            System.out.println("Rock music list:");
            rock.listAllFiles();
            System.out.println("Pop music list:");
            pop.listAllFiles();
            System.out.println("Jazz music list:");
            jazz.listAllFiles();
            System.out.println("Country music list:");
            country.listAllFiles();
            pressAnyKeyToContinue();
        } else if (menuChoice == 5) {
            favorite.listFavorite();
            pressAnyKeyToContinue();
        } else if (menuChoice == 6) {
            System.out.println("choose a category:\n" +
                    "1.rock\n" +
                    "2.pop\n" +
                    "3.jazz\n" +
                    "4.country");
            int playChoice = scanner.nextInt();
            if (playChoice == 1) {
                rock.listAllFiles();
                pressAnyKeyToContinue();
                System.out.println("Enter the number of music");
                int index1 = scanner.nextInt();
                rock.startPlaying(index1 - 1);
                System.out.println("wanna stop?");
                String c1 = scanner.next();
                if (c1.equals("yes")) {
                    rock.stopPlaying();
                    pressAnyKeyToContinue();
                } else if (playChoice == 2) {
                    pop.listAllFiles();
                    pressAnyKeyToContinue();
                    System.out.println("Enter the number of music");
                    int index2 = scanner.nextInt();
                    pop.startPlaying(index2 - 1);
                    System.out.println("wanna stop?");
                    String c2 = scanner.next();
                    if (c2.equals("yes")) {
                        pop.stopPlaying();
                        pressAnyKeyToContinue();
                    }
                } else if (playChoice == 3) {
                    jazz.listAllFiles();
                    pressAnyKeyToContinue();
                    System.out.println("Enter the number of music");
                    int index3 = scanner.nextInt();
                    jazz.startPlaying(index3 - 1);
                    System.out.println("wanna stop?");
                    String c3 = scanner.next();
                    if (c3.equals("yes")) {
                        jazz.stopPlaying();
                        pressAnyKeyToContinue();
                    }
                } else if (playChoice == 4) {
                    country.listAllFiles();
                    pressAnyKeyToContinue();
                    System.out.println("Enter the number of music");
                    int index4 = scanner.nextInt();
                    country.startPlaying(index4 - 1);
                    System.out.println("wanna stop?");
                    String c4 = scanner.next();
                    if (c4.equals("yes")) {
                        country.stopPlaying();
                        pressAnyKeyToContinue();
                    }
                }
            }
        } else if (menuChoice == 7) {
            System.out.println("Enter music name");
            String search = scanner.next();
            System.out.println("rock search result:");
            rock.searchMusicByName(search);
            System.out.println("pop search result:");
            pop.searchMusicByName(search);
            System.out.println("jazz search result:");
            jazz.searchMusicByName(search);
            System.out.println("country search result:");
            country.searchMusicByName(search);
            pressAnyKeyToContinue();
        } else if (menuChoice == 8) {
            System.out.println("Enter music artist");
            String search = scanner.next();
            System.out.println("rock search result:");
            rock.searchMusicBySinger(search);
            System.out.println("pop search result:");
            pop.searchMusicBySinger(search);
            System.out.println("jazz search result:");
            jazz.searchMusicBySinger(search);
            System.out.println("country search result:");
            country.searchMusicBySinger(search);
            pressAnyKeyToContinue();
        } else if (menuChoice == 9) {
            return;
        }
    }
}