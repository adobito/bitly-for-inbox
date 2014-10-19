package shortUrl;

public class ShortenedUrl
{
    private String status_code;

    private ShortenedUrlData data;

    private String status_txt;

    public String getStatus_code ()
    {
        return status_code;
    }

    public void setStatus_code (String status_code)
    {
        this.status_code = status_code;
    }

    public ShortenedUrlData getData ()
    {
        return data;
    }

    public void setData (ShortenedUrlData data)
    {
        this.data = data;
    }

    public String getStatus_txt ()
    {
        return status_txt;
    }

    public void setStatus_txt (String status_txt)
    {
        this.status_txt = status_txt;
    }
}