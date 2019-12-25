package javabean;

import java.sql.Date;
import java.sql.Time;
import java.util.Timer;

public class userhome {
    private String number;
    private String adminhome;
    private int thing;
    private String name;
    private String home;
    private String email;
    private String password;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setThing(int thing) {
        this.thing = thing;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setAdminhome(String adminhome) {
        this.adminhome = adminhome;
    }

    public String getNumber() {
        return number;
    }

    public int getThing() {
        return thing;
    }

    public String getAdminhome() {
        return adminhome;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getHome() {
        return home;
    }


    public String getPassword() {
        return password;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHome(String home) {
        this.home = home;
    }


    public void setPassword(String password) {
        this.password = password;
    }

}
