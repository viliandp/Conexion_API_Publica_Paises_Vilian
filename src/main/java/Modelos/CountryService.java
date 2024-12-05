package Modelos;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface CountryService {
    @GET("v3.1/all")
    Call<List<Country>> getAllCountries();

    @GET("v3.1/name/{name}")
    Call<List<Country>> getCountryByName(@Path("name") String name);
}





