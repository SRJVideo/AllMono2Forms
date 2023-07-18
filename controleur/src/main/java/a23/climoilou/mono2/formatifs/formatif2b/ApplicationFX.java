package a23.climoilou.mono2.formatifs.formatif2b;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class ApplicationFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("JavaFX initialisé");
    }

    // Pas de main dans cette classe, l'application va être lancée à partir de Application Spring !
}
