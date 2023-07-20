package a23.climoilou.mono2.formatifs.formatif2b.controleurFX;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@FxmlView("springfx.fxml")
@Component
public class SpringFXControleur {

    private SpringFXControleur2 springFXControleur2;

    @Autowired
    public SpringFXControleur(SpringFXControleur2 springFXControleur2) {
        this.springFXControleur2 = springFXControleur2;
    }

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @FXML
    private TextField messageTextField;

    @FXML
    void afficheMessage(ActionEvent event) {
        messageTextField.setText("allo spring FX !");
        springFXControleur2.setReponse("unanime");
    }

    @FXML
    public void initialize() {
        System.out.println("fxml primary initialize");
    }
}
