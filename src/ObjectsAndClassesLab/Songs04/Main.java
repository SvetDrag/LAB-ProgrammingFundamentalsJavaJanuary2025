package ObjectsAndClassesLab.Songs04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int num = Integer.parseInt(scanner.nextLine());

        List<Song> songCollection = new ArrayList<>();

        for (int i = 1; i <= num; i++) {

            String input = scanner.nextLine(); //typeList, name, time

            String typeList = input.split("_")[0];
            String name = input.split("_")[1];
            String time = input.split("_")[2];

            Song song = new Song(typeList, name, time);
            songCollection.add(song);

        }

        String command = scanner.nextLine();

        if (command.equals("all")){
            for (Song song : songCollection){
                System.out.println(song.getName());
            }
        }
        else {
            for (Song song : songCollection){
                if (song.getTypeList().equals(command)){
                    System.out.println(song.getName());
                }
            }
        }

    }
}
