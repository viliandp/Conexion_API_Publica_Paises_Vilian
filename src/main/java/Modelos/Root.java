package Modelos;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class Root {

    public Name name;
    public ArrayList<String> tld;
    public String cca2;
    public String ccn3;
    public String cca3;
    public String cioc;
    public boolean independent;
    public String status;
    public boolean unMember;
    public Currencies currencies;
    public Idd idd;
    public ArrayList<String> capital;
    public ArrayList<String> altSpellings;
    public String region;
    public String subregion;
    public Languages languages;
    public Translations translations;
    public ArrayList<Double> latlng;
    public boolean landlocked;
    public ArrayList<String> borders;
    public double area;
    public Demonyms demonyms;
    public String flag;
    public Maps maps;
    public int population;
    public Gini gini;
    public String fifa;
    public Car car;
    public ArrayList<String> timezones;
    public ArrayList<String> continents;
    public Flags flags;
    public CoatOfArms coatOfArms;
    public String startOfWeek;
    public CapitalInfo capitalInfo;
    public PostalCode postalCode;

    // Clases estáticas anidadas
    public static class Name {
        public String common;
        public String official;
        public NativeName nativeName;

        public static class NativeName {
            //public Spa spa;
        }
    }

    public static class Currencies {
        @JsonProperty("EUR")
        public EUR eUR;

        public static class EUR {
            public String name;
            public String symbol;
        }
    }

    public static class Idd {
        public String root;
        public ArrayList<String> suffixes;
    }

    public static class Languages {
        public String spa;
        public String cat;
        public String eus;
        public String glc;
    }

    public static class Translations {
        public Ara ara;
        public Bre bre;
        public Ces ces;
        public Cym cym;
        public Deu deu;
        public Est est;
        public Fin fin;
        public Fra fra;
        public Hrv hrv;
        public Hun hun;
        public Ita ita;
        public Jpn jpn;
        public Kor kor;
        public Nld nld;
        public Per per;
        public Pol pol;
        public Por por;
        public Rus rus;
        public Slk slk;
        public Spa spa;
        public Srp srp;
        public Swe swe;
        public Tur tur;
        public Urd urd;
        public Zho zho;

        public static class Ara {
            public String official;
            public String common;
        }

        public static class Bre {
            public String official;
            public String common;
        }

        public static class Ces {
            public String official;
            public String common;
        }

        public static class Cym {
            public String official;
            public String common;
        }

        public static class Deu {
            public String official;
            public String common;
        }

        public static class Est {
            public String official;
            public String common;
        }

        public static class Fin {
            public String official;
            public String common;
        }

        public static class Fra {
            public String official;
            public String common;
            public String f;
            public String m;
        }

        public static class Hrv {
            public String official;
            public String common;
        }

        public static class Hun {
            public String official;
            public String common;
        }

        public static class Ita {
            public String official;
            public String common;
        }

        public static class Jpn {
            public String official;
            public String common;
        }

        public static class Kor {
            public String official;
            public String common;
        }

        public static class Nld {
            public String official;
            public String common;
        }

        public static class Per {
            public String official;
            public String common;
        }

        public static class Pol {
            public String official;
            public String common;
        }

        public static class Por {
            public String official;
            public String common;
        }

        public static class Rus {
            public String official;
            public String common;
        }

        public static class Slk {
            public String official;
            public String common;
        }

        public static class Spa {
            public String official;
            public String common;
        }

        public static class Srp {
            public String official;
            public String common;
        }

        public static class Swe {
            public String official;
            public String common;
        }

        public static class Tur {
            public String official;
            public String common;
        }

        public static class Urd {
            public String official;
            public String common;
        }

        public static class Zho {
            public String official;
            public String common;
        }
    }

    public static class Demonyms {
        public Eng eng;
        public Fra fra;

        public static class Eng {
            public String f;
            public String m;
        }

        public static class Fra {
            public String f;
            public String m;
        }
    }

    public static class Maps {
        public String googleMaps;
        public String openStreetMaps;
    }

    public static class Gini {
        @JsonProperty("2018")
        public double _2018;
    }

    public static class Car {
        public ArrayList<String> signs;
        public String side;
    }

    public static class Flags {
        public String png;
        public String svg;
        public String alt;
    }

    public static class CoatOfArms {
        public String png;
        public String svg;
    }

    public static class CapitalInfo {
        public ArrayList<Double> latlng;
    }

    public static class PostalCode {
        public String format;
        public String regex;
    }
}

