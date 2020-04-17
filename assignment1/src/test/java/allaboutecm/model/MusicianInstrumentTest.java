package allaboutecm.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MusicianInstrumentTest {
    private MusicianInstrument musicianInstrument;
    private Musician musician;
    private MusicalInstrument musicalInstrument;
    @BeforeEach
    public void setUp() {
        Musician a = new Musician("Musician");
        MusicalInstrument b = new MusicalInstrument("Piano");


        musicianInstrument = new MusicianInstrument(a,b);

    }
    @Test
    @DisplayName("should create musicianInstrument successfully")
    public void shouldConstructMusicianInstrument(){
        Musician a1 = new Musician("Musician");
        MusicalInstrument b1 = new MusicalInstrument("Piano");


        MusicianInstrument c1= new MusicianInstrument(a1,b1);
        assertNotNull(c1);
    }

    @Test
    @DisplayName("Musical Instrument cannot be null")
    public void MusicalInstrumentCannotBeNull() {
        assertThrows(NullPointerException.class, () -> musicianInstrument.setMusicalInstrument(null));
    }

    @DisplayName("should return MusicalInstrument using getMusicalInstrument")
    @Test
    public void shouldReturnMusicalInstrument(){
        MusicalInstrument b = new MusicalInstrument("Piano");
        musicianInstrument.setMusicalInstrument(b);
        assertEquals(b,musicianInstrument.getMusicalInstrument());
    }

    @Test
    @DisplayName("Musician cannot be null")
    public void MusicianCannotBeNull() {
        assertThrows(NullPointerException.class, () -> musicianInstrument.setMusician(null));
    }

    @DisplayName("should return MusicalInstrument using getMusicalInstrument")
    @Test
    public void shouldReturnMusician(){
        Musician a = new Musician("Mozart");
        musicianInstrument.setMusician(a);
        assertEquals(a,musicianInstrument.getMusician());
    }

    @Test
    @DisplayName("Same Name Means Same MusicianInstrument")
    public void sameNameMeansSameMusicalInstrument() {
        Musician c = new Musician("Musician");
        MusicalInstrument d = new MusicalInstrument("Piano");
        MusicianInstrument musicianInstrument1 = new MusicianInstrument(c,d);

        assertEquals(musicianInstrument, musicianInstrument1);
    }


}

