package com.dsa;

public class SetXandY {
    public static int setXandY(int x, int y) {
        int operations = 0;
        for (int i = 0; i < 32; i++) {
            if (((x >> i) & 1) != ((y >> i) & 1)) {
                operations++;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(setXandY(x, y)); // Output: 2
    }
}
