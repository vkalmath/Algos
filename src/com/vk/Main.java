package com.vk;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.function.Consumer;

import static com.vk.Main.state.*;


class Graph {

}

class GraphNode {
    int v;
    GraphNode[] edgeList = new GraphNode[10];
}


class Node {
    Node(int i) {
        val = i;
    }

    int val;
    Node left;
    Node right;
}

public class Main {

    public static void main(String[] args) {

        double l1[] = {2, 3, 5};
        double l2[] = {4, 6};

        //findMedian(l1, l2);

        String s1 = "AAAA";
        String ptrn = "AAA";

//        int[] indices = findPattern(s1, ptrn);


//        String str = "geekforgeeks";
//
//        System.out.println("first repeating char: " + findFirstRepeatingChar(str));
//
//        System.out.println("first non repeating char: " + findFirstNonRepeatingChar(str));
//
//        //System.out.println("Is "+str+" PALINDROME: "+isPalindrome("acba"));
//
//        String sample = "Ab,c,de!$"; //"a,b$c";
//        System.out.println("reversed String for " + sample + ": " + reverseStringWithSpecialCharsInPlace(sample));
//
//        String input = "aabbba";
//        System.out.println(removeTripleContinuousChars(input));
//
//
//        System.out.println("longest palindrome subbstring: "+ longestPalindrome("abb"));


//        int sortedArr[] = {1, 2, 3, 4, 5, 6, 7};
////
//        Node root = null;
//        root = buildBalanceBinartTree(0, sortedArr.length - 1, sortedArr);
////
//        printTree(root);
//        System.out.println(findMinRoot(root, 1, 3, new Stack<>()).val);
//
//        root = insertElementInBst(root, -9);
//        printTree(root);


//        System.out.println(isNumber("32.e-80123"));
//
//        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
//
//        System.out.println(isPalindrome(-121));
//
//
//        try {
//            URL url = new URL("https://cashi.com.mx/?action=showPromo&code=promo_demo_cashback");
//            System.out.println("query: "+url.getQuery());
//            String[] params = url.getQuery().split("&");
//            for(String str : params) {
//                System.out.println(str.split("=")[1]);
//            }
//            System.out.println("path: "+url.getPath());
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//
// }


//        int[] arr = {-800, -5, 1, 3, 6 ,7, 8, 12, 14, 17, 34, 56, 78, 900, 1000, 5678};
//        System.out.println("Index of -5: "+findElement(arr, -5));
//        int[][]  ranges = {{1,3},{2,6},{8,10},{15,18}};
//
//        for(int row = 0; row < ranges.length; row++) {
//            for(int column = 0; column < ranges[row].length; column++) {
//                System.out.print(ranges[row][column]+", ");
//            }
//            System.out.println();
//        }
//
//        merge(ranges);

//        int arr[] = new int[]{1,4,5,6,3,4,8,3,7};
//        System.out.println("Maximu subarray: "+findMAxSubArray(arr, 3));

//        System.out.println("Max non repeatins subSequence: "+lengthOfLongestSubstring("buhlsdbofdmxjjyyfkroiltuievcffigzrtrvuhcaucldakkldyvprszxnecsmkugendavhapjmukyexdcsutmutzyvumiosmbx"));

        //"aaabbcaaade" -> "a3b2c1a2"
//        System.out.println("formatedd String: " + formattedString1("aaabbbaaabbbdefzzz"));


        //hello, ll -> 2 else -1 if not found
        //System.out.println(findNeedleInHayStack("hello", "hello"));

//        System.out.println("f2(3): "+f2(3));

//        0: 1, 2
//        1: 0
//        2: 0

//        int matrix[][] = {
//                {0, 1, 1},
//                {1, 0, 0},
//                {1, 0, 0}
//        };
//
//        Stack<Integer> stk = new Stack<>();
//        stk.push(7);
//        stk.push(8);
//        stk.push(10);
//        stk.push(11);
//
//        insertItemAtBtmOfStack(100, stk);
//
//        while(!stk.isEmpty()){
//            System.out.println(stk.pop());
//        }


        //Print odd indexed elements from array
//        int[] arr = {2,4,6,8,10,12};
//
//        printOdd(arr);


        //Find min and max in a array recursively
//        int arr[] = {4,6,2,8,1,11,3};
//        int[] mm = findMinMax(arr);
//        System.out.println("min:"+mm[0]+" max:"+mm[1]);


        //Flatten 2D array
//        int arr[][] = {{1, 2, 4, 5}, {6, 7}, {8, 9, 10}};
//        System.out.println(arr.length);
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(" arr[" + row + "][" + col + "]: " + arr[row][col] + ", ");
//            }
//            System.out.println();
//        }
//        List<Integer> list = flattenArray(arr);
//        list.forEach(integer -> System.out.println(integer));
//
//        Integer[][] arr1 = {{1,2}, {0,2}};
//        Arrays.sort(arr1, new Comparator<Integer[]>() {
//
//            @Override
//            public int compare(Integer[] o1, Integer[] o2) {
//                return o1[0] - o2[0];
//            }
//
//        } );


        //find number of subsets which add to given total: NG
//        int[] arr = {2,4,6,10};
//        System.out.println("No of subsets: "+subsetForTotal(arr, 16));

        //find all subbstrings of a string
//        String str = "ABCD";
//        Set<String> list = findAllSubstrings(str);
//        for(String s : list) {
//            System.out.println("s: "+s);
//        }


        //Palindrome recursive
//        String str = "AGADAGA";
//        System.out.println("isPalindrome("+str+"): "+isPalindromeRec(str, 0, str.length()));
//
//        String s = str.toLowerCase().replace("a", "*").replace("e", "*").replace("i", "*").replace("o", "*").replace("u", "*");
//        System.out.println("s ->"+s);

        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};


        //printDiagonalNeighbors(arr, 0, 1);

//        int[] plusOne = plusOne(new int[]{9,9,9,9,9,9,9});
//        System.out.print("Plus one:");
//        for (int i : plusOne) {
//            System.out.print(i);
//        }



//        A message containing letters from A-Z is being encoded to numbers using the following mapping:
//
//        'A' -> 1
//        'B' -> 2
//...
//        'Z' -> 26
//        Given a non-empty string containing only digits, determine the total number of ways to decode it.
//
//        Example 1:
//
//        Input: "12"
//        Output: 2
//        Explanation: It could be decoded as "AB" (1 2) or "L" (12).
//                Example 2:
//
//        Input: "226"
//        Output: 3
//        Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).

        System.out.println("possible decoding ways: "+decodeToString("12345"));


    }

    //12345

    private static int decodeToString(String str) {
        int count = 1; // 1 for all the individual chars
        int width = 2;
        for(int i  = 0; i < str.length(); i++) {
            if(i+width <= str.length()) {
                String subStr = str.substring(i, i + width);
                System.out.println(subStr);
                if (isValidChar(subStr)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isValidChar(String subStr) {
        return Integer.valueOf(subStr) <= 26 && Integer.valueOf(subStr) > 0;
    }


    private static int[] plusOne(int[] arr) {

        // [9, 9, 9]
        // [1, 0, 0, 0]
        ArrayList<Integer> list = new ArrayList<>();
        int carry = 0;
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                sum = arr[i] + 1 + carry;
            } else {
                sum = arr[i] + carry;
            }
            if (sum > 9) {
                carry = 1;
                sum = 0;
            } else {
                carry = 0;
            }
            list.add(sum);
        }
        if (carry > 0) {
            list.add(carry);
        }

        int plusOne[] = new int[list.size()];
        int index = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            plusOne[index++] = list.get(i);
        }
        return plusOne;
    }

    public static void printDiagonalNeighbors(int[][] arr, int x, int y) {
        int row = arr.length;
        int col = arr[0].length;
        System.out.println("row: " + row + " col: " + col);
        int i = 0;
        int j = col - 1;
        for (; i < row && j >= 0; i++, j--) {
            if (i != x && j != y) {
                System.out.println("[" + i + "][" + j + "] " + arr[i][j]);
            }
        }

        int k = 0;
        int l = 0;
        for (; k < row && l < col; k++, l++) {
            if (k != x && l != y) {
                System.out.println("[" + k + "][" + l + "] " + arr[k][l]);
            }
        }
    }

    private static Boolean isPalindromeRec(String str, int start, int end) {
        if (str.length() <= 1) return true;

        if (str.charAt(start) == str.charAt(end - 1)) {
            String subStr = str.substring(start + 1, end - 1);
            return isPalindromeRec(subStr, 0, subStr.length());
        } else {
            return false;
        }
    }

    private static Set<String> findAllSubstrings(String str) {
        Set<String> list = new LinkedHashSet<>();
//        for(int i = 0; i < str.length(); i++) {
//            for(int j = i+1; j <= str.length(); j++) {
//                list.add(str.substring(i, j));
//            }
//        }
//        findAllSubStringsRec(str,0, list);

        int start = 0;
        int end = start + 1;
        findAllSubStringsRecOnly(str, start, end, list);
        return list;
    }

    private static void findAllSubStringsRecOnly(String str, int start, int end, Set<String> list) {
        if (end <= str.length()) {
            String substr = str.substring(start, end);
            System.out.println("substring: " + str.substring(start, end));
            list.add(substr);
            findAllSubStringsRecOnly(str, start, end + 1, list);
            if (start + 1 == end) findAllSubStringsRecOnly(str, start + 1, (start + 1) + 1, list);
        }


    }

    private static void findAllSubStringsRec(String str, int start, List<String> list) {
        if (start < str.length()) {
            generateSubStrings(str, start, start + 1, list);
            findAllSubStringsRec(str, start + 1, list);
        }

    }

    private static void generateSubStrings(String str, int start, int end, List<String> list) {
        if (end <= str.length()) {
            list.add(str.substring(start, end));
            generateSubStrings(str, start, end + 1, list);
        }
    }

    private static int subsetForTotal(int[] arr, int total) {

        int numOfDigits = 2;
        int totalCount = 0;
        HashMap<Integer, Set<Integer>> totalMap = new HashMap<>();
        while (numOfDigits < arr.length) {
            totalCount += getTotalsSet(arr, numOfDigits, totalMap, total, totalCount);
            numOfDigits++;
        }

        return totalCount;
    }

    private static int getTotalsSet(int[] arr, int numOfDigits, HashMap<Integer, Set<Integer>> totalMap, int total, int totalCount) {
        if (numOfDigits == 2) {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j) {
                        int sum = arr[i] + arr[j];

                        if (sum == total && !set.contains(sum)) {
                            totalCount += 1;
                        }
                        set.add(sum);
                    }
                }
            }
            totalMap.put(numOfDigits, set);
        } else {
            Set<Integer> prevSet = totalMap.get(numOfDigits - 1);
            prevSet.remove(total);
            Set<Integer> newSet = new HashSet<>();
            for (int num : prevSet) {
                for (int i : arr) {
                    if (!prevSet.contains(i)) {
                        int sum = i + num;

                        if (sum == 16 && !newSet.contains(sum)) {
                            totalCount += 1;
                        }
                        newSet.add(sum);
                    }

                }
            }
            totalMap.put(numOfDigits, newSet);
        }
        return totalCount;
    }

    private static List<Integer> flattenArray(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        flatten(list, arr);
        return list;
    }

    private static void flatten(List<Integer> list, int[][] arr) {
        flatterRow(list, arr, 0);
    }

    private static void flatterRow(List<Integer> list, int[][] arr, int row) {
        if (row < arr.length) {
            flattenColumn(list, arr, 0, row);
            row++;
            flatterRow(list, arr, row);
        }
    }

    private static void flattenColumn(List<Integer> list, int[][] arr, int col, int row) {
        if (col < arr[row].length) {
            list.add(arr[row][col]);
            col++;
            flattenColumn(list, arr, col, row);
        }
    }

    private static int[] findMinMax(int[] arr) {
        int mm[] = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        findmm(0, mm, arr);
        return mm;
    }

    private static void findmm(int index, int[] mm, int[] arr) {
        if (index < arr.length) {
            mm[0] = Math.min(mm[0], arr[index]);
            mm[1] = Math.max(mm[1], arr[index]);
            index++;
            findmm(index, mm, arr);
        }
    }

    private static void printOdd(int[] arr) {
        print(0, arr);
    }

    private static void print(int index, int[] arr) {
        if (index < arr.length) {
            if (index % 2 != 0) {
                System.out.println(arr[index]);
            }
            index++;
            print(index, arr);
        }
    }

    private static void insertItemAtBtmOfStack(int item, Stack<Integer> stk) {
        if (!stk.isEmpty()) {
            int top = stk.pop();
            insertItemAtBtmOfStack(item, stk);
            stk.push(top);
        } else {
            stk.push(item);
        }
    }


    public static int f2(int N) {
        if (N <= 1) return 1;
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += f2(i) + f2(N - i - 1);
        }
        return total;
    }

    private static int findNeedleInHayStack(String src, String dst) {

        int dstStart = 0;
        boolean isSame = false;

        if (dst == null || dst.length() == 0) return -1;

        for (int i = 0; i < src.length(); i++) {
            if (dstStart < dst.length()) {
                if (src.charAt(i) == dst.charAt(dstStart)) {
                    isSame = true;
                    dstStart++;
                } else {
                    isSame = false;
                }
            } else {
                if (isSame) {
                    return i - dst.length();
                } else {
                    return -1;
                }
            }
        }

        if (isSame) {
            if (dstStart < dst.length()) {
                return -1;
            } else {
                return src.length() - dstStart;
            }
        } else {
            return -1;
        }

    }

    private static String formattedString1(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }

        Map<Character, LinkedList<Integer>> map = new HashMap<>();
        Queue<Integer> posQ = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                map.put(str.charAt(i), getQueWithCount(1));
                posQ.add(i);
            } else {
                char prev = str.charAt(i - 1);
                char cur = str.charAt(i);

                if (cur == prev) {
                    int count = map.get(cur).removeLast();
                    map.get(cur).addLast(count + 1);
                } else {
                    posQ.add(i);
                    if (!map.containsKey(cur)) {
                        map.put(str.charAt(i), getQueWithCount(1));
                    } else {
                        LinkedList existing = map.get(cur);
                        existing.addLast(1);
                    }
                }
            }
        }

        while (!posQ.isEmpty()) {
            int pos = posQ.remove();
            stringBuilder.append(str.charAt(pos));
            stringBuilder.append(map.get(str.charAt(pos)).removeFirst());
        }

        return stringBuilder.toString();
    }

    private static LinkedList<Integer> getQueWithCount(int i) {
        LinkedList<Integer> q = new LinkedList<>();
        q.add(i);
        return q;
    }

    private static String formattedString(String str) {

        if (str == null) return null;
        int start = 0;
        int end = 0;
        StringBuilder stringBuilder = new StringBuilder();
        boolean same = false;

        int count = 0;
        while (end < str.length()) {
            if (str.charAt(start) == str.charAt(end)) {
                count++;
                end++;
                same = true;
            } else {
                stringBuilder.append(str.charAt(start));
                stringBuilder.append(count);
                count = 0;
                start = end;
                same = false;
            }

        }
        System.out.println("start: " + start + " end: " + end + " count: " + count);
        if (same) {
            stringBuilder.append(str.charAt(start));
            stringBuilder.append(count);
        } else {
            stringBuilder.append(str.charAt(start));
            stringBuilder.append(1);
            stringBuilder.append(str.charAt(end));
            stringBuilder.append(1);
        }
        return stringBuilder.toString();
    }

    static class Pair {
        public Pair(int c, boolean f) {
            count = c;
            containsRepeating = f;
        }

        int count;
        boolean containsRepeating;
    }

    public static int lengthOfLongestSubstring(String s) {
        int longestSubstrLength = Integer.MIN_VALUE;
        if (s.length() == 0 || s == null) return 0;
        Set<Character> set = new HashSet<Character>();

        int windowStart = 0;
        int windowEnd = 0;
        while (windowStart < s.length() && windowEnd < s.length()) {

            //Pair p = lengthOfNonRepeatingSubStr(s, windowStart, windowEnd, set);
            if (set.contains(s.charAt(windowEnd))) {
                set.remove(s.charAt(windowStart));
                windowStart++;
            } else {
                set.add(s.charAt(windowEnd));
                windowEnd++;
            }
            longestSubstrLength = Math.max(longestSubstrLength, windowEnd - windowStart);
        }

        return longestSubstrLength;

    }

    public static Pair lengthOfNonRepeatingSubStr(String s, int windowStart, int end, Set<Character> set) {

        int count = Integer.MIN_VALUE;
        System.out.println("ws: " + windowStart + " end:" + end);
        for (int i = windowStart; i <= end; i++) {
            char ch = s.charAt(i);
            System.out.println("" + ch);
            if (!set.contains(ch)) {
                set.add(ch);
            } else {
                return new Pair(count, true);
            }
        }
        return new Pair(set.size(), false);
    }


    private static int findMAxSubArray(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < arr.length; i++) {
            curSum = curSum + arr[i];
            if (i >= k - 1) {
                max = Math.max(curSum, max);
                curSum = curSum - arr[i - (k - 1)];
            }
        }
        return max;
    }

    private static Node insertElementInBst(Node root, int i) {
        if (root == null) {
            root = new Node(i);

        } else {
            if (i <= root.val) {
                root.left = insertElementInBst(root.left, i);
            } else {
                root.right = insertElementInBst(root.right, i);
            }
        }
        return root;
    }


    public static Node findMinRoot(Node root, int n1, int n2, Stack<Node> stack) {
        if (root == null) return null;

        if (root.val == n1 || root.val == n2) {
            return root;
        } else {
            Node left = findMinRoot(root.left, n1, n2, stack);
            Node right = findMinRoot(root.right, n1, n2, stack);

            if (left != null && right != null) return root;
            if (left != null) return left;
            if (right != null) return right;
            return null;


        }


    }

    private static void merge(int[][] ranges) {
        int row = 0;
        int col = 0;

        while (row < ranges.length) {
            //while(col  < ranges[row].length) {
            int nextRow = row + 1;
            if (nextRow < ranges.length) {
                if (ranges[nextRow][0] > ranges[row][0] && ranges[nextRow][0] <= ranges[row][1]) {
                    ranges[row][1] = ranges[nextRow][1];
                    nextRow++;
                }
            }
            //}
        }
    }


    public static int findElement(int[] arr, int elem) {
        int left = 0;
        int right = arr.length - 1;
        int index = find(arr, left, right, elem);
        return index;
    }

    private static int find(int[] arr, int left, int right, int elem) {
        if (left <= right) {
            int mid = (right + left) / 2;
            int index = -1;
            if (elem > arr[mid]) {
                index = find(arr, mid + 1, right, elem);
            } else if (elem < arr[mid]) {
                index = find(arr, left, mid - 1, elem);
            } else {
                return mid;
            }
            return index;
        } else {
            return -1;
        }
    }


    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = map.getOrDefault(ch, 0);
            map.put(ch, count + 1);
        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 1) {
                return s.indexOf(entry.getValue());
            }
        }

        return -1;
    }

    private static boolean isPalindrome(int i) {
        if (i < 10) return true;
        return false;
    }


    public static String minWindow(String s, String t) {
        if (s == null || t == null) {
            return "";
        }
        if (s.equals(t)) {
            return t;
        }

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < t.length(); i++) {
            set.add(t.charAt(i));
        }

        int start = 0;
        int end = s.length();

        for (int index = s.length() - 1; index >= 0; index--) {
            if (set.contains(s.charAt(index))) {
                set.remove(s.charAt(index));
            } else {
                // end = index;
            }

            if (set.isEmpty()) {
                start = index;
                break;
            }
        }

        if (set.isEmpty()) {
            return s.substring(start, end);
        }

        return "";

    }


    enum state {
        INIT,
        SIGN,
        DIGITS,
        DIGITS_DEC_START,
        DIGITS_DEC_END,
        EXP,
        DECIMAL,
        NOT_A_NUMBER

    }

    public static boolean isNumber(String s) {
        if (s == null) return false;
        if (s.startsWith(".e") || s.endsWith(".e") || s.endsWith("+") || s.endsWith("-")) return false;
        state STATE = state.INIT;
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            switch (STATE) {
                case INIT: {
                    if (Character.isSpaceChar(currentChar)) {
                        STATE = state.INIT;
                    } else if (isPlusOrMinus(currentChar)) {
                        STATE = state.SIGN;
                    } else if (isDecimalChar(currentChar)) {
                        STATE = state.DIGITS_DEC_START;
                    } else if (!Character.isDigit(currentChar)) {
                        STATE = state.NOT_A_NUMBER;
                    } else {
                        STATE = state.DIGITS;
                    }
                }
                break;

                case SIGN: {
                    if (Character.isSpaceChar(currentChar) || Character.isDigit(currentChar) || isPlusOrMinus(currentChar) || Character.isAlphabetic(currentChar)) {
                        STATE = state.NOT_A_NUMBER;
                    }

                    if (Character.isDigit(currentChar)) {
                        STATE = state.DIGITS;
                    }
                }
                break;

                case DIGITS: {
                    if (Character.isDigit(currentChar)) {
                        STATE = state.DIGITS;
                    } else if (isPlusOrMinus(currentChar) || (!Character.isDigit(currentChar) && !isExpChar(currentChar)) ||
                            Character.isSpaceChar(currentChar)) {
                        STATE = state.NOT_A_NUMBER;
                    }

                    if (isExpChar(currentChar)) {
                        STATE = state.EXP;
                    }

                    if (isDecimalChar(currentChar)) {
                        STATE = state.DIGITS_DEC_START;
                    }
                }
                break;

                case DIGITS_DEC_START: {
                    if (Character.isDigit(currentChar)) {
                        STATE = state.DIGITS_DEC_END;
                    } else if (isExpChar(currentChar)) {
                        STATE = state.EXP;
                    } else {
                        STATE = state.NOT_A_NUMBER;
                    }


                }
                break;

                case DIGITS_DEC_END: {
                    if (Character.isDigit(currentChar)) {
                        STATE = state.DIGITS_DEC_END;
                    } else if (isPlusOrMinus(currentChar) || (!Character.isDigit(currentChar) && !isExpChar(currentChar)) || Character.isSpaceChar(currentChar)
                            || isDecimalChar(currentChar)) {
                        STATE = state.NOT_A_NUMBER;
                    } else if (isExpChar(currentChar)) {
                        STATE = state.EXP;
                    } else if (isDecimalChar(currentChar)) {
                        STATE = state.NOT_A_NUMBER;
                    }
                }
                break;


                case EXP: {
                    if (Character.isDigit(currentChar) || isPlusOrMinus(currentChar)) {
                        STATE = state.DECIMAL;
                    } else if (!Character.isDigit(currentChar) || Character.isSpaceChar(currentChar)
                            || isDecimalChar(currentChar) || isExpChar(currentChar)) {
                        STATE = state.NOT_A_NUMBER;
                    }
                }
                break;


                case DECIMAL: {
                    if (Character.isDigit(currentChar) || Character.isSpaceChar(currentChar)) {
                        STATE = state.DECIMAL;
                    } else if (isPlusOrMinus(currentChar) || !Character.isDigit(currentChar)
                            || isDecimalChar(currentChar) || isExpChar(currentChar)) {
                        STATE = state.NOT_A_NUMBER;
                    }
                }
                break;

            }
        }

        if (STATE == state.DECIMAL || STATE == state.DIGITS_DEC_END || STATE == state.DIGITS) {
            return true;
        } else {
            if (STATE == state.DIGITS_DEC_START && s.charAt(s.length() - 1) == '.' && s.length() > 1) {
                return true;
            } else {
                return false;
            }
        }
    }

    static boolean isPlusOrMinus(char ch) {
        return ch == '+' || ch == '-';
    }

    static boolean isExpChar(char ch) {
        return ch == 'e' || ch == 'E';
    }

    static boolean isDecimalChar(char ch) {
        return ch == '.';
    }


    private static void printTree(Node root) {
        if (root == null) return;
        printTree(root.left);
        System.out.println(root.val + "->");
        printTree(root.right);
    }

    //  1,2,3,4,5,6,7
    private static Node buildBalanceBinartTree(int start, int end, int[] arr) {
        Node root = null;
        int mid = start + (end - start) / 2;  // (0+6)/2 = 3 -> 4, (0+3)/2=1

        if (start != end) {
            System.out.println("start->" + start + " end->" + end + " mid->" + arr[mid]);
            root = new Node(arr[mid]);
            root.val = arr[mid];  // 4, 2
            root.left = buildBalanceBinartTree(start, mid, arr);  // 0, 3
            root.right = buildBalanceBinartTree(mid + 1, end, arr);  //4, 6
        }
        return root;
    }


    public static String longestPalindrome(String s) {
        int startIndex = 0;

        int longest = 0;
        String longestPalindrome = "";

        boolean allSame = false;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                allSame = true;
            } else {
                allSame = false;
                break;
            }
        }

        if (allSame) {
            return s;
        }

        while (startIndex < s.length()) {

            for (int endIndex = s.length(); endIndex > startIndex; endIndex--) {
//                System.out.println("substring: "+s.substring(startIndex, endIndex));
//                    System.out.println("startIndex: " + startIndex + " endIndex: " + endIndex);
                if (isPalindrome(s.substring(startIndex, endIndex), s.length())) {
                    if (s.substring(startIndex, endIndex).length() > longest) {
                        longest = s.substring(startIndex, endIndex).length();
                        longestPalindrome = s.substring(startIndex, endIndex);
                        System.out.println(longestPalindrome);
                    }
                }


            }
            startIndex++;
        }

        return longestPalindrome;
    }

    static boolean isPalindrome(String s, int originalLength) {
//        System.out.println("substring length: "+s.length()+" original length(): "+originalLength);
        if (s == null || originalLength == s.length()) {
            return false;
        }

        if (s.length() <= 1) {
            return true;
        }

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    private static String removeTripleContinuousChars(String input) {
        int lookup[] = new int[128];
        char[] charArray = input.toCharArray();
        StringBuilder newArray = new StringBuilder();
        if (input.length() < 3) {
            return input;
        }

        int index = 0;
        while (index < input.length() - 2) {
            if (charArray[index] == charArray[index + 1] && charArray[index] == charArray[index + 2]) {
                index = index + 3;
            } else {
                newArray.append(charArray[index]);
                index++;
            }
        }

        if (charArray[input.length() - 3] == charArray[input.length() - 2] && charArray[input.length() - 3] == charArray[index - 1]) {
            newArray.append(charArray[input.length() - 1]);
        } else {
            newArray.append(charArray[input.length() - 2]);
            newArray.append(charArray[input.length() - 1]);
        }
        return new String(newArray);
    }

    private static String reverseStringWithSpecialCharsInPlace(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        int startIndex = 0;
        int endIndex = stringBuilder.length() - 1;

        while (startIndex < endIndex) {
            if (!isChar(stringBuilder.charAt(endIndex))) {
                endIndex--;
            } else if (!isChar(stringBuilder.charAt(startIndex))) {
                startIndex++;
            } else {
                char temp = stringBuilder.charAt(startIndex);
                stringBuilder.replace(startIndex, startIndex + 1, stringBuilder.charAt(endIndex) + "");
                stringBuilder.replace(endIndex, endIndex + 1, temp + "");
                startIndex++;
                endIndex--;
            }
        }

        return stringBuilder.toString();
    }

    private static boolean isChar(char ch) {
        return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
    }

    private static boolean isPalindrome(String str) {

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    private static char findFirstNonRepeatingChar(String str) {
        //O(n^2)
//        for(int i = 0 ; i< str.length(); i++) {
//            for(int j = str.length()-1; i < j; j--) {
//                if(str.charAt(i) == str.charAt(j)) {
//                    break;
//                } else {
//                  if(j-i == 1) {
//                      return str.charAt(i);
//                  }
//                }
//            }
//        }

        int charArrayCount[] = new int[128];

        for (int i = 0; i < str.length(); i++) {
            charArrayCount[str.charAt(i)] = charArrayCount[str.charAt(i)] + 1;
        }


        for (int i = 0; i < str.length(); i++) {
            if (charArrayCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }


        return '#';
    }

    private static char findFirstRepeatingChar(String str) {

        int charArrayCount[] = new int[256];

        for (int i = 0; i < str.length(); i++) {
            charArrayCount[str.charAt(i)] = charArrayCount[str.charAt(i)] + 1;
        }


        for (int i = 0; i < str.length(); i++) {
            if (charArrayCount[str.charAt(i)] > 1) {
                return str.charAt(i);
            }
        }


        return '\0';
    }

    private static void findMedian(double[] l1, double[] l2) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < l1.length; i++) {
            priorityQueue.add(l1[i]);
        }

        for (int i = 0; i < l2.length; i++) {
            priorityQueue.add(l2[i]);
        }


        if ((l1.length + l2.length) % 2 == 0) {
            int mid1 = 0;
            double item1 = 0;
            while (mid1 <= (l1.length + l2.length) / 2 - 1) {
                item1 = priorityQueue.poll();
                mid1++;
            }
            double item2 = priorityQueue.poll();
            System.out.println((item1 + item2) / 2.0);
        } else {
            int mid1 = 0;
            double item1 = 0;
            while (mid1 <= (l1.length + l2.length) / 2) {
                item1 = priorityQueue.poll();
                mid1++;
            }
            System.out.println(item1);
        }
    }


    static int[] findPattern(String src, String pattern) {
        List<Integer> indices = new ArrayList();


        if (!src.contains(pattern)) {
            indices.add(-1);
        } else {
            for (int i = 0; i < src.length(); i++) {
                if (i + pattern.length() <= src.length()) {
                    String substr = src.substring(i, i + pattern.length());
                    System.out.println(substr);
                    if (substr.contentEquals(pattern)) {
                        indices.add(i);
                    }
                }
            }
        }

        int index = 0;
        int arr[] = new int[indices.size()];
        for (int item : indices) {
            arr[index++] = item;
        }

        return arr;
    }


}
