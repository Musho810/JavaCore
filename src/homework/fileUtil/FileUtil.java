package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);
    private static String path;
    private static String fileName;
    private static boolean result = false;

    public static void main(String[] args) throws IOException {

//        fileSearch();
//        contentSearch();
//        findLines();
//        printSizeOfPackage();
//        createFileWithContent();
        fileSearchWithRecursion();
    }

    static void fileSearch() {
        System.out.println("PLease input Directory path");
        String path = scanner.nextLine();
        System.out.println("Please input File Name");
        String fileName = scanner.nextLine();
        boolean result = false;
        File file = new File(path);
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String file1 : list) {
                if (fileName.equals(file1)) {
                    result = true;
                }
            }
        }
        System.out.println(result);
    }

    static void contentSearch() throws IOException {
        System.out.println("PLease input Directory path");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        File file = new File(path);
        File[] myFiles = file.listFiles();
        for (File myFile : myFiles) {
            if (myFile.getName().endsWith(".txt")) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile.getAbsolutePath()))) {

                    String symbol = "";
                    while ((symbol = bufferedReader.readLine()) != null) {
                        if (symbol.contains(keyword)) {
                            System.out.println(myFile.getName());
                        }
                    }
                }
            }
        }
    }

    static void findLines() throws IOException {
        System.out.println("PLease input File path");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        File file = new File(path);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String symbol = "";
            while ((symbol = bufferedReader.readLine()) != null) {
                if (symbol.contains(keyword)) {
                    System.out.println(symbol);
                }

            }
        }
    }

    static void printSizeOfPackage() {
        System.out.println("PLease input Directory path");
        String path = scanner.nextLine();
        File file = new File(path);
        File[] myFiles = file.listFiles();
        long size = 0;
        for (File myFile : myFiles) {
            size = size + myFile.length();
        }
        System.out.println(size);
    }


    static void createFileWithContent() throws IOException {
        System.out.println("PLease input Directory path");
        String path = scanner.nextLine();
        System.out.println("Please input File Name");
        String fileName = scanner.nextLine();
        System.out.println("Please input content file");
        String contentFile = scanner.nextLine();
        File file = new File(path, fileName);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsolutePath()))) {
            bufferedWriter.write(contentFile);
        }

    }

    static void fileSearchWithRecursion() {
        System.out.println("PLease input Directory path");
        path = scanner.nextLine();
        System.out.println("Please input File Name");
        fileName = scanner.nextLine();

        File myfile = new File(path);
        if (myfile.isDirectory()) {
            File[] files = myfile.listFiles();
            for (File file : files) {
                recursionsearch(file);
            }
        }
        if (myfile.getName().equals(fileName)) {
            result = true;
        }
        System.out.println(result);
    }

    private static void recursionsearch(File file) {
        if (file.isDirectory()) {
            File file1 = new File(file.getPath());
            File[] files = file1.listFiles();
            if (files != null) {
                for (File file2 : files) {
                    recursionsearch(file2);
                }
            }
        } else {
           if(file.getName().equals(fileName)) {
               result = true;
           }

        }

    }

}



