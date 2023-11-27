import controller.MenuAlbuml;
import controller.MenuSong;
import controller.MenuUser;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        MenuUser menuUser = new MenuUser();
        menuUser.showMenuUser();
    }
//    public static void main(String[] args)  {
//        int choice =-1;
//        Scanner scanner = new Scanner(System.in);
//        while (choice!=0) {
//            System.out.println(
//                    "1. Quản lý Album\n" +
//                    "2. Quản lý song\n");
//            choice = scanner.nextInt();
//
//            if(choice == 1){
//                MenuAlbuml menuAlbuml = new MenuAlbuml();
//                menuAlbuml.showMenuAlbum();
//            }
//            if(choice == 2){
//                MenuSong menuSong = new MenuSong();
//                menuSong.showMenuSong();
//            }
//        }
//    }
}