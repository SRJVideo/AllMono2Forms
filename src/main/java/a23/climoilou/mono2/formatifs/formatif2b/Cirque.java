package a23.climoilou.mono2.formatifs.formatif2b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Cirque {
    private ArtisteI artiste;

    //@Autowired
    public Cirque(ArtisteI artiste) {
        this.artiste = artiste;
    }

    public void performe() {
        System.out.println("Le cirque est en ville:");
        System.out.println(artiste.performe(LocalDateTime.now()));
    }
}
