package ExerciceB;

import java.util.ArrayList;
import java.util.HashMap;


public class CdTheque {
    private ArrayList<CdAudio> listeCDs;

    private HashMap<Long,CdAudio> indexsIsbn;
    private HashMap<String,CdAudio> indexsArtist;
    private HashMap<String,CdAudio> indexsStyle;
    private HashMap<String,CdAudio> indexsTitle;

    public CdTheque() {
        this.listeCDs = new ArrayList<CdAudio>();
        this.indexsIsbn = new HashMap<Long,CdAudio>();
        this.indexsArtist = new HashMap<String,CdAudio>();
        this.indexsTitle = new HashMap<String,CdAudio>();
        this.indexsStyle = new HashMap<String,CdAudio>();

    }

    public boolean addCd(CdAudio cd) {

        if(this.indexsIsbn.containsKey(cd.getIsbn()) // si detecte id
                || (this.indexsArtist.containsKey(cd.getArtist()) && this.indexsTitle.containsKey(cd.getTitle())) // si detecte dans Artist-title
        || (this.indexsStyle.containsKey(cd.getStyle()) && this.indexsTitle.containsKey(cd.getTitle())) ) // si detecte Style-title
        {
            return false;
        } else{

            if(this.listeCDs.add(cd)) {
                indexsIsbn.put(cd.getIsbn(),cd);
                indexsArtist.put(cd.getArtist(),cd);
                indexsStyle.put(cd.getStyle(),cd);
                return true;
            } else {
                return false;
            }
        }

    }
    public boolean addCd(CdAudio cd,int position) {
        if(position < 0 || position > this.listeCDs.size()-1) return false;

        if(this.indexsIsbn.containsKey(cd.getIsbn()) // si detecte id
                || (this.indexsArtist.containsKey(cd.getArtist()) && this.indexsTitle.containsKey(cd.getTitle())) // si detecte dans Artist-title
                || (this.indexsStyle.containsKey(cd.getStyle()) && this.indexsTitle.containsKey(cd.getTitle())) ) // si detecte Style-title
        {
            return false;
        } else{
            listeCDs.add(position,cd);
            indexsIsbn.put(cd.getIsbn(),cd);
            indexsArtist.put(cd.getArtist(),cd);
            indexsStyle.put(cd.getStyle(),cd);
            return true;
        }

    }

    public boolean removeCd(CdAudio cd) {

        if( this.indexsIsbn.containsKey(cd.getIsbn()) // si detecte id
                && this.indexsArtist.containsKey(cd.getArtist()) // si detecte dans Artist
                && this.indexsStyle.containsKey(cd.getStyle()) // si detecte Style
                && this.indexsTitle.containsKey(cd.getTitle())) // si detecte Style
        {
            if(this.listeCDs.remove(cd)) { // si ça a bien supprimer
                indexsIsbn.remove(cd.getIsbn());
                indexsArtist.put(cd.getArtist(), cd);
                indexsStyle.put(cd.getStyle(), cd);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public boolean removeCd(Long isbn) {
            if(indexsIsbn.containsKey(isbn)) {
                if(listeCDs.remove(indexsIsbn.get(isbn))){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
    }
    @Override
    public String toString() {
        return "CdTheque{" +
                "listeCDs=" + listeCDs +
                '}';
    }
}
