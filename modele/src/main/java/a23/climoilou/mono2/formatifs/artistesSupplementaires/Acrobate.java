package a23.climoilou.mono2.formatifs.artistesSupplementaires;


import a23.climoilou.mono2.formatifs.formatif2b.ArtisteI;

import java.time.LocalDateTime;

public class Acrobate implements ArtisteI {
    @Override
    public String performe(LocalDateTime time) {
        return "Je fais des pirouettes sur la trampoline à" + time.toString();
    }
}
