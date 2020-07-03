package models;

import java.util.ArrayList;

public class Squad {

    private String mSquadName;
    private String mCause;
    private Integer mMaxNumber;
    private static ArrayList<Squad> instances = new ArrayList<>();

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

    public static ArrayList<Squad> getAll() {
        return instances;
    }

    public static void clearAllPosts() {
    instances.clear();
    }
}
