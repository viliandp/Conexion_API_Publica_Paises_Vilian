package Modelos;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class CountryTypeAdapter extends TypeAdapter<Country> {

    @Override
    public void write(JsonWriter out, Country value) throws IOException {
        // Escribe el objeto Country como JSON
    }

    @Override
    public Country read(JsonReader in) throws IOException {
        // Lee un objeto JSON y lo convierte en un objeto Country
        return new Gson().fromJson(in, Country.class);
    }
}

