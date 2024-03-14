package utils;

import java.util.HashSet;
import java.util.Set;

public class PasswordValidator
{
    private Set<Character> passwordValidator = new HashSet<>();

    public PasswordValidator()
    {
        passwordValidator.add('!');
        passwordValidator.add('@');
        passwordValidator.add('#');
        passwordValidator.add('$');
        passwordValidator.add('%');
        passwordValidator.add('^');
        passwordValidator.add('&');
        passwordValidator.add('*');
        passwordValidator.add('(');
        passwordValidator.add(')');
    }

    public boolean containsSpecialCharacter(String password) {
        for (char c : password.toCharArray()) {
            if (passwordValidator.contains(c)) {
                return true;
            }
        }
        return false;
    }
}
