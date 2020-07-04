package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void newHeroObjectInstantiates_true() {
        Hero testHero = new Hero("Joker", 23, "laughter", "laughter", 100);
        String expectedName = "Joker";
        Integer expectedAge = 23;
        String expectedStrength = "laughter";
        String expectedWeakness = "laughter";
        Integer expectedOverall = 100;
        assertEquals(expectedName, testHero.getName());
        assertEquals(expectedAge, testHero.getAge());
        assertEquals(expectedStrength, testHero.getStrength());
        assertEquals(expectedWeakness, testHero.getWeakness());
        assertEquals(expectedOverall, testHero.getOverall());
    }

}