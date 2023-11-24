package services;

import file.FileSong;
import models.Albuml;
import models.Song;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManagerSong {
    List<Song> songs = new ArrayList<>();

    public ManagerSong() throws IOException {
        songs = FileSong.readFileSong("song.csv");
    }

    public void addSong(Song song){
        songs.add(song);
    }
    public void showAll1(){
        for (int i = 0; i < this.songs.size(); i++) {
            System.out.println(songs.get(i));
        }
    }
    public void deleteSong(String name) {
        int index = -1;
        for (int i = 0; i < this.songs.size(); i++) {
            if (this.songs.get(i).getNameSong().equals(name)){
                index=i;
            }
        }
        this.songs.remove(index);
    }
    public void editNameSong(String name,Song song){
        int index = -1;
        for (int i = 0; i < songs.size(); i++) {
            if(this.songs.get(i).getNameSong().equals(name)){
                index = i;
            }
        }
        this.songs.set(index,song);
    }

    // hàm tìm albuml của mình
    public void findNameSong(String name){
        int index = -1;
        for (int i = 0; i < songs.size(); i++) {
            if(this.songs.get(i).getNameSong().equals(name)){
                index = i;
            }
        }
        System.out.println(this.songs.get(index));
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

}
