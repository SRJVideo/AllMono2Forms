package a23.climoilou.mono2.formatifs.formatif2b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class Cirque {
    private ArtisteI artiste;
    private List<ArtisteI> artistes;

    //@Autowired
    public Cirque(ArtisteI artiste, List<ArtisteI> artistes) {
        this.artiste = artiste;
        this.artistes = artistes;
    }

    public void performe() {
        System.out.println("Le cirque est en ville:");
        System.out.println(artiste.performe(LocalDateTime.now()));
    }

    public String performeAll() {
        String retString = "Le cirque est en ville.\n";
        retString += "Les artistes performent :\n";
        for (ArtisteI artiste : artistes) {
            retString += artiste.performe(LocalDateTime.now()) + "\n";
        }
        return retString;
    }
}
