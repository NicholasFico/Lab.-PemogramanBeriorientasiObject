import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private String[] MenuList = {"Menginput Product","Melihat Product"};
    private String[] MyProduct = {"VivoBook","ZenBook"};
    private List<VivoBook> listVivoBook  = new ArrayList<VivoBook>();
    private List<ZenBook> listZenBook  = new ArrayList<ZenBook>();

    public static void main (String[] args) {
        Main m = new Main();
        m.InputMenu();        
    }


    public void InputMenu() {
        Scanner myObj = new Scanner(System.in);
        int menu;

        System.out.println("\n\n--PROGRAM PENJUALAN TOKO ASUS. Sukses Cell--");
        System.out.println("Pilih menu:\n");
        int i=1;
        for (String mu : this.MenuList) {
            System.out.println(i+". "+mu);
            i++;
        }
        System.out.print("Masukan Pilihan menu:");
        String inputMenu = myObj.nextLine();
        menu = Integer.parseInt(inputMenu);

        switch (menu) {
            case 1:
                this.InputMenuProduct();
                break;
            case 2:
                this.ShowMenuProduct();
                break;
        
            default:
            System.out.println("Pilihan Tidak Terdaftar");
                break;
        }
    }

    public void InputMenuProduct(){
        System.out.println("\n-------------------");
        System.out.println("Input Produk");
        System.out.println("-------------------\n");
        System.out.println("Pilih Produk:");
        int i=1;
        for (String p : MyProduct) {
            System.out.println(i+". "+p);
            i++;
        }
        System.out.print("Masukan Pilihan:");
        Scanner myObj = new Scanner(System.in);
        String inputProduct = myObj.nextLine();
        int product = Integer.parseInt(inputProduct);
        switch (product) {
            case 1:                
                try {
                    listVivoBook = this.InputVivoBook();       
                    this.InputMenu();               
                } catch (Exception e) {
                    System.out.println("Failed error input produk VivoBook");
                    System.out.println("Error: "+e.getMessage());
                }    
            
                break;
            case 2:
                try {
                    listZenBook = this.InputZenBook();       
                    this.InputMenu();               
                } catch (Exception e) {
                    System.out.println("Failed error input produk ZenBook");
                    System.out.println("Error: "+e.getMessage());
                }    
            
                break;

            default:
                break;
        }
    }


    public List InputVivoBook() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n===Input VivoBook===");
        System.out.print("Masukan jumlah data yang dimasukan :");
        int jmlData=5;
        for (int i = 0; i < jmlData; i++) {
            VivoBook v = new VivoBook();
            System.out.println("#data ke-"+(i+1)+":");

            System.out.print("Processor = ");
            String processor = myObj.nextLine();            
            v.setProcessor(processor);

            System.out.print("Layar = ");
            String layar = myObj.nextLine();            
            v.setLayar(layar);

            System.out.print("Kamera = ");
            String camera = myObj.nextLine();            
            v.setCamera(camera);

            System.out.print("Baterai = ");
            String batre = myObj.nextLine();     
            v.setBatre(batre);
            
            System.out.print("RAM = ");
            int Ram = Integer.parseInt(myObj.nextLine());            
            v.setRAM(Ram);

            System.out.print("Grafis = ");
            String grafis = myObj.nextLine();            
            v.setGrafis(grafis);

            System.out.print("Penyimpanan = ");
            String storage = myObj.nextLine();            
            v.setStorage(storage);

            System.out.print("OS = ");
            String os = myObj.nextLine();            
            v.setOS(os);
            
            System.out.print("Merek = ");
            String merek = myObj.nextLine();            
            v.setMerek(merek);

            System.out.print("Harga = ");
            Double harga = Double.parseDouble(myObj.nextLine());            
            v.setHarga(harga);

            System.out.println("---------------------------");
            this.listVivoBook.add(v);
        }
        System.out.println("\n");
        return this.listVivoBook;
        
    }

    public List InputZenBook() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("\n===Input ZenBook===");
        System.out.print("Masukan jumlah data yang dimasukan :");
        int jmlData=5;
        for (int i = 0; i < jmlData; i++) {
            ZenBook z = new ZenBook();
            System.out.println("#data ke-"+(i+1)+":");

            System.out.print("Processor = ");
            String processor = myObj.nextLine();            
            z.setProcessor(processor);

            System.out.print("Layar = ");
            String layar = myObj.nextLine();            
            z.setLayar(layar);

            System.out.print("Kamera = ");
            String camera = myObj.nextLine();            
            z.setCamera(camera);

            System.out.print("Baterai = ");
            String batre = myObj.nextLine();     
            z.setBatre(batre);
            
            System.out.print("RAM = ");
            int Ram = Integer.parseInt(myObj.nextLine());            
            z.setRAM(Ram);

            System.out.print("Grafis = ");
            String grafis = myObj.nextLine();            
            z.setGrafis(grafis);

            System.out.print("Penyimpanan = ");
            String storage = myObj.nextLine();            
            z.setStorage(storage);

            System.out.print("OS = ");
            String os = myObj.nextLine();            
            z.setOS(os);
            
            System.out.print("Merek = ");
            String merek = myObj.nextLine();            
            z.setMerek(merek);

            System.out.print("Harga = ");
            Double harga = Double.parseDouble(myObj.nextLine());            
            z.setHarga(harga);

            System.out.println("---------------------------");
            this.listZenBook.add(z);
        }
        System.out.println("\n");
        return this.listZenBook;
        
    }


    public void ShowMenuProduct(){
        for (VivoBook v : listVivoBook) {
            System.out.println("Processor = "+ v.getProcessor() );
            System.out.println("Layar = "+ v.getLayar() );
            System.out.println("Kamera = "+ v.getCamera() );
            System.out.println("Baterai = "+ v.getBatre() );
            System.out.println("RAM = "+ v.getRAM() );
            System.out.println("Grafis = "+ v.getGrafis() );
            System.out.println("Penyimpanan = "+ v.getStorage() );
            System.out.println("OS = "+ v.getOS() );
            System.out.println("Merek = "+ v.getMerek() );
            System.out.println("Harga = "+ v.getHarga() );
            System.out.println("========================");
        }

        for (ZenBook z : listZenBook) {
            System.out.println("Processor = "+ z.getProcessor() );
            System.out.println("Layar = "+ z.getLayar() );
            System.out.println("Kamera = "+ z.getCamera() );
            System.out.println("Baterai = "+ z.getBatre() );
            System.out.println("RAM = "+ z.getRAM() );
            System.out.println("Grafis = "+ z.getGrafis() );
            System.out.println("Penyimpanan = "+ z.getStorage() );
            System.out.println("OS = "+ z.getOS() );
            System.out.println("Merek = "+ z.getMerek() );
            System.out.println("Harga = "+ z.getHarga() );
            System.out.println("========================");
        }
    }  
    
}