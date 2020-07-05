package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {

    private String mSquadName;
    private String mCause;
    private Integer mMaxNumber;
    private int mId;
    private static List<Squad> instances = new ArrayList<>();
    private static List<Hero> heroList;

    public Squad(String squadName, String cause, Integer maxNumber) {
        this.mSquadName = squadName;
        this.mCause = cause;
        this.mMaxNumber = maxNumber;
        instances.add(this);
        this.mId = instances.size();
        heroList = new ArrayList<Hero>();
        getHeroList();
    }

    public int getId() {
        return mId;
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
    }


    public static Squad findSquad(int id) {
        return instances.get(id - 1);
    }

    public List<Hero> getHeroList() {
        return heroList;
    }
    public static Integer numberOfHeroes() {
       return  heroList.size();
    }

    public static void clearAllPosts() {
    instances.clear();
    }
}
