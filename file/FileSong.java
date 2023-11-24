package file;

import models.Song;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileSong {
    public static void writerFileSong(String path, List<Song> songs) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "id,nameSong,nameSinger\n";
        for (Song a : songs) {
            str += a.getId() + "," + a.getNameSong() +","+ a.getNameSinger()+"\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<Song> readFileSong(String path) throws IOException {
        List<Song> songList = new ArrayList<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content = bufferedReader.readLine();
        while ((content = bufferedReader.readLine()) != null) {
            String[] value = content.split(",");
            int id = Integer.parseInt(value[0]);
            String nameSong = value[1];
            String nameSinger = value[2];
            songList.add(new Song(id,nameSong,nameSinger));

        }
        fileReader.close();
        bufferedReader.close();
        return songList;
    }
}
