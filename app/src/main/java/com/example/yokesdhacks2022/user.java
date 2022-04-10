package com.example.yokesdhacks2022;

import android.app.Activity;
import android.util.Pair;

import java.util.ArrayList;

public class user {
    private String password;
    private String username;
    private ArrayList<String> goal;
    private String activity_level;
    private String sex;
    private int age;
    private Pair<Integer, Integer> height;
    private int weight;
    private int weight_goal;

    public user(String username, String password) {
        this.password = password;
        this.username = username;
    }

    public ArrayList<String> getGoal() {
        return goal;
    }

    public void setGoal(ArrayList<String> goal) {
        this.goal = goal;
    }

    public String getActivity_level() {
        return activity_level;
    }

    public void setActivity_level(String activity_level) {
        this.activity_level = activity_level;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
       this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pair<Integer, Integer> getHeight() {
        return height;
    }

    public void setHeight(Pair<Integer, Integer> height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight_goal() {
        return weight_goal;
    }

    public void setWeight_goal(int weight_goal) {
        this.weight_goal = weight_goal;
    }
}
