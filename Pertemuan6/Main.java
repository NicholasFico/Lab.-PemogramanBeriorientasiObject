import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
@Deprecated

public class Main {
   public static void main(String[] args) {
       File file = new File("D:/NF/Semester 3/PemogramanBerorientasiObjek/Pertemuan6/DaftarAsusZenBook.txt");
       FileInputStream fis = null;
       BufferedInputStream bis = null;
       DataInputStream dis = null;
       List<AsusZenBook> ListAsusZenBook = new ArrayList<AsusZenBook>();
            
       try {
           fis = new FileInputStream(file);
           bis = new BufferedInputStream(fis);
           dis = new DataInputStream(bis);
           
           while(dis.available() != 0) {
               String line = dis.readLine();
               String[] data = line.split(",");                           
               
               AsusZenBook i = new AsusZenBook();
               i.setTipeSeries(data[0]);
               i.setLayar(data[1]);
               i.setProcessor(data[2]);
               i.setGrafis(data[3]);
               i.setRAM(data[4]);
               i.setStorage(data[5]);
                
               ListAsusZenBook.add(i);    
            }
       } catch (Exception e) {
           System.out.println("File "+file.getName()+" tidak ditemukan");
           System.out.println("Error "+e.getMessage());
       }
       
       Asus s = new Asus();
           s.setMerek("AsusZenBook");
           System.out.println("       Katalog Asus "+s.getMerek());

       for(AsusZenBook i : ListAsusZenBook) {
           System.out.println("===========================================");
           System.out.println("Tipe Series : "+i.getTipeSeries());
           System.out.println("Layar : "+i.getLayar());
           System.out.println("Processor   : "+i.getProcessor());
           System.out.println("Grafis       : "+i.getGrafis());
           System.out.println("RAM         : "+i.getRAM());
           System.out.println("Storage         : "+i.getStorage());
       }


       File file2 = new File("D:/NF/Semester 3/PemogramanBerorientasiObjek/Pertemuan6/DaftarAsusVivoBook.txt");
       FileInputStream fis2 = null;
       BufferedInputStream bis2 = null;
       DataInputStream dis2 = null;
       List<AsusVivoBook> ListAsusVivoBook = new ArrayList<AsusVivoBook>();
          
       try {
           fis2 = new FileInputStream(file2);
           bis2 = new BufferedInputStream(fis2);
           dis2 = new DataInputStream(bis2);
           
           while(dis2.available() != 0) {
               String line = dis2.readLine();
               String[] data = line.split(",");
               
               AsusVivoBook v = new AsusVivoBook();
               v.setTipeSeries(data[0]);
               v.setLayar(data[1]);
               v.setProcessor(data[2]);
               v.setGrafis(data[3]);
               v.setRAM(data[4]);
               v.setStorage(data[5]);  
                           
               ListAsusVivoBook.add(v);    
             
           }
       } catch (Exception e2) {
           System.out.println("File "+file2.getName()+" tidak ditemukan");
           System.out.println("Error "+e2.getMessage());
       }
       
       System.out.println("\n");
           s.setMerek("AsusVivoBook");
           System.out.println("      Katalog Asus "+s.getMerek());

       for(AsusVivoBook v : ListAsusVivoBook) {
        System.out.println("===========================================");
        System.out.println("Tipe Series : "+v.getTipeSeries());
        System.out.println("Layar : "+v.getLayar());
        System.out.println("Processor   : "+v.getProcessor());
        System.out.println("Grafis       : "+v.getGrafis());
        System.out.println("RAM         : "+v.getRAM());
        System.out.println("Storage         : "+v.getStorage());
       }
   }
  
}