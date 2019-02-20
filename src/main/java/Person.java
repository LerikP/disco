import java.util.List;

/**
 * Class for storing a person in the club
 */
class Person {
    private final String name;
    private final String gender;
    private final List<Song> song;

    private Person(String name, String gender, List<Song> song) {
        this.name = name;
        this.gender = gender;
        this.song = song;
    }

    /**
     * Prints person's status
     * @param song current playing song
     */
    void reportStatus(Song song) {
        System.out.println(this.name + " (" + gender + ") is currently " + getStatus(song));
    }

    /**
     * Calculates if person is dancing or drinking
     * @param song current playing song
     * @return "Dancing" if person likes the song
     *         "Drinking" if person doesn't like the song
     */
    private String getStatus(Song song) {
        return this.song.stream().anyMatch(song::equals) ? "Dancing" : "Drinking";
    }

    /**
     * Prints person's preferences
     */
    void reportDance() {
        System.out.println(this.name + " (" + gender + ") likes " + Utils.getDancesString(song));
    }

    static Builder builder() {
        return new Builder();
    }

    /**
     * Generic Person builder
     */
    static class Builder {
        private String name;
        private String gender;
        private List<Song> songs;

        private Builder() {}

        Builder withName(String name) {
            this.name = name;
            return this;
        }

        Builder withGender(String gender) {
            this.gender = gender;
            return this;
        }

        Builder withDance(List<Song> song) {
            this.songs = song;
            return this;
        }

        Person build() {
            return new Person(name, gender, songs);
        }
    }
}
