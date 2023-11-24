package file;

import models.Albuml;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileAlbuml {
    public static void writerFileAlbum(String path, List<Albuml> albumls) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "id,name\n";
        for (Albuml a : albumls) {
            str += a.getId() + "," + a.getName() + "\n";
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<Albuml> readFileAlbum(String path) throws IOException {
        List<Albuml> albumlList = new ArrayList<>();
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String content = bufferedReader.readLine();
        while ((content = bufferedReader.readLine()) != null) {
            String[] value = content.split(",");
            int id = Integer.parseInt(value[0]);
            String name = value[1];
            albumlList.add(new Albuml(name,id));
        }
        fileReader.close();
        bufferedReader.close();
        return albumlList;
    }
}
