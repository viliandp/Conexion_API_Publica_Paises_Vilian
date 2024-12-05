package Modelos;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface CountryService {
    @GET("v3.1/all")
    Call<List<Country>> getAllCountries();
}




