package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {

    private String mSquadName;
    private String mCause;
    private Integer mMaxNumber;
    private int id;
    private int numberOfHeroes;
    private static List<Squad> instances = new ArrayList<>();
    private List<Hero> heroList;

    public Squad(String squadName, String cause, Integer maxNumber) {
        this.mSquadName = squadName;
        this.mCause = cause;
        this.mMaxNumber = maxNumber;
        instances.add(this);
        this.id = instances.size();
        this.heroList = new ArrayList<Hero>();
    }

    public int getId() {
        return id;
    }

    public int getNumberOfHeroes() {
        return numberOfHeroes;
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

    public void  addHeroToSquad(Hero newHero) {
        heroList.add(newHero);
        this.numberOfHeroes = heroList.size();
    }


    public List<Hero> getHeroList() {
        return heroList;
    }

    public static Squad findSquad(int id) {
        return instances.get(id - 1);
    }

    public static void clearAllPosts() {
    instances.clear();
    }
}
