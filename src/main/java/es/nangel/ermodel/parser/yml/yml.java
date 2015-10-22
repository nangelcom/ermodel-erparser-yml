package es.nangel.ermodel.parser.yml;

import es.nangel.ermodel.parser.Parser;

import java.lang.reflect.ParameterizedType;

/**
 * Created by nangel on 22/10/15.
 */
public class yml implements Parser {
    public void parse(String file) {
        System.out.println(file);
    }
}
