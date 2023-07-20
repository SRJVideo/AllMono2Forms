package a23.climoilou.mono2.formatifs.formatif2b;

import a23.climoilou.mono2.formatifs.formatif2b.controleurFX.SpringFXControleur;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxControllerAndView;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class ApplicationFX extends Application {

    private ConfigurableApplicationContext context;//on a besoin de connaitre le contexte spring pour pouvoir le fermer

    @Override
    public void init() {
        String[] args = getParameters().getRaw().toArray(new String[0]);//les paramètres reçus dans le main.

        // Création explicite du contexte de l'application
        this.context = new SpringApplicationBuilder().sources(ApplicationSpring.class).run(args);
    }

    @Override
    public void stop() {
        // Destruction explicite du contexte
        this.context.close();

        // Fermeture de JavaFX
        Platform.exit();
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("JavaFX initialisé");

        FxWeaver fxWeaver = context.getBean(FxWeaver.class);

        FxControllerAndView<SpringFXControleur, AnchorPane> controllerAndView = fxWeaver.load(SpringFXControleur.class);
        Parent root = controllerAndView.getView().get();

        SpringFXControleur springFXControleur = controllerAndView.getController();
        springFXControleur.setMessage("PrimaryStage");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    // Pas de main dans cette classe, l'application va être lancée à partir de Application Spring !
}
