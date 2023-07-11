package API;

/*f756ca68-5ea4-4446-9cbb-e7ce531c4d36   */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClima {
    public void consumirApi() {
        String apiKey = "f756ca68-5ea4-4446-9cbb-e7ce531c4d36";
        String url = "http://api.openweathermap.org/data/2.5/weather?q=Mar%20del%20Plata,ar&units=metric";

        try {
            URL apiUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-Meteum-API-Key", apiKey);

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();
                System.out.println(response.toString());
            } else {
                System.out.println("Error en la solicitud. Código de respuesta: " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}