package Seminar6;

import java.util.Objects;

public class CatsAdvanced {
    private String nickname;
    private String color;
    private int age;
    private final gender;

    public CatsAdvanced(String nickname, String color, int age, gender) {

        this.nickname = nickname;
        this.color = color;
        setAge(age);
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <=40) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Некорректный возраст");
        }
    }

    public gender getGender() {
        return gender;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatsAdvanced that = (CatsAdvanced) o;
        return age == that.age && Objects.equals(nickname, that.nickname) && color.equals(that.color) && gender == that.gender;
    }


    public int hashCode() {
        return Objects.hash(nickname, color, age, gender);
    }

    public String toString() {
        return "CatsAdvanced:\n{" +
                "nickname='" + nickname + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}' + "\n";
    }
}
