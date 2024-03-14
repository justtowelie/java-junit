import pojo.LoginPojo;
import utils.PasswordValidator;

import java.util.ArrayList;

public class Login
{

    private LoginPojo loginPojo;
    public ArrayList<String> usernames = new ArrayList<>();

    public PasswordValidator passwordValidator = new PasswordValidator();

    public boolean createLogin(String username, String password)
    {
        if (usernames.contains(username)) {
            System.out.println("Username already exists");
            return false;
        } else if(!isPasswordValid(password)) {
            return false;
        } else {
            loginPojo = new LoginPojo(username, password);
            usernames.add(username);
            System.out.println("User created");
            return true;
        }
    }


    private boolean isPasswordValid(String password) {
        boolean hasUpperCase = false;
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (passwordValidator.containsSpecialCharacter(String.valueOf(ch))) {
                hasSpecialCharacter = true;
            }
        }

        if (!hasUpperCase || !hasSpecialCharacter) {
            System.out.println("Password does not contain a capital letter and/or a special character");
            return false;
        }

        return true;
    }


}
