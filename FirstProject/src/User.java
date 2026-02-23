public class User {
    private int userId;
    private String fullName;
    private String username;
    private String email;
    private String password;
    private double monthlyIncome;

    // constructor membuat objek user
    public User(int userId, String fullName, String username, String email, String password, double monthlyIncome){
        this.userId = userId;
        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.monthlyIncome = monthlyIncome;
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

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    // setters
    public void setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    // string method
    public static void main(String[] args) {
        //object 
        User user1 = new User(1, "Naila zahra", "naila", "naila.zhr@gm.com", "password123", 5000000);

        User user2 = new User(2, "Naila zahra yasmine", "nela", "naila.yasmine@gm.com", "password456", 6000000);
        
        //info user1
        System.out.println("Informasi User 1:");
        System.out.println("Nama: " + user1.getFullName());
        System.out.println("Username: " + user1.getUsername());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("pendapatan: " + user1.getMonthlyIncome());
        System.out.println("\n");
        
        // setter ubah gaji bulanan
        user1.setMonthlyIncome(5500000);
        System.out.println("pendapatan setelah update: " + user1.getMonthlyIncome());

        // info user2
        System.out.println("\nInformasi User 2:");
        System.out.println("Nama: " + user2.getFullName());
        System.out.println("Username: " + user2.getUsername());
        System.out.println("Email: " + user2.getEmail());
        System.out.println("pendapatan: " + user2.getMonthlyIncome());
        System.out.println("\n");
        user2.setMonthlyIncome(6500000);
        System.out.println("pendapatan setelah update: " + user2.getMonthlyIncome());

    }
}