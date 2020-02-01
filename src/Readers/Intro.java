package Readers;

public class Intro {
    private String email;
    private String name ;
    private String add;
    private int age;
    public Intro(){

    }
    public Intro(String email, String name, String add, int age) {
        this.email = email;
        this.name = name;
        this.add = add;
        this.age = age;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() + "Intro{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", age=" + age +
                '}';
    }
}
