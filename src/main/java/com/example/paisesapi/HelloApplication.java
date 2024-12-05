package com.example.paisesapi;

import DAO.RetrofitClient;
import Modelos.Country;
import Modelos.CountryService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class HelloApplication extends Application {

    private ListView<String> listView;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        listView = new ListView<>();
        fetchCountries(); // Llamada a la API para obtener los países

        Scene scene = new Scene(listView, 600, 400);
        primaryStage.setTitle("Países del Mundo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void fetchCountries() {
        CountryService service = RetrofitClient.getClient().create(CountryService.class);
        Call<List<Country>> call = service.getAllCountries();

        call.enqueue(new Callback<List<Country>>() {
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
                if (response.isSuccessful()) {
                    List<Country> countries = response.body();
                    for (Country country : countries) {
                        String capital = (country.getCapital() != null && country.getCapital().length > 0)
                                ? country.getCapital()[0]
                                : "N/A";
                        listView.getItems().add(country.getName().getCommon() + " - Capital: " + capital);
                    }
                } else {
                    // Mostrar mensaje de error si la respuesta no es exitosa
                    listView.getItems().add("Error: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<List<Country>> call, Throwable t) {
                // Manejo de errores de conexión
                listView.getItems().add("Error de conexión: " + t.getMessage());
            }
        });
    }
}
