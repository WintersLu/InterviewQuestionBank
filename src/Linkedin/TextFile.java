package Linkedin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TextFile implements Iterable<String> {
    ArrayList<String> lines = new ArrayList<String>();
    public TextFile(String fileName) { // please implement this
            Scanner sc = null;
            try {
                    sc = new Scanner(new File("file.txt"));
            } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            }
            while (sc.hasNext()) {
                    lines.add(sc.nextLine());
            }
    }

    /**
     * Begin reading the file, line by line. The returned Iterator.next() will
     * return a line.
     */
    @Override
    public Iterator<String> iterator() { // please implement this
            return lines.iterator();
    }

    public static void main(String[] args) {
            TextFile text = new TextFile("file.txt");
            Iterator<String> itr = text.iterator();
            while (itr.hasNext()) {
                    System.err.println(itr.next());
            }
            
    }
}