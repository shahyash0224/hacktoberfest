// https://leetcode.com/problems/two-sum/

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        /* Naive Approach */
//        for(int i = 0; i < n; i++) {
//            for(int j = i+1; j < n; j++) {
//                if(arr[i] + arr[j] == target) {
//                    System.out.println("["+ i +", "+ j +"]");
//                }
//            }
//        }

        /* Optimal Approach */
        int[] res = new int[2];
        HashMap<Integer, Integer> processedNum = new HashMap<>();

        for(int i = 0; i < n; i++) {
            int complement = target - arr[i];
            if(processedNum.containsKey(complement)) {
                res[0] = processedNum.get(complement);
                res[1] = i;
                System.out.println("["+ res[0] +", "+ res[1] +"]");
            } else {
                processedNum.put(arr[i], i);
            }
        }
    }
}
