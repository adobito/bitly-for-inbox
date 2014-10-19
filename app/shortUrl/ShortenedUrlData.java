package shortUrl;

public class ShortenedUrlData
{
    private String new_hash;

    private String global_hash;

    private String hash;

    private String long_url;

    private String url;

    public String getNew_hash ()
    {
        return new_hash;
    }

    public void setNew_hash (String new_hash)
    {
        this.new_hash = new_hash;
    }

    public String getGlobal_hash ()
    {
        return global_hash;
    }

    public void setGlobal_hash (String global_hash)
    {
        this.global_hash = global_hash;
    }

    public String getHash ()
    {
        return hash;
    }

    public void setHash (String hash)
    {
        this.hash = hash;
    }

    public String getLong_url ()
    {
        return long_url;
    }

    public void setLong_url (String long_url)
    {
        this.long_url = long_url;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }
}