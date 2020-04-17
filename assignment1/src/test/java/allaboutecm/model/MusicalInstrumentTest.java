package allaboutecm.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MusicalInstrumentTest {
    private MusicalInstrument musicalInstrument;


    @BeforeEach
    public void setUp() {
        musicalInstrument = new MusicalInstrument("Mozart");
    }

    @Test
    @DisplayName("MusicalInstrument name cannot be null")
    public void musicalInstrumentNameCannotBeNull() {
        assertThrows(NullPointerException.class, () -> musicalInstrument.setName(null));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "    \t"})
    @DisplayName("MusicalInstrument name cannot be empty or blank")
    public void albumNameCannotBeEmptyOrBlank(String arg) {
        assertThrows(IllegalArgumentException.class, () -> musicalInstrument.setName(arg));
    }
    @DisplayName("should return name using getName")
    @Test
    public void shouldReturnName(){
        String Name = "Mozart";
        musicalInstrument.setName(Name);
        assertEquals(Name,musicalInstrument.getName());
    }

    @Test
    public void sameNameMeansSameMusicalInstrument() {
        MusicalInstrument musicalInstrument1= new MusicalInstrument("Mozart");

        assertEquals(musicalInstrument, musicalInstrument1);
    }
}