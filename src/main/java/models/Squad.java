package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {

    private String mSquadName;
    private String mCause;
    private Integer mMaxNumber;
    private static List<Squad> instances = new ArrayList<>();
    private List<Hero> heroList = new ArrayList<>();

    public Squad(String squadName, String cause, Integer maxNumber) {
        this.mSquadName = squadName;
        this.mCause = cause;
        this.mMaxNumber = maxNumber;
        instances.add(this);
    }

    public String getSquadName() {
        return mSquadName;
    }

    public String getCause() {
        return mCause;
    }

    public Integer getMaxNumber() {
        return mMaxNumber;
    }

    public static List<Squad> getAll() {
        return instances;
    }

    public List<Hero> getHeroList() {
        return heroList;
    }

    public void  addHeroToSquad(Hero newHero) {
        heroList.add(newHero);
    }

    public static void clearAllPosts() {
    instances.clear();
    }
}
