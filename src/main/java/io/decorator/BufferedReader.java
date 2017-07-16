package io.decorator;

public class BufferedReader extends Reader {

    private Reader reader;

    public BufferedReader(Reader reader) {
        this.reader = reader;
    }

    @Override
    public char read() {
        return reader.read();
    }

    public String readLine() {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            char currChar = read();
            if (currChar == '\n') break;
            stringBuilder.append(currChar);
        }
        return stringBuilder.toString();
    }
}
