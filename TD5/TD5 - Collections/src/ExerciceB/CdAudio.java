package ExerciceB;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "{" +
                "isbn=" + isbn +
                ", artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", style='" + style + '\'' +
                ", nbTracks=" + nbTracks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CdAudio)) return false;
        CdAudio cdAudio = (CdAudio) o;
        return isbn == cdAudio.isbn &&
                Objects.equals(artist, cdAudio.artist) &&
                Objects.equals(title, cdAudio.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, artist, title);
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
