package controller;

import file.FileAlbuml;
import models.Albuml;
import services.ManagerAlbuml;
import services.ManagerSong;

import java.io.IOException;
import java.util.Scanner;

public class MenuAlbuml {
    ManagerAlbuml managerAlbuml;

    {
        try {
            managerAlbuml = new ManagerAlbuml();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);
    int choice ;


    public void showMenuAlbum() throws IOException {
        do {
            System.out.println(
                    "-----Menu-----" +
                            "\n 0.thoat" +
                            "\n 1.xem danh sach albuml" +
                            "\n 2.thêm albuml mới" +
                            "\n 3.xóa albuml" +
                            "\n 4.tim kiem albuml theo tên" +
                            "\n 5.sửa albuml "+
                            "\n 6.truy cập vào album"
            );
            choice = inputInt.nextInt();
            switch (choice) {
                case 1:
                    managerAlbuml.showAll();
                    break;
                case 2:
                    System.out.println("thêm tên albuml");
                    String name = inputString.nextLine();
                    System.out.println("thêm id của albuml");
                    int id = inputInt.nextInt();
                    Albuml albuml = new Albuml(name,id);
                    managerAlbuml.addAlbuml(albuml);
                    FileAlbuml.writerFileAlbum("album.csv",managerAlbuml.getAlbums());
                    break;
                case 3:
                    System.out.println("nhập tên album muốn xóa");
                    String name1 = inputString.nextLine();
                    managerAlbuml.deleteAlbuml(name1);
                    FileAlbuml.writerFileAlbum("album.csv",managerAlbuml.getAlbums());
                    break;
                case 4:
                    System.out.println("nhập tên album của bạn");
                    String name2 = inputString.nextLine();
                    managerAlbuml.findNameAlbuml(name2);
                    break;
                case 5:
                    System.out.println("nhập tên album bạn muốn sửa");
                    String newA = inputString.nextLine();
                    System.out.println("sửa tên album");
                    String nameAlbum = inputString.nextLine();
                    System.out.println("sửa tên id");
                    int idAlbum = inputInt.nextInt();
                    Albuml newAlbum = new Albuml(nameAlbum,idAlbum);
                    managerAlbuml.editNameAlbuml(newA,newAlbum);
                    FileAlbuml.writerFileAlbum("album.csv",managerAlbuml.getAlbums());
                    break;
//                case 6:
//                    System.out.println("nhập album muốn truy cập");
//                    String name3 = inputString.nextLine();



            }

        } while (choice != 0);
    }


}
