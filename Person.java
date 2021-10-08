public class Person {
    public String Name;
    public String Birthdate;
    public String Department;
    public String Major;
    public String Age;
    public String Height;
    public String Weight;
    public double Distance;
    public double Time;
    
    public static void main(String[] args) {
        int Speed = 80;
        Person person_obj = new Person();
        person_obj.setInformation("Name: Nicholas Fico", "\nBirthdate: 26 January 2000", "\nDepartment: Informasi dan Pariwisata", "\nMajor: Teknologi Informasi", "\nAge: 21", "\nHeight: 169 cm", "\nWeight: 90 kg");
        System.out.println(person_obj.getInformation());
        System.out.println("Speed: " + Speed + " km/minute");
        person_obj.Distance = 0.8;
        person_obj.Time = person_obj.Distance / Speed;
        person_obj.setDistanceTime(person_obj.Distance, person_obj.Time);
        System.out.println(person_obj.getDistanceTime());
    }

    public void setInformation(String a, String b, String c, String d, String x, String y, String z) {
        this.Name = a;
        this.Birthdate = b;
        this.Department = c;
        this.Major = d;
        this.Age = x;
        this.Height = y;
        this.Weight = z;
    }

    public String getInformation() {
        return this.Name + this.Birthdate + this.Department + this.Major + this.Age + this.Height + this.Weight;
    }

    public void setDistanceTime(double n, double m) {
        this.Distance = n;
        this.Time = m;
    }

    public String getDistanceTime() {
        return "Distance: " + String.valueOf(this.Distance) +"\nTime: " + String.valueOf(this.Time);
    }
}