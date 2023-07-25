package Seminar6;

public class Cats {
    private String nickname;
    private String color;
    private int age;
    private final gender;

    public Cats(String nickname, String color, int age, gender) {
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


    public String toString() {
        return "Cats{" +
                "nickname='" + nickname + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}' + "\n";
    }
}
