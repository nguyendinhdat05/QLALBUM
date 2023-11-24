package models;

import file.FileSong;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Albuml {
    private String name ;
    private int id;
    private List<Song> song;


    public Albuml(String name, int id) {
        this.name = name;
        this.id = id;
        this.song = new ArrayList<>();
    }

    public List<Song> getSong() {
        return song;
    }

    public void setSong(List<Song> song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "Albuml{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", song=" + song +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
