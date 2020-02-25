package com.oa;

public class LicenseKeyFormatting {
    //This code has been tested || Working
    //https://leetcode.com/problems/license-key-formatting/

        public String licenseKeyFormatting(String S, int K) {
            String str = S.replaceAll("-", "").toUpperCase();
            if (str.length() < K) {
                return str;
            }

            int q = str.length() / K, r = str.length() % K;
            String s = "";
            if (r > 0) {
                s += str.substring(0, r) + "-";
            }

            for (int i = 0; i < q; i++) {
                int j = r + (K * i);
                if (i < q - 1) {
                    s += str.substring(j, j + K) + "-";
                }
                else {
                    s += str.substring(j, j + K);
                }
            }

            return s;
        }

}
