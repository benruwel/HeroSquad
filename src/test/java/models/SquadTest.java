package models;

import org.junit.After;
import org.junit.Test;

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
}