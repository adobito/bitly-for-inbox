package classes;

public class Users
{
    private String last_update;

    private String username;

    private String muted;

    private String user_id;

    public String getLast_update ()
    {
        return last_update;
    }

    public void setLast_update (String last_update)
    {
        this.last_update = last_update;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    public String getMuted ()
    {
        return muted;
    }

    public void setMuted (String muted)
    {
        this.muted = muted;
    }

    public String getUser_id ()
    {
        return user_id;
    }

    public void setUser_id (String user_id)
    {
        this.user_id = user_id;
    }
}