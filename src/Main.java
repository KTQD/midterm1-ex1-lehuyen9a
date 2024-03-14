public class Main {
    public static void main(String[] args) {

        MP3 mp3 = new MP3("MP3", "bai hat", "MP01", 495, 120);
        Book book = new Book("sach toan", "toan 12", "01", 125, "ngoc", 400, "baitap");  
        mp3.showInfo();
        book.showInfo();
    }
}
