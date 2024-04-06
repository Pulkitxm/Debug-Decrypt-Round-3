import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> hghdbhbdhbhbhb(int n) {
        List<Integer> ahhsdbhsbhsbfhsf = new ArrayList<>();
        int snnfuabfbsdjfb = 2;

        while (n > 1) {
            while (n % snnfuabfbsdjfb == 0) {
                ahhsdbhsbhsbfhsf.add(snnfuabfbsdjfb);
                n /= snnfuabfbsdjfb;
            }
            snnfuabfbsdjfb++;
        }

        return ahhsdbhsbhsbfhsf;
    }

    public static void shdfiuwhfiuwr(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = new StringBuilder(s).reverse().toString();
        List<Integer> ans = new ArrayList<>();
        int[] space = {2, 2, 2, 2, 2};
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                for (int i : space) {
                    ans.add(i);
                }
            } else {
                ans.addAll(hghdbhbdhbhbhb((int) c));
            }
        }
        System.out.println(ans.size());
        shdfiuwhfiuwr(ans);
    }
}