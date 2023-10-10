package vti.com.entity;

public enum Gender {
    MALE("NAM"),
    FEMALE("NỮ");

    private final String description;

    Gender(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
}
