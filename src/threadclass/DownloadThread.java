package threadclass;

class DownloadThread extends Thread {
    private String fileName;
    
    public DownloadThread(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void run() {
        System.out.println("Starting download: " + fileName);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Downloading " + fileName + ": " + (i * 10) + "% complete");
            try {
                Thread.sleep(300); // Simulate time taken for downloading
            } catch (InterruptedException e) {
                System.out.println("Download interrupted: " + fileName);
            }
        }
        System.out.println("Download complete: " + fileName);
    }
}



