package a816.android.soldesk.wein;

/**
 * Created by soldesk on 2016-09-06.
 */
public class WeInDTO {

    private String url;
    private String wein_data;

    public WeInDTO(String wein_data,String url){
        this.wein_data = wein_data;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWein_data() {
        return wein_data;
    }

    public void setWein_data(String wein_data) {
        this.wein_data = wein_data;
    }
}
