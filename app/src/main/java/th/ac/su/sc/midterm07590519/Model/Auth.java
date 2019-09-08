package th.ac.su.sc.midterm07590519.Model;

public class Auth {

    private static final String EMAIL = "aaa";
    private static final String PASSWORD = "111";



    private String mEmail;
    private String mPassword;

    public Auth(String email, String password) {
        this.mEmail = email;
        this.mPassword = password;

    /*
    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String email) {
        this.mEmail = email;
    }

    public String getmPassword() {
        return mPassword;
    }

    public void setmPassword(String mPassword) {
        this.mPassword = mPassword;
    } */

    }
    public boolean check(){
        if (mEmail.equals(EMAIL) && mPassword.equals(PASSWORD)) {
            return true;
        } else {
            return false;
        }

    }
}