enum Song {
    POP("Pop music"),
    RNB("R'n'b music"),
    ELECTRO("Electronic music"),
    HOUSE("House music"),
    DISCO("Disco music"),
    ROCK("Rock'n'roll music"),
    HIP_HOP("Hip hop music"),
    TRANCE("Trance music");

    private String songName;

    Song(String songName) {
        this.songName = songName;
    }

    String getSongName() {
        return songName;
    }

    /**
     * Prints currently playing song
     */
    void reportStatus() {
        System.out.println("Currently playing: " + this.getSongName());
    }
}
