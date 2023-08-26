package com.example;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class Principal {
    
    private static final String ADDRESS = "https://query1.finance.yahoo.com/v7/finance/spark?symbols=USDBRL=X";

    public static void main(String[] args) {
        var http = HttpClient.newHttpClient();
        try {
            var req = HttpRequest.newBuilder(new URI(ADDRESS)).GET().build();
            var resp = http.send(req, BodyHandlers.ofString());
            System.out.println(resp.body());
        } catch (URISyntaxException e) {
            System.out.println("Endereço de API inválida");
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao tentar acessar a API");
        }

    }
}
