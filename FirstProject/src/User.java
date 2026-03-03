import java.time.LocalDate;
public class User {
    private int userId;
    private String fullName;
    private String username;
    private String email;
    private String password;
    private LocalDate tanggalLahir;
    

    // constructor membuat objek user
    public User(int userId, String fullName, String username, String email, String password, LocalDate tanggalLahir, String alamat) {
        this.userId = userId;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.tanggalLahir = tanggalLahir;
      
    }
    // getters
    public int getUserId() {
        return userId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

  
    public void tampilkanProfil() {
        System.out.println("Informasi User Umum:");
        System.out.println("Nama: " + fullName);
        System.out.println("Username: " + username);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Email: " + email);
    }
}