// https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] position = new int[26];
        Arrays.fill(position, -1);

        Set<Character> occurrence = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!occurrence.contains(ch)) {
                occurrence.add(ch);
                position[ch - 'a'] = i;
            } else {
                position[ch - 'a'] = -1;
            }
        }

        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++) {
            if(position[i] != -1) {
                minIndex = Math.min(minIndex, position[i]);
            }
        }
        if(minIndex == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println(minIndex);
        }
    }
}
