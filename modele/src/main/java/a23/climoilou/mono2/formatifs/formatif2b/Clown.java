package a23.climoilou.mono2.formatifs.formatif2b;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Profile("amuseur")
@Component
public class Clown implements ArtisteI {

    public String performe(LocalDateTime time) {
        return "je fais le clown à " + time.toString();
    }

    @Override
    public String toString() {
        return "Clown";
    }
}
