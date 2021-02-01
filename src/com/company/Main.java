package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File mf = new File("temp");
        mf.mkdir();
        System.out.println("mf Папка? "+mf.isDirectory());

        File mf2 = new File("a1.txt");
        mf2.createNewFile();
        System.out.println("mf2 Это файл? "+mf.isDirectory());

        System.out.println("mf2 существует? "+mf.exists());

        //создание записи
        FileWriter fw = new FileWriter(mf2);
        fw.write("Строка 1\n");
        fw.write("Строка 2\n");
        fw.write("Строка 3\n");
        fw.write("Строка 4\n");

        //запись
        fw.flush();
        //fw.close();

        //чтение
        FileReader fr = new FileReader(mf2);
        char[] ch = new char[255];
        fr.read(ch);
        System.out.println(ch);

        System.out.println("------2-способ-----");

        //запись
        BufferedWriter bf=new BufferedWriter(fw);
        bf.write("Строка 5");
        bf.newLine();
        bf.flush();
        bf.close();

        //чтение
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()){
            System.out.println(br.readLine());
        }

    }
}
