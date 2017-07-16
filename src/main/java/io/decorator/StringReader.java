package io.decorator;

public class StringReader extends Reader {

    private String data;
    private int curs = 0;

    public StringReader(String data) {
        this.data = data;
    }

    @Override
    public char read() {
        return data.toCharArray()[curs++];
    }
}
