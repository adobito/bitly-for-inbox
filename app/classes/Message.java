package classes;

public class Message
{
    private String chat_id;

    private Sender sender;

    private Users[] users;

    private String count;

    private Data data;

    private String event_id;

    private String read;

    private String created_at;

    private String type;

    public String getChat_id ()
    {
        return chat_id;
    }

    public void setChat_id (String chat_id)
    {
        this.chat_id = chat_id;
    }

    public Sender getSender ()
    {
        return sender;
    }

    public void setSender (Sender sender)
    {
        this.sender = sender;
    }

    public Users[] getUsers ()
    {
        return users;
    }

    public void setUsers (Users[] users)
    {
        this.users = users;
    }

    public String getCount ()
    {
        return count;
    }

    public void setCount (String count)
    {
        this.count = count;
    }

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    public String getEvent_id ()
    {
        return event_id;
    }

    public void setEvent_id (String event_id)
    {
        this.event_id = event_id;
    }

    public String getRead ()
    {
        return read;
    }

    public void setRead (String read)
    {
        this.read = read;
    }

    public String getCreated_at ()
    {
        return created_at;
    }

    public void setCreated_at (String created_at)
    {
        this.created_at = created_at;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }
}