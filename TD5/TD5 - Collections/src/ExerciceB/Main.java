package ExerciceB;

import com.sun.org.apache.xml.internal.resolver.Catalog;

public class Main {

    public static void main(String[] args) {
        CdTheque Catalogue = new CdTheque();
        CdAudio a = new CdAudio(1,"Mlamali","oui","alt",15);
        CdAudio b = new CdAudio(2,"Bouchra","et oui","rap",20);
        CdAudio c = new CdAudio(3,"test","et nong","rap",24);

        Catalogue.addCd(a);
        Catalogue.addCd(b);
        Catalogue.addCd(c,-1);
        //Long x = 3L;
       // Catalogue.removeCd(x);
        System.out.println(Catalogue);



    }
}
