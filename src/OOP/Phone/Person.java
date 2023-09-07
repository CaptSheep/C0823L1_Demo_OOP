package OOP.Phone;

import java.util.Date;

public class Person {
    protected    String name; // "Long" -> "C0823L1"
    private   Date birthday;

    // MacOS : command + N
    // Window : Ctrl + N

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }


    public Person() {
    }


    public Person(String name) {
        this.name = name;
    }


    public Person(Date birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    protected boolean isBirthday(){
        return true;
    }


}
