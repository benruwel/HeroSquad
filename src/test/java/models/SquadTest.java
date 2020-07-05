package models;

import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SquadTest {

    @After
    public void removeData() {
        Squad.clearAllPosts();
    }

    @Test
    public void allSquadsAreReturned_true() {
        Squad testSquad = new Squad("Suicide Squad", "dress to kill", 8);
        Squad otherTestSquad = new Squad("JackAssets", "rid all stupidity", 5);
        assertEquals(2, Squad.getAll().size());
    }

    @Test
    public void newSquadObjectInstantiates_true() {
        Squad testSquad = new Squad("Suicide Squad", "dress to kill", 8);
        String expectedName = "Suicide Squad";
        Integer expectedNumber = 8;
        String expectedCause = "dress to kill";
        assertEquals(expectedName, testSquad.getSquadName());
        assertEquals(expectedNumber, testSquad.getMaxNumber());
        assertEquals(expectedCause, testSquad.getCause());
    }
    @Test
    public void addHeroToSquad_addingArrayOfHeroes_ArrayList() {
        Squad testSquad = new Squad("Suicide Squad", "dress to kill", 8);
        Hero testHero = new Hero("Joker", 23, "laughter", "laughter", 100);
        List<Hero> testHeroList = new ArrayList<>();
        testHeroList.add(testHero);
        testSquad.addHeroToSquad(testHero);
        assertEquals(testHeroList, testSquad.getHeroList());
    }

}