package Modelos;

import com.google.gson.annotations.SerializedName;

public class Country {

    public Country() {
    }

    public Name name;

    @SerializedName("capital")
    public String[] capital;

    // Getters y Setters para 'name' y 'capital'
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String[] getCapital() {
        return capital;
    }

    public void setCapital(String[] capital) {
        this.capital = capital;
    }
}





