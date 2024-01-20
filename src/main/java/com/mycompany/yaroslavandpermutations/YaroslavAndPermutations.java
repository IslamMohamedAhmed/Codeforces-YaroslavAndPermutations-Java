/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.yaroslavandpermutations;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Islam Mohamed
 */
public class YaroslavAndPermutations {

    public static void main(String[] args) {
        int n, mx = 0;
        int[] a = new int[105];
        int[] b = new int[1005];
        Arrays.fill(b, 0, 1005, 0);
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[a[i]]++;
            mx = Math.max(mx, b[a[i]]);
        }
        if (n % 2 == 0) {
            if (mx <= n / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (mx <= n / 2 + 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
