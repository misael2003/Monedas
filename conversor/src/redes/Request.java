// Realizamos las peticiones a la API

package redes;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {

    public String peticion(String consulta) throws IOException, InterruptedException {

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest peticion = HttpRequest.newBuilder().uri(URI.create(consulta)).build();
        HttpResponse<String> resuesta = cliente.send(peticion,HttpResponse.BodyHandlers.ofString());
        String JSON = resuesta.body();

        return JSON;
    }
}
