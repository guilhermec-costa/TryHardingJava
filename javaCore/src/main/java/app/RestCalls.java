package app;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

public class RestCalls {
    public static void start() throws Exception {
        final HttpClient httpClient = HttpClient.newHttpClient();
        Gson gson = new Gson();

        final HttpRequest getRequest =
                HttpRequest.newBuilder().
                    uri(URI.create("https://economia.awesomeapi.com.br/json/last/USD-BRL")).
                    GET().build();
        
        final HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
        final String responseBody = getResponse.body();
        System.out.println(responseBody);

        // from a string in json format
        ExchangeRateResponse exchangeResponse = gson.fromJson(responseBody, ExchangeRateResponse.class);
        System.out.println(exchangeResponse.getUsdBRL().getHigh());
        // exchangeResponse.returns();

    }
}
