//import java.io.BufferedInputStream;
//import java.io.BufferedOutputStream;
//import java.io.FileInputStream;
//import java.io.FilterOutputStream;
//
//public class FileCopy {
//    public static void main(String[] args) {
//        String inputfile = "src/Barney.png";
//        String outputFile = "src/Barney_copy.png";
//
//        byte[] buffer = new byte[1024];
//        int bytesRead;
//
//        try
//            (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputfile));
//            BufferedOutputStream bos = new BufferedOutputStream(new FilterOutputStream(outputFile)));{
//
//            bos.wrtie(buffer, 0, bytesRead);
//            System.out.println("Data written to file");
//        }catch
//    }
//}
