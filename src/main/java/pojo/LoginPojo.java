package pojo;

import lombok.Data;

@Data
public class LoginPojo
{
    private String username;
    private String password;


    public LoginPojo(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

}
