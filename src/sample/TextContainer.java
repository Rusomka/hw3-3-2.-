package sample;

import java.io.IOException;
import java.io.PrintWriter;

@SaveTo("D:\\temp\\str.txt")
public class TextContainer {
    private String str;

    public TextContainer(String str) {
        this.str = str;
    }

    public TextContainer() {
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Save
    public void saveStr(String path) throws IOException {
        try (PrintWriter pw = new PrintWriter(path)) {
            pw.write(str);
        }
    }
}
