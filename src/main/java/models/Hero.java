package models;

public class Hero {

    private String mName;
    private Integer mAge;
    private String mStrength;
    private String mWeakness;
    private Integer mOverall;

    public Hero(String name, Integer age, String strength, String weakness, Integer overall) {
        this.mName = name;
        this.mAge = age;
        this.mStrength = strength;
        this.mWeakness= weakness;
        this.mOverall = overall;
    }

    public String getName() {
        return mName;
    }

    public Integer getAge() {
        return mAge;
    }


    public String getStrength() {
        return mStrength;
    }

    public String getWeakness() {
        return mWeakness;
    }


    public Integer getOverall() {
        return mOverall;
    }

}
