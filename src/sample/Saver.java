package sample;

import java.lang.reflect.Method;

public class Saver {
    public static void saveTextContainer(String text) throws Exception {
        TextContainer tc = new TextContainer(text);
        Class<?> cls = tc.getClass();

        if (cls.isAnnotationPresent(SaveTo.class)) {
            SaveTo st = cls.getAnnotation(SaveTo.class);
            Method[] mt = cls.getDeclaredMethods();
            for (Method m : mt) {
                if (m.isAnnotationPresent(Save.class)) {
                    System.out.println(st.value());
                    m.invoke(tc, st.value());
                    System.out.println("true");
                }
            }
        }

    }
}
