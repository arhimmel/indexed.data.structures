package com.rsm.util;

import java.util.Arrays;

/**
 * @see java.nio.Bits
 * Created by Raymond on 12/4/13.
 */
public abstract class ByteUtils {

    public static byte[] fillWithSpaces(byte[] byteArray) {
        Arrays.fill(byteArray, (byte)' ');
        return byteArray;
    }

    public static byte[] fillWithZeros(byte[] byteArray) {
        Arrays.fill(byteArray, (byte)0);
        return byteArray;
    }

    //short

    /**
     * @see java.nio.Bits#makeShort(byte, byte)
     * @param b1
     * @param b0
     * @return
     */
    public static short makeShort(byte b1, byte b0) {
        return (short)((b1 << 8) | (b0 & 0xff));
    }

    /**
     * @see java.nio.Bits#short1(short)
     * @param x
     * @return
     */
    public static byte short1(short x) { return (byte)(x >> 8); }

    /**
     * @see java.nio.Bits#short0(short)
     * @param x
     * @return
     */
    public static byte short0(short x) { return (byte)(x     ); }

//    public static void putShort(long a, short x, boolean bigEndian) {
//        if (bigEndian)
//            putShortB(a, x);
//        else
//            putShortL(a, x);
//    }

    // Integer

    public static int makeInt(byte b3, byte b2, byte b1, byte b0) {
        return (((b3       ) << 24) |
                ((b2 & 0xff) << 16) |
                ((b1 & 0xff) <<  8) |
                ((b0 & 0xff)      ));
    }

    public static byte int3(int x) { return (byte)(x >> 24); }
    public static byte int2(int x) { return (byte)(x >> 16); }
    public static byte int1(int x) { return (byte)(x >>  8); }
    public static byte int0(int x) { return (byte)(x      ); }
}
