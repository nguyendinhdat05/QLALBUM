package controller;

import file.FileAlbuml;
import file.FileSong;
import models.Albuml;
import models.Song;
import services.ManagerAlbuml;
import services.ManagerSong;

import java.io.IOException;
import java.util.Scanner;

public class MenuSong {
    ManagerAlbuml managerAlbuml = new ManagerAlbuml();
    ManagerSong managerSong = new ManagerSong();
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    int choice ;

    public MenuSong() throws IOException {
    }

    public void showMenuSong() throws IOException {
        do {
            System.out.println("-----Menu-----" +
                    "\n 0.thoat" +
                    "\n 1.xem danh sách bài hát" +
                    "\n 2.thêm mới bài hát" +
                    "\n 3.xóa bài hát" +
                    "\n 4.tim kiem bài hát theo tên" +
                    "\n 5.sửa bài hát ");
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    managerSong.showAll1();
                    break;
                case 2:
                    System.out.println("nhập tên của album muốn thêm bài hát");
                    String nameAlbum = inputString.nextLine();
                    System.out.println("nhập id của bài hát mới");
                    int id = inputInt.nextInt();
                    System.out.println("nhập tên bài hát mới");
                    String nameSong = inputString.nextLine();
                    System.out.println("nhập tên tác giả cho bài hát");
                    String nameSinger = inputString.nextLine();
                    Song song = new Song(id, nameSong, nameSinger);
                    managerSong.addSong(song);
//managerAlbuml.addSongToAlbum("nameAlbum", song);
                    FileSong.writerFileSong("song.csv", managerSong.getSongs());
                    break;
                case 3:

                    System.out.println("nhập tên bài hát muốn xóa");
                    String name = inputString.nextLine();
                    managerSong.deleteSong(name);
                    FileSong.writerFileSong("song.csv", managerSong.getSongs());
                    break;
                case 4:
                    System.out.println("nhập tên bài hát muốn tìm");
                    String music = inputString.nextLine();
                    managerSong.findNameSong(music);
                    break;
                case 5:
                    System.out.println("nhập tên bài hát bạn muốn sửa");
                    String name1 = inputString.nextLine();
                    System.out.println("sửa tên id");
                    int idSong = inputInt.nextInt();
                    System.out.println("sửa tên bài hát");
                    String nameSong1 = inputString.nextLine();
                    System.out.println("sửa tên tác giả");
                    String nameSinger1 = inputString.nextLine();
                    Song song1 = new Song(idSong, nameSong1, nameSinger1);
                    managerSong.editNameSong(name1, song1);
                    FileSong.writerFileSong("song.csv", managerSong.getSongs());
                    break;
            }
        } while (choice != 0);
    }
}
