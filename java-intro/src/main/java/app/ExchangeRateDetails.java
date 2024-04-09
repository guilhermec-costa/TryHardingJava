package app;
import com.google.gson.annotations.SerializedName;

public class ExchangeRateDetails {
    private String code;
    private String codein;
    private String name;
    private String high;
    private String low;
    private String varBid;
    @SerializedName("pctChange")
    private String percentChange;
    private String bid;
    private String ask;
    private String timestamp;
    @SerializedName("create_date")
    private String createDate;

    // getters e setters para cada campo
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodein() {
        return codein;
    }

    public void setCodein(String codein) {
        this.codein = codein;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHigh() {
        return high;
    }
}
