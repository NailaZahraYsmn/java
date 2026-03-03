import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        LocalDate tglLahirNaila = LocalDate.of(2006, 9, 10);
        LocalDate tglLahirBudi =  LocalDate.of(1980, 5, 20);

        // Membuat objek spesifik dari subclass
        Masyarakat user1 = new Masyarakat(1, "Naila Zahra", "naila", "naila@gm.com", "pass123", tglLahirNaila,"Madiun", 1500000, "Rentan Miskin", "320123456789");
        Admin user2 = new Admin(99, "Budi Santoso", "admin_budi", "budi@uhuyy.com", "admin456", tglLahirBudi, "Surabaya");

        // Memanggil method 
        user1.tampilkanProfil();
        System.out.println(); // Spasi
        user2.tampilkanProfil();
    }
}
    