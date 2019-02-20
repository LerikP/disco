import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * Class for some Util functions
 */
class Utils {
    private static ThreadLocalRandom random = ThreadLocalRandom.current();

    /**
     * Used to get random song
     * @return random enum variable from Song
     */
    static Song getRandomSong() {
        Song[] songs = Song.values();
        return songs[random.nextInt(songs.length)];
    }

    /**
     * Used to get random number of songs using {@link #getRandomSong} in range [1, 3]
     * @return list of random Songs
     */
    static List<Song> getRandomSongs() {
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < random.nextInt(3) + 1; i++) {
            songs.add(getRandomSong());
        }
        return songs;
    }

    /**
     * Used to represent list of Songs as String
     * @param songs list of Songs
     * @return String representation of songs list with " and " divider
     */
    static String getDancesString(List<Song> songs) {
        return songs.stream().map(Song::getSongName).collect(Collectors.joining(" and "));
    }

    /**
     * Used to report preferences of all people in the bar
     * @param people List of Persons
     */
    static void peopleReport(List<Person> people) {
        System.out.println("People in the bar:");
        people.forEach(Person::reportDance);
        System.out.println();
    }
}
