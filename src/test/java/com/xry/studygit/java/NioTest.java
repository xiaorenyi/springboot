package com.xry.studygit.java;

import java.net.InetSocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class NioTest {

    final A a = new A();

    public  void main(String arg[]){

        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.get(new byte[10],2,5);
        buffer.flip();
        buffer.rewind();
        buffer.put(new byte[2]);
        buffer.clear();
        buffer.compact();
        buffer.mark();
        buffer.reset();

    }
}

class A{
    private int i= 10;

    private String s = "s";

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
