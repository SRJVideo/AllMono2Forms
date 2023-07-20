package a23.climoilou.mono2.formatifs.formatif2b.controleurFX;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

@Component
@FxmlView("springfx2.fxml")
public class SpringFXControleur2 {


    @FXML
    private TextField reponseTextField;

    public void setReponse(String reponse) {
        reponseTextField.setText(reponse);
    }

}
