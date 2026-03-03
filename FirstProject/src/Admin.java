import java.time.LocalDate;

public class Admin extends User {
    private String wilayahTugas;

    public Admin(int userId, String fullName, String username, String email, String password, LocalDate tanggalLahir, String wilayahTugas) {
        super(userId, fullName, username, email, password, tanggalLahir, wilayahTugas);
        this.wilayahTugas = wilayahTugas;
    }
     public String getWilayahTugas() {
        return wilayahTugas;
    }

    // Implementasi spesifik untuk Admin
    @Override
    public void tampilkanProfil() {
        System.out.println("=== PROFIL ADMIN ===");
        System.out.println("Nama: " + getFullName());
        System.out.println("Username: " + getUsername());
        System.out.println("Wilayah Tugas: " + getWilayahTugas());
        System.out.println("Akses: Full Control");
    }
}
