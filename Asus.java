class Asus1{ 
    public String Engine = "Intel";
    public String Layar = "14 inch";
    public String Camera = "720p HD Camera" ;
    public String Batre = "3 Cell, 50 WHr";
    public String RAM = "8 GB";
    public String Grafis = "Intel HD Grafik";
    public String Storage = "SSD 512 GB";
    public String OS = "Windows 10 Home";
    
    public String Engine(){
        return this.Layar;
    }

    public String Layar(){
        return this.Layar;
    }
    
    public String Kamera(){
        return this.Camera;
    }

    public String Baterai(){
        return this.Batre;
    }
    
    public String RAM(){
        return this.RAM;
    }
    
    public String Memori(){
        return this.Storage;
    }

    public String Grafik(){
        return this.Grafis;
    }

    public String OS(){
        return this.OS;
    }
}

class ZenBook extends Asus{ 
    public String Type_Series = "Asus Zenbook 13 UX325EA";

    public void Processor(){
        System.out.println("Processor : Intel i7 1165G7");
    }

    public void Uk(){
        System.out.println("Ukuran Layar : 13.3 inch");
    }
    public void Grph(){
        System.out.println("Grafik : Intel Iris Xe Graphics");
    }

    public String Program(String x){
        return x;
    }
}


class VivoBook extends Asus{ 
    public String Type_Series = "Asus VivoBook A416";

    public void Processor(){
        System.out.println("Processor : Intel i5 1135G7");
    }

    public void Uk(){
        System.out.println("Ukuran Layar : 14 inch");
    }
    public void Grph(){
        System.out.println("Grafik : NVIDIA GeForce MX330");
    }

    public String Program(String x){
        return x;
    }
}

public class Asus {
    public static void main(String[] args) {
        //inisialisasi object
        Asus1 p = new Asus1();//init object
        System.out.println("Class Asus - main class"); 
        String Engine = p.Engine();
        System.out.println("Processor :"+p.Engine);
        String Layar = p.Layar();
        System.out.println("Layar:"+p.Layar);
        String Kamera = p.Kamera();
        System.out.println("Kamera:"+Kamera);
        String Baterai = p.Baterai();        
        System.out.println("Batre :"+Baterai);
        String RAM = p.RAM();        
        System.out.println("RAM :"+RAM);
        String Memori = p.Memori();        
        System.out.println("Storage :"+Memori);
        String Grafik = p.Grafik();        
        System.out.println("Graphics Card :"+Grafik);
        String OS = p.OS();        
        System.out.println("Operating System :"+OS);

        System.out.println("=====================================");
        System.out.println("Class Asus ZenBook - Subclass");
        ZenBook a = new ZenBook();
        a.Processor();
        a.Uk();
        a.Grph();
        Kamera = p.Kamera();
        System.out.println("Kamera :"+Kamera);
        Baterai = p.Baterai();        
        System.out.println("Baterai :"+Baterai);
        RAM = p.RAM();        
        System.out.println("RAM :"+RAM);
        Memori = p.Memori();        
        System.out.println("Memori :"+Memori);
        OS = p.OS();        
        System.out.println("Operating System :"+OS);
        String Program = a.Program("Mendukung");
        System.out.println("Mendukung Program Berat ? "+Program);
        System.out.println("Tipe Series Asus ZenBook :"+a.Type_Series);
        
        VivoBook b = new VivoBook();
        System.out.println("=====================================");
        System.out.println("Class Asus VivoBook - Subclass");
        b.Processor();
        b.Uk();
        b.Grph();
        Kamera = p.Kamera();
        System.out.println("Kamera :"+Kamera);
        Baterai = p.Baterai();        
        System.out.println("Tipe memory_type:"+Baterai);
        RAM = p.RAM();        
        System.out.println("RAM :"+RAM);
        Memori = p.Memori();        
        System.out.println("Memori :"+Memori);
        OS = p.OS();        
        System.out.println("Operating System :"+p.OS);
        Program = b.Program("Tidak Mendukung");
        System.out.println("Mendukung Program Berat ? "+Program);
        System.out.println("Tipe Series Asus VivoBook :"+a.Type_Series);

        System.out.println("=====================================");
        System.out.println("Class Encapsulation_Asus ROG");
        Encapsulation_AsusROG c = new Encapsulation_AsusROG();
        c.setEngine("Processor : Intel i9 101005F");
        c.setLayar("Ukuran Layar : 22 Inch");
        c.setCamera("Kamera : 720p HD Camera");
        c.setBatre("Baterai : 4 Cell, 60 WHr");
        c.setRAM("RAM : 16 GB");
        c.setGrafis("Grafik : Intel i9 10100F");
        c.setStorage("Memori : SSD 512 GB");
        c.setOS("Operating System : Windows 10 Home");

        System.out.println(c.getEngine());
        System.out.println(c.getLayar());
        System.out.println(c.getCamera());
        System.out.println(c.getBatre());
        System.out.println(c.getRAM());
        System.out.println(c.getGrafis());
        System.out.println(c.getStorage());
        System.out.println(c.getOS()); 
    }
}
