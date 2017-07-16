package io.adapter;

import java.io.InputStream;

public class CustomByteArrayInputStream extends InputStream {

    private byte[] data;
    private int curs = 0;

    public CustomByteArrayInputStream(byte[] data) {
        this.data = data;
    }

    @Override
    public int read() {
        return data[curs++];
    }
}
