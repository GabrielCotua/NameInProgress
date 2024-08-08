import java.util.Random;

public class User {
    int UUID;
    String username;
    String passwd;
    double money;
    Random random = new Random();

    public User() {
        UUID = 0;
        username = "";
        passwd = "";
        money = 0.0;
    }

    public void setUsername(String name){
        this.username = name;
    }

    public void setPasswd(String password){
        this.passwd = password;
    }


    public void setUUID() {
        this.UUID = (int) (Math.random() * 1200 + 0);
    }

    public void addMoney(double amount) {
        this.money += amount;
    }

    public void restMoney(double amount) {
        this.money -= amount;
    }

    public boolean userExist(User user, String UUID) {
        return true;
    }

    public void sendMoney(double amount, User destination, String UUID) {
        this.restMoney(amount);

        if (destination.userExist(destination, UUID)){
            destination.addMoney(amount);
        }

    }




}
