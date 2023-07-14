package a23.climoilou.mono2.formatifs.formatif2b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
public class JongleurConcentre extends Jongleur {

    private ClownPerturbateur clown;

    @Autowired
    public JongleurConcentre(ClownPerturbateur clown) {
        this.clown = clown;
    }

//    @Autowired
//    public void setClown(ClownPerturbateur clown) {
//        this.clown = clown;
//    }

    @Override
    public String performe(LocalDateTime time) {
        return " Je ne m'occupe pas de " + clown.toString() + " et " + super.performe(time);
    }

}
