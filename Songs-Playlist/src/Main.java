
public class Main {
    public static void main(String[] args) {
        Playlist p1 = new Playlist();
        p1.addSong("Shape of you" , "Ed sheeran");
        p1.addSong("alone" , "alan walker");
        p1.addSong("Rockstar" , "Post malone");
        p1.addSong("Bad guy" , "Billie Eilish");

        System.out.println("Play Next : ");
        p1.playNext();
        System.out.println("Play Next : ");
        p1.playNext();
        System.out.println("Play Previous : ");
        p1.playPrevious();
        p1.displayForwardBackward();
        p1.addSong("Senorita" , "Shawn Mendis");
        p1.removeSong("alone");
        p1.displayForwardBackward();

    }
}