package app;

import java.lang.reflect.Field;

import com.google.gson.annotations.SerializedName;

public class ExchangeRateResponse {

    // private String USDBRL;
    @SerializedName("USDBRL")
    private ExchangeRateDetails usdBRL;

    public ExchangeRateDetails getUsdBRL() {
        return usdBRL;
    }

    public void returns() {
        Field[] exchangeResponseFields = new ExchangeRateDetails().getClass().getDeclaredFields();
        for(Field field : exchangeResponseFields) {
            System.out.println(field.getName());
        }
    }

}
