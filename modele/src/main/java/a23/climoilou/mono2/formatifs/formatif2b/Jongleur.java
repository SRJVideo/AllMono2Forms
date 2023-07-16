package a23.climoilou.mono2.formatifs.formatif2b;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Profile("performeur")
@Component
public class Jongleur implements ArtisteI {
    public String performe(LocalDateTime time) {
        return "Je jongle à " + time.toString();
    }

}
