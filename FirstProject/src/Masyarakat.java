import java.time.LocalDate;
public class Masyarakat extends User {
    private String statusKemiskinan; 
    private String NIK; 
    private double monthlyIncome;
    private String fileSKTM;
    private String fileKtp;

    public Masyarakat(int userId, String fullName, String username, String email, String password, LocalDate tanggalLahir, String alamat, double monthlyIncome, String statusKemiskinan, String NIK) {
        // Memanggil constructor parent
        super(userId, fullName, username, email, password, tanggalLahir, alamat);
        this.statusKemiskinan = statusKemiskinan;
        this.NIK = NIK;
        this.monthlyIncome = monthlyIncome;
        this.fileSKTM = "file_sktm_" + userId + ".pdf"; 
        this.fileKtp = "file_ktp_" + userId + ".pdf";
    }
    // getters
    public String getStatusKemiskinan() {
        return statusKemiskinan;
    }
      public double getMonthlyIncome() {
        return monthlyIncome;
    }
    public String getNIK() {
        return NIK;
    }
    public String getFileSKTM() {
        return fileSKTM;
    }
    public String getFileKtp() {
        return fileKtp;
    }


    // setters
    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    // @Override untuk Polymorphism
    @Override
    public void tampilkanProfil() {
        System.out.println("=== PROFIL MASYARAKAT ===");
        System.out.println("Nama: " + getFullName());
        System.out.println("Status: " + statusKemiskinan);
        System.out.println("NIK: " + NIK);
        System.out.println("Pendapatan: Rp " + getMonthlyIncome());
        System.out.println("File SKTM: " + fileSKTM);
        System.out.println("File KTP: " + fileKtp);
        System.out.println();
    }
}