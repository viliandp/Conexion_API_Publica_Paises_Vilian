package com.example.paisesapi;

import DAO.RetrofitClient;
import Modelos.Country;
import Modelos.CountryService;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.util.List;

public class HelloController {

    @FXML
    private TextField countryInput; // Campo para ingresar el nombre del país

    @FXML
    private Button searchButton; // Botón para buscar

    @FXML
    private ListView<String> listView; // ListView para mostrar los datos

    @FXML
    public void initialize() {
        searchButton.setOnAction(event -> fetchCountryDetails());
    }

    private void fetchCountryDetails() {
        String countryName = countryInput.getText().trim();
        if (countryName.isEmpty()) {
            listView.getItems().add("Por favor, ingresa un nombre de país.");
            return;
        }

        CountryService service = RetrofitClient.getClient().create(CountryService.class);
        Call<List<Country>> call = service.getCountryByName(countryName);

        call.enqueue(new Callback<List<Country>>() {
            @Override
            public void onResponse(Call<List<Country>> call, Response<List<Country>> response) {
                if (response.isSuccessful() && response.body() != null && !response.body().isEmpty()) {
                    Country country = response.body().get(0); // Usar el primer resultado
                    listView.getItems().clear();
                    listView.getItems().add("Nombre común: " + country.getName().common);
                    listView.getItems().add("Nombre oficial: " + country.getName().official);
                    listView.getItems().add("Capital: " + (country.getCapital() != null && !country.getCapital().isEmpty() ? country.getCapital().get(0) : "N/A"));
                    listView.getItems().add("Región: " + (country.getRegion() != null ? country.getRegion() : "N/A"));
                    listView.getItems().add("Subregión: " + (country.getSubregion() != null ? country.getSubregion() : "N/A"));
                    listView.getItems().add("Población: " + country.getPopulation());
                    listView.getItems().add("Área: " + country.getArea() + " km²");
                    listView.getItems().add("Coordenadas: " + (country.getLatlng() != null ? country.getLatlng() : "N/A"));
                    listView.getItems().add("Bandera: " + country.getFlags().png); // Enlace a la imagen

                } else {
                    listView.getItems().add("No se encontraron resultados para: " + countryName);
                }
            }

            @Override
            public void onFailure(Call<List<Country>> call, Throwable t) {
                listView.getItems().add("Error al conectarse con la API: " + t.getMessage());
            }
        });
    }
}
