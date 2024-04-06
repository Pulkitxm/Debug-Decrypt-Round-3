import java.util.Scanner;

public class Main {
    public static int[][] kadshfuahfiejfopWKFPOfk(int[][] matrix) {
        int[][] mirroredMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                mirroredMatrix[i][matrix[0].length - 1 - j] = matrix[i][j];
            }
        }

        return mirroredMatrix;
    }

    public static int[][] whgfuiasdhfuasjfijs(int[][] matrix) {
        int[][] whgfuiasdhfuasjfijsMatrix = new int[matrix.length][matrix[0].length];

        for (int i = matrix.length - 1; i >= 0; i--) {
            whgfuiasdhfuasjfijsMatrix[matrix.length - 1 - i] = matrix[i];
        }

        return whgfuiasdhfuasjfijsMatrix;
    }

    public static int[][] jshdgfjasgfuase(int[][] matrix) {
        int[][] updatedMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                updatedMatrix[i][j] = matrix[i][j] + 5;
            }
        }

        return updatedMatrix;
    }

    public static void ahgdvhjabf(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int[][] matrix = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println(r);
        System.out.println(c);
        
        int[][] mirror = kadshfuahfiejfopWKFPOfk(matrix);
        int[][] water = whgfuiasdhfuasjfijs(mirror);
        int[][] finalMatrix = jshdgfjasgfuase(water);
        ahgdvhjabf(finalMatrix);

        scanner.close();
    }
}