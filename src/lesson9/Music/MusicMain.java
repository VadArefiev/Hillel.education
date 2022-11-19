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

        RockMusic rockMusic = new RockMusic();
        rockMusic.name = "DDT";
        PopMusic popMusic = new PopMusic();
        popMusic.name = "Ivanushki";
        ClassicMusic classicMusic = new ClassicMusic();
        classicMusic.name = "Mozart";

        MusicSound[] groups = {rockMusic,popMusic,classicMusic};

        for (MusicSound group : groups) {
            group.playMusic();
        }
    }
}

