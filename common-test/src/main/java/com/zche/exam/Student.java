package com.zche.exam;

import java.util.Objects;

public class Student {
    //姓名
    private String name;
    //年龄
    private int age;
    //班级
    private String cls;
    //爱好
    private String hobby;
    //会学习
    private boolean isStudy;

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

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public boolean isStudy() {
        return isStudy;
    }

    public void setStudy(boolean study) {
        isStudy = study;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                isStudy == student.isStudy &&
                Objects.equals(name, student.name) &&
                Objects.equals(cls, student.cls) &&
                Objects.equals(hobby, student.hobby);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, cls, hobby, isStudy);
    }
}
