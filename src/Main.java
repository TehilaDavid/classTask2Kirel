import java.util.Arrays;

public class Main {



    public Element[] sortedArray(char[] s1, char[] s2) {
        newArray(s1);
        newArray(s2);
        Element[] A = new Element[4];

        return A;
    }

    public Element[] newArray(char[] s) {
        int counter = 0;
        Element[] array1 = new Element[s.length];
        for (int i = 0; i < s.length; i++) {
            if (isNewChar(s, i)) {
                array1[counter] = new Element(s[i], amount(s[i], s));
                counter++;
            }
        }
        return array1;
    }

    private int amount(char c1, char[] chars) {
        int amount = 0;
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] == c1) {
                amount++;
            }
        }
        return amount;
    }

    private boolean isNewChar(char[] chars, int index) {
        boolean isNew = true;
        for (int i = 0; i < index; i++) {
            if (chars[i] == chars[index]) {
                isNew = false;
            }
        }
        return isNew;
    }

    public static void sortTry() {
        char[] s1 = {'a', 'f', 'b', 'c'};
        Arrays.sort(s1);
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);

        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        char[] a1 = {'a','b'};
        char[] a2 = {'g','f','j'};
        main.sortedArray(a1,a2)
    }


}
