package a23.climoilou.mono2.formatifs.formatif2b;

import a23.climoilou.mono2.formatifs.artistesSupplementaires.Acrobate;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("a23.climoilou.mono2.formatifs")  //on scan le parent des 2 dossiers
//ou on indique chaque dossier précisément:
@ComponentScan(basePackages = {"a23.climoilou.mono2.formatifs.formatif2b", "a23.climoilou.mono2.formatifs.artistesSupplementaires"})

public class ApplicationSpring {

    public static void main(String[] args) {
        //SpringApplication.run(ApplicationSpring.class, args); sans JavaFx
        Application.launch(ApplicationFX.class);
    }

    @Bean(name = "acrobate")
    Acrobate fabriqueAcrobate() {
        return new Acrobate();
    }

}
