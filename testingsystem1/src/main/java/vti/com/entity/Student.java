package vti.com.entity;

public class Student {
    private String name;
    private int age;
    private String hometown;
    private Level level;
    private TrainingTime trainingTime;
    private SoTinChi soTinChi;
    private Gender gender;
    public enum Level {
        COLLEGE, UNIVERSITY
    }
    public enum TrainingTime{
        FOUR_YEARS("4 years"), THREE_YEARS ("3 years");

        private final String description;

        TrainingTime(String description)
        {
            this.description = description;
        }

        public String getDescription(){
            return description;
        }
    }
    public enum SoTinChi{
        VALUE1(210),
        VALUE2(150);

        private final int value;

        SoTinChi(int value)
        {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    public Student(String name, int age, Gender gender ,String hometown, Level level, TrainingTime trainingTime, SoTinChi soTinChi) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hometown = hometown;
        this.level = level;
        this.trainingTime = trainingTime;
        this.soTinChi = soTinChi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public TrainingTime getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(TrainingTime trainingTime) {
        this.trainingTime = trainingTime;
    }

    public SoTinChi getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(SoTinChi soTinChi) {
        this.soTinChi = soTinChi;
    }
}
