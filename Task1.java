package by.oksana.lesson9;

//Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке

import java.io.*;
import java.util.ArrayList;

public class Task1 {
    public static void main (String[] args) {
        String line;
        ArrayList aList = new ArrayList();

        File file = new File("Variables.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(fileReader);
        try {
            reader.ready();
            while ((line = reader.readLine()) != null) {
                aList.add(line);
                }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <aList.size(); i++) {
            System.out.println(aList.get(i).toString());
        }

        FileWriter fileWriter = null;
        try {
            fileWriter= new FileWriter("Variables.txt", true);
            fileWriter.write("\nобратный порядок\n");
            for (int i=aList.size()-1; i >= 0; i--) {
                fileWriter.write(aList.get(i).toString()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
