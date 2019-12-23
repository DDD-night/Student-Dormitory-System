package javabean;

public class user {
    private String number;
    private String name;
    private String home;
    private String email;
    private String password;
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getHome() {
        return home;
    }

    public String getNumber() {
        return number;
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

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
