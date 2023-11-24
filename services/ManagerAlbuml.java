package services;

import file.FileAlbuml;
import file.FileSong;
import models.Albuml;
import models.Song;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ManagerAlbuml {
    List<Albuml> albums;
 //   List<Song> songs =new ArrayList<>();

    public ManagerAlbuml() throws IOException {
        albums = FileAlbuml.readFileAlbum("album.csv");
   }
   //Show song
    // hàm hiện
    public void showAll(){
        for (int i = 0; i < this.albums.size(); i++) {
            System.out.println(albums.get(i));
        }
    }

    // hàm thêm
    public void addAlbuml(Albuml albuml){
        albums.add(albuml);
    }

    // hàm xóa theo id của albuml
    public void deleteAlbuml(String name) {
        int index = -1;
        for (int i = 0; i < albums.size(); i++) {
            if (this.albums.get(i).getName().equals(name)){
                index=i;
            }
        }
        this.albums.remove(index);
    }

    // hàm sửa tên albuml
    public void editNameAlbuml(String name,Albuml albuml){
        int index = -1;
        for (int i = 0; i < albums.size(); i++) {
            if(this.albums.get(i).getName().equals(name)){
                index = i;
            }
        }
        this.albums.set(index,albuml);
    }

    // hàm tìm albuml của mình
    public void findNameAlbuml(String name){
        int index = -1;
        for (int i = 0; i < albums.size(); i++) {
            if(this.albums.get(i).getName().equals(name)){
                index = i;
            }
        }
        System.out.println(this.albums.get(index));
    }
    public List<Albuml> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Albuml> albums) {
        this.albums = albums;
    }
    public void addSongToAlbum(String name, Song song) {
        for (Albuml album: albums) {
            if (album.getName().equals(name)) album.getSong().add(song);
        }
    }

    public static void main(String[] args) throws IOException {
        Song song = new Song(10, "a", "b");
        ManagerAlbuml managerAlbuml = new ManagerAlbuml();
        managerAlbuml.addSongToAlbum("a", song);
        managerAlbuml.showAll();
    }
}
