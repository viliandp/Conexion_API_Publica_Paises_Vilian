package Modelos;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

public class Country {
    //Nombre común y oficial
    public Name name;

    //Capitales (puede ser una lista vacía o null)
    @SerializedName("capital")
    public ArrayList<String> capital;

    //Región y subregión
    @SerializedName("region")
    public String region;

    @SerializedName("subregion")
    public String subregion;

    //Población
    @SerializedName("population")
    public int population;

    //Área en kilómetros cuadrados
    @SerializedName("area")
    public double area;

    //Coordenadas (latitud y longitud)
    @SerializedName("latlng")
    public ArrayList<Double> latlng;

    //Idiomas hablados
    @SerializedName("languages")
    public Languages languages;

    //Información de la bandera
    @SerializedName("flags")
    public Flags flags;

    //Getters y Setters
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public ArrayList<String> getCapital() {
        return capital;
    }

    public void setCapital(ArrayList<String> capital) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public ArrayList<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(ArrayList<Double> latlng) {
        this.latlng = latlng;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public static class Name {
        public String common;
        public String official;

        public String getCommon() {
            return common;
        }

        public void setCommon(String common) {
            this.common = common;
        }

        public String getOfficial() {
            return official;
        }

        public void setOfficial(String official) {
            this.official = official;
        }
    }

    public static class Languages {
        @SerializedName("spa")
        public String spanish;

        public String getSpanish() {
            return spanish;
        }

        public void setSpanish(String spanish) {
            this.spanish = spanish;
        }
    }

    public static class Flags {
        public String png;
        public String svg;

        public String getPng() {
            return png;
        }

        public void setPng(String png) {
            this.png = png;
        }

        public String getSvg() {
            return svg;
        }

        public void setSvg(String svg) {
            this.svg = svg;
        }
    }
}






