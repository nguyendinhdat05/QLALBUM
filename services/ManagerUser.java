package services;

import controller.MenuAlbuml;
import controller.MenuSong;
import models.Albuml;
import models.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerUser {
    List<User> userList = new ArrayList<>();

    public ManagerUser() {
    }

    public void addAcount(User user) {
        userList.add(user);
    }

    public void checkAcount(String name, String pass) throws IOException {
        boolean check = false;
        for (int i = 0; i < this.userList.size(); i++) {
            if (userList.get(i).getUserName().equals(name) && userList.get(i).getPassWord().equals(pass)) {
                System.out.println("bạn đã đăng nhập thành công");
                int choice = -1;
                Scanner scanner = new Scanner(System.in);
                while (choice != 0) {
                    System.out.println(
                             "1.Quản lý Album\n"+
                             "2.Quản lý Song" );


                    choice = scanner.nextInt();

                    if (choice == 1) {
                        MenuAlbuml menuAlbuml = new MenuAlbuml();
                        menuAlbuml.showMenuAlbum();
                    }
                    if (choice == 2) {
                        MenuSong menuSong = new MenuSong();
                        menuSong.showMenuSong();
                    }
                }
                check = true;
                break;
            }
             if (!check) {
                System.out.println("Tài khoản của bạn chưa tồn tại, vui lòng đăng ký.");
             }
        }

    }
}
