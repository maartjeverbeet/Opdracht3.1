package com.company;

public class Main {

    public static int[] merge(int[] a, int[] b) {
        int c = a.length + b.length;
        int[] m = new int[c];
        int ap = 0;
        int bp = 0;

        for (int i = 0; i < c; i++) {
            // Out of bounds ?
            if (ap >= a.length) m[i] = b[bp++];
            else if (bp >= b.length) m[i] = a[ap++];
            else {
                // In bounds .. Lower ?
                if (a[ap] < b[bp]) m[i] = a[ap++];
                else m[i] = b[bp++];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
        int[] b = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int[] m = merge(a, b);
        for (int i : m) System.out.println(i);
    }
}
