package com.masharo.myStream;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a {@code FilterInputStream}
     * by assigning the  argument {@code in}
     * to the field {@code this.in} so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or {@code null} if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int value = in.read();
        return value == -1 ?  value : Character.toLowerCase((char) value);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = in.read(b, off, len);

        return super.read(b, off, len);
    }
}