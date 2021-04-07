package com.example.animations;

public class MemberModel {
    private String name;
    private int age;
    private String bloodGroup;

    public MemberModel(String name, int age, String bloodGroup) {
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public MemberModel() {
        this.name = "";
        this.age = 0;
        this.bloodGroup = "";
    }

    @Override
    public String toString() {
        return "MemberModel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }
}
