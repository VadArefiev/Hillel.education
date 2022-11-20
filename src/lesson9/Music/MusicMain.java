package lesson9.Music;

public class MusicMain {
    /**
     * Create a MusicStyles class which will contain the playMusic() method
     * Make it heirs: PopMusic, RockMusic and ClassicMusic.
     * Descendants must implement the playMusic() method in their own way.
     * In the main class, create music bands for each style
     * Use the for each method to call playMusic() on all descendants
     */

    public static void main(String[] args) {

        MusicStyle rockMusic = new RockMusic("DDT");
        MusicStyle popMusic = new PopMusic("Ivanushki");
        MusicStyle classicMusic = new ClassicMusic("Mozart");

        MusicStyle[] groups = {rockMusic,popMusic,classicMusic};

        for (MusicStyle group : groups) {
            group.playMusic();
        }
    }
}

