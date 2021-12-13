package pj.cv10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class ToolFile {


    //ukol 7
    public ArrayList<String> listDirectories(String path) throws IOException {
        String[] names;

        ArrayList<String> files = new ArrayList();
        ArrayList<String> directories = new ArrayList();

        File f = new File(path);
        names = f.list();
        for (int i = 0; i < names.length; i++) {
            String newname;
//            System.out.println(names[i]);

            Path file = Path.of(names[i]);
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            if (attr.isDirectory()) {
                newname = names[i];
                directories.add(newname);
            } else {
                newname = names[i] + " (File)";
                files.add(newname);
            }


        }
        for (String name:
                directories) {
            System.out.println(name);
        }
        for (String name:
                files) {
            System.out.println(name);
        }
        return directories;
    }

    public ArrayList<String> listFiles(String path) throws IOException {
        String[] names;

        ArrayList<String> files = new ArrayList();
        ArrayList<String> directories = new ArrayList();

        File f = new File(path);
        names = f.list();
        for (int i = 0; i < names.length; i++) {
            String newname;
//            System.out.println(names[i]);

            Path file = Path.of(names[i]);
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            if (attr.isDirectory()) {
                newname = names[i];
                directories.add(newname);
            } else {
                newname = names[i];
                files.add(newname);
            }


        }
        for (String name:
                directories) {
            System.out.println(name);
        }
        for (String name:
                files) {
            System.out.println(name);
        }
        return files;
    }

    //Ukoly 5,6
    public void ls(String path) throws IOException {
        String[] names;

        ArrayList<String> files = new ArrayList();
        ArrayList<String> directories = new ArrayList();

        File f = new File(path);
        names = f.list();
        for (int i = 0; i < names.length; i++) {
            String newname;
//            System.out.println(names[i]);

            Path file = Path.of(names[i]);
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            if (attr.isDirectory()) {
                newname = names[i] + " (Directory)";
                directories.add(newname);
            } else {
                newname = names[i] + " (File)";
                files.add(newname);
            }


        }
        for (String name:
             directories) {
            System.out.println(name);
        }
        for (String name:
            files) {
            System.out.println(name);
        }
    }

    public void getInfo(Path object) throws IOException {
        BasicFileAttributes attr = Files.readAttributes(object, BasicFileAttributes.class);

        System.out.println("Creation Time: " + attr.creationTime());
        System.out.println("Last Accessed: " + attr.lastAccessTime());
        System.out.println("Last Modified: " + attr.lastModifiedTime());

        System.out.println("Directory:     " + attr.isDirectory());
        System.out.println("Other:         " + attr.isOther());
        System.out.println("Regular File:  " + attr.isRegularFile());
        System.out.println("Symbolic Link: " + attr.isSymbolicLink());
        System.out.println("Size:          " + attr.size());
    }

}
