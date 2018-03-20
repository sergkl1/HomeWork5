package task1;

/**
 * Created by sergey.kliepikov on 3/20/18.
 */
public class FSRunner {

    public static void main(String[] args) {
        NamedFSItem file1 = new File("Song.mp3", 3000);
        NamedFSItem file2 = new File("Text.doc", 150);
        NamedFSItem file3 = new File("Presentation.pdf", 1000);

        Directory dir1 = new Directory("MyDir_1")
                .addFluent(file1)
                .addFluent(new File("Zip.zip", 300));

        Directory dir2 = new Directory("MyDir_2");

        FSItem symLink1 = new Symlink("symLink_file1", file1);


        dir1.add(file1);
        dir1.add(file2);
        dir1.add(file3);

        System.out.println("MyDir_1 size: " + dir1.getSize());


        System.out.println("Symlink's name: " + symLink1.getName());

        dir1.add(dir2); //exception thrown
    }
}
