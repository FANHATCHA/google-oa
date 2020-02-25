package com.oa;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    //This code has been tested || Working

    //https://leetcode.com/problems/unique-email-addresses/

        public int numUniqueEmails(String[] emails) {

            Set<String> seen = new HashSet();

            for (String email : emails) {
                int i = email.indexOf('@');
                String local = email.substring(0, i);
                String rest = email.substring(i);
                if (local.contains("+")) {
                    local = local.substring(0, local.indexOf('+'));
                }
                // Note: one should escape the specific character '.',
                // since it is treated as a regex expression.
                local = local.replaceAll("\\.", "");
                seen.add(local + rest);
            }

            return seen.size();
        }

}
