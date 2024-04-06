import java.util.Scanner;

public class Main {
    public static int[][] _1(int[][] matrix) {
        int[][] _2 = new int[matrix.length][matrix[0].length];
        for (int _3 = 0; _3 < matrix.length; _3++) {
            for (int _4 = matrix[0].length - 1; _4 >= 0; _4--) {
                _2[_3][matrix[0].length - 1 - _4] = matrix[_3][_4];
            }
        }
        return _2;
    }

    public static int[][] _2(int[][] matrix) {
        int[][] _3 = new int[matrix.length][matrix[0].length];
        for (int _4 = matrix.length - 1; _4 >= 0; _4--) {
            _3[matrix.length - 1 - _4] = matrix[_4];
        }
        return _3;
    }

    public static int[][] _3(int[][] matrix) {
        int[][] _4 = new int[matrix.length][matrix[0].length];
        for (int _5 = 0; _5 < matrix.length; _5++) {
            for (int _6 = 0; _6 < matrix[0].length; _6++) {
                _4[_5][_6] = matrix[_5][_6] + 5;
            }
        }
        return _4;
    }

    public static void _4(int[][] matrix) {
        for (int[] _5 : matrix) {
            for (int _6 : _5) {
                System.out.print(_6 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner _5 = new Scanner(System.in);
        int _6 = _5.nextInt();
        int _7 = _5.nextInt();
        int[][] _8 = new int[_6][_7];
        for (int _9 = 0; _9 < _6; _9++) {
            for (int _10 = 0; _10 < _7; _10++) {
                _8[_9][_10] = _5.nextInt();
            }
        }
        System.out.println(_6);
        System.out.println(_7);
        int[][] _9 = _3(_8);
        int[][] _10 = _2(_9);
       // int[][] _11 = _3(_10);
        _4(_10);
        _5.close();
    }
}
