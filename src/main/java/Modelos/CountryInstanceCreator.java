package Modelos;

import com.google.gson.InstanceCreator;
import java.lang.reflect.Type;

public class CountryInstanceCreator implements InstanceCreator<Country> {
    @Override
    public Country createInstance(Type type) {
        return new Country(); //Crea una nueva instancia de Country
    }
}

