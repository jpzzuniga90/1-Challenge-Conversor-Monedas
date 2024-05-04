import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMonedas {

    public Moneda convertirMonedas(String monedaBase, String monedaDestino, double cantidadConvertir){

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/4d0406e9983ed75e66b884f6/pair/"+monedaBase+"/"+monedaDestino+"/"+cantidadConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar la conversion");
        }



    }

}
