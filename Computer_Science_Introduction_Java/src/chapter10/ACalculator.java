package chapter10;

import java.util.*;

public class ACalculator {
	char[] chars;

    public ACalculator(char[] chars) {

        this.chars = new char[chars.length];

        for (int i = 0; i < chars.length; i++)
            this.chars[i] = chars[i];


    }

    public ACalculator(String string) {
        this(string.toCharArray());
    }

    public char charAt(int index)  {

        return chars[index];

    }

    public int length() {

        return chars.length;
    }

    public ACalculator substring(int begin, int end) {
        char[] s = new char[end - begin];
        for (int i = begin; i < end; i++) {
            s[i - begin ] = chars[i];
        }
        return new ACalculator(s);
    }

    public ACalculator toLowerCase() {
        char[] lowerCase = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                lowerCase[i] = (char)(chars[i] + 32);
            } else {
                lowerCase[i] = chars[i];
            }
        }

        return new ACalculator(lowerCase);

    }

    public boolean equal (ACalculator s) {

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != chars[i]) return false;
        }

        return true;
    }

    public static ACalculator valueOf(int i) {

        int length = getCount(i);
        char[] number = new char[length];
        for (int j = length - 1; j >= 0; j--) {
            number[j] = (char)('0' + (i % 10));
            i /= 10;
        }
        return new ACalculator(number);
    }

    public static ACalculator valueOf(long i) {

        int length = getCount(i);
        char[] number = new char[length];
        for (int j = length - 1; j >= 0; j--) {
            number[j] = (char)('0' + (i % 10));
            i /= 10;
        }
        return new ACalculator(number);
    }

    private static int getCount(long i) {
        int length = 0;
        while (i > 0) {
            i /= 10;
            length++;
        }
        return length;
    }

    public int compare(String s) {

        int limit = Math.min(s.length(), length());

        char[] chArray = s.toCharArray();
        int i = 0;
        while (i < limit) {
            char ch1 = charAt(i);
            char ch2 = chArray[i];
            if (ch1 != ch2) {
                return ch1 - ch2;
            }
            i++;
        }

        return length() - s.length();

    }

    public int compare(ACalculator s) {

        return compare(new String(s.toChars()));

    }
    public ACalculator substring(int begin) {
        return substring(begin, chars.length);
    }
    public ACalculator toUpperCase() {

        char[] temp = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <='z') {
                temp[i] = (char)(chars[i] - 32);
            } else {
                temp[i] = chars[i];
            }
        }

        return new ACalculator(temp);
    }
    public char[] toChars() {
        return chars;
    }

    public String toString() {
        return new String(chars);
    }

    public static ACalculator valueOf(boolean b) {
        return new ACalculator((b) ? "true" : "false");
    }

    public static String[] split(String s, String regex) {

        if (isRegexArray(regex)) {
            return arraySplit(s, regex);
        } else {
            return wordSplit(s, regex);
        }

    }

    private static String[] wordSplit(String s, String regex) {

        ArrayList<String> temp = new ArrayList<>();

        int newIndex = 0;
        for (int i = 0; i < s.length() - regex.length(); i++) {

            if (regex.compareTo(s.substring(i, i + regex.length() )) == 0) {
                temp.add(s.substring(newIndex, i));
                temp.add(regex);
                newIndex = i + regex.length();
            }

        }
        temp.add(s.substring(newIndex, s.length()));
        return temp.toArray(new String[temp.size()]);
    }

    private static String[] arraySplit(String s, String regex) {
        char[] regexChars = getRegex(regex);

        ArrayList<String> temp = new ArrayList<>();
        int newIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < regexChars.length; j++) {

                if (ch == regexChars[j]) {
                    if (newIndex != i)
                        temp.add(s.substring(newIndex, i));
                    temp.add("" + regexChars[j]);
                    newIndex = i + 1;
                }
            }
        }
        temp.add(s.substring(newIndex, s.length()));
        return temp.toArray(new String[temp.size()]);
    }

    private static char[] getRegex(String regex) {

        if (regex.charAt(0) != '[' && regex.charAt(regex.length() - 1) != ']')
            return regex.toCharArray();
        else
            return regex.substring(1, regex.length() - 1).toCharArray();

    }

    private static boolean isRegexArray(String regex) {
        return (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']');
    }

}
