package sample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        String test = "финальный тест проги";

        try {
            Saver.saveTextContainer(test);
        } catch (Exception e) {
            e.printStackTrace();
        }

       TextContainer tc= new TextContainer();
        Class<?> cls = tc.getClass();
        Annotation an=cls.getAnnotation(SaveTo.class);
        an.annotationType();



    }
}
