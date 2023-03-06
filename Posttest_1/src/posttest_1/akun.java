package posttest_1;

public class akun{
    private String Username;
    private String Password;

    akun(String user, String pass){
        this.Username = user;
        this.Password = pass;
    }

    public String getusername(){
        return Username;
    }

    public String getPass(){
        return Password;
    }
}

