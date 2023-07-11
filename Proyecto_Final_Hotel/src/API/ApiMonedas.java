package API;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

public class ApiMonedas {
    public void consumirApiMonedas() {
        try {
            // Construir la URL de la API con los parámetros necesarios
            // convertimos 10 libras esterlinas a dólares estadounidenses.
            String url = "https://api.exchangeratesapi.io/latest?symbols=USD&base=GBP";

            // Crear una instancia de HttpURLConnection
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

            // Establecer el método de solicitud a GET
            connection.setRequestMethod("GET");

            // Obtener la respuesta de la API
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Leer la respuesta de la API
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                    response.toString();
                }
                in.close();

                // Procesar la respuesta JSON para obtener el resultado de la conversión
                double conversion = obtenerConversion(response.toString());

                // Imprimir el resultado de la conversión
                System.out.println("10 libras esterlinas equivalen a " + conversion + " dólares");
            } else {
                System.out.println("Error en la respuesta de la API: " + responseCode);
            }

            // Cerrar la conexión
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private double obtenerConversion(String response) {
        try {
            JSONObject json = new JSONObject(response);
            JSONObject rates = json.getJSONObject("rates");
            double conversion = rates.getDouble("USD");
            return conversion * 10; // Convertir 1 libra esterlina a 10 libras esterlinas
        } catch (JSONException e) {

        }
        return 1.27792; // Valor predeterminado si no se encuentra la tasa de conversión
    }
}
