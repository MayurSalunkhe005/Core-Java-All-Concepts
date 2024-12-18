package threadclass;

public class Main1 {
    public static void main(String[] args) {
        DownloadThread file1 = new DownloadThread("File1.mp4");
        //DownloadThread file2 = new DownloadThread("File2.mp4");
        
        file1.start(); // Start downloading File1
       // file2.start(); // Start downloading File2
    }
}
