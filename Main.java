public class Main {
    public static void main(String[] args) {
        String path = "D:/music/bolero/longme.mp3";

        // Lấy longme.mp3
        String fileName = path.substring(path.lastIndexOf("/") + 1);
        System.out.println("Ten file: " + fileName);

        // Lấy longme
        String nameWithoutExt = fileName.substring(0, fileName.lastIndexOf("."));
        System.out.println("Ten khong duoi: " + nameWithoutExt);
    }
}