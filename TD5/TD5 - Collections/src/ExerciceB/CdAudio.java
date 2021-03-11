package ExerciceB;

public class CdAudio {
    private long isbn;
    private String artist;
    private String title;
    private String style;
    private int nbTracks;

    public CdAudio(long isbn, String artist, String title, String style, int nbTracks) {
        this.isbn = isbn;
        this.artist = artist;
        this.title = title;
        this.style = style;
        this.nbTracks = nbTracks;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getStyle() {
        return style;
    }

    public int getNbTracks() {
        return nbTracks;
    }
}
