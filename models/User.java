package models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String passWord;
    private List<Albuml> albumls;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        this.albumls = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<Albuml> getAlbumls() {
        return albumls;
    }

    public void setAlbumls(List<Albuml> albumls) {
        this.albumls = albumls;
    }
}
