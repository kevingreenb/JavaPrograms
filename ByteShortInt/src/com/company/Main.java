package com.company;

public class Main {

    public static void main(String[] args) {
        //8bits
        byte myMinByte = -128;
        byte myMaxByte = 127;
        byte byteCast = (byte) (myMaxByte/2);
        //16bits
        short myMinShort = -32768;
        short myMaxShort = 32767;
        short shortCast = (short) (myMaxShort/2);
        // 32bits
        int myMinInt = -2_147_483_648;
        int myMaxInt = 2_147_483_647;
        // 64bits
        long myMinLong = -9_223_372_036_854_775_808L;
        long myMaxLong = 9_223_372_036_854_775_807L;
        long longCast = shortCast + 5000;

        System.out.println(longCast);

    }
}
