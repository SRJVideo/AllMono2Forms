package a23.climoilou.mono2.formatifs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Primary
@Component
public class ClownPerturbateur extends Clown {
    private JongleurConcentre jongleur;


    @Autowired
    public ClownPerturbateur(@Lazy JongleurConcentre jongleur) {
        this.jongleur = jongleur;
    }

//    @Autowired
//    public void setJongleur(JongleurConcentre jongleur) {
//        this.jongleur = jongleur;
//    }


    public String performe(LocalDateTime time) {
        return "Je dérange " + jongleur.toString() + " parce que " + super.performe(time);
    }
}
