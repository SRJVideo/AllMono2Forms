package a23.climoilou.mono2.formatifs.formatif2b;

import a23.climoilou.mono2.formatifs.artistesSupplementaires.Dresseur;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class BootStrap implements CommandLineRunner {
    private final ApplicationContext context;

    // la classe BootStrap recevra automatiquement le context lors de sa création grace à ce constructeur.
    public BootStrap(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(String... args) throws Exception {
//        Clown clown = (Clown) context.getBean("clown");
//        System.out.println(clown.performe(LocalDateTime.now()));
//
//        Jongleur jongleur = (Jongleur) context.getBean("jongleur");
//        System.out.println(jongleur.performe(LocalDateTime.now()));

//        ArtisteI artiste = context.getBean(ArtisteI.class);
//        System.out.println(artiste.performe(LocalDateTime.now()));


//        Cirque cirque = context.getBean("cirque", Cirque.class);
//        System.out.println(cirque.performeAll());

//        ClownPerturbateur clownPerturbateur = context.getBean("clownPerturbateur", ClownPerturbateur.class);
//        System.out.println(clownPerturbateur.performe(LocalDateTime.now()));
//
//        JongleurConcentre jongleurConcentre = context.getBean("jongleurConcentre", JongleurConcentre.class);
//        System.out.println(jongleurConcentre.performe(LocalDateTime.now()));

        Dresseur dresseur = context.getBean(Dresseur.class);
        System.out.println(dresseur.performe(LocalDateTime.now()));
    }
}
