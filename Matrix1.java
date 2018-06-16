import java.util.Arrays;

/**
 * Created by student on 5/20/2018.
 */
public class Matrix1 {
    private double[][] array;
    private int row, column;

    public Matrix1(double[][] array, int row, int column) {
        this.array = array;
        this.row = row;
        this.column = column;
    }

    public Matrix1(double[][] array) {
        this.array = array;
        this.row = array.length;
        this.column = array[0].length;
    }

    public Matrix1 summ(Matrix1 matrix) {
        if (matrix.row != this.row || matrix.column != this.column) {
            System.out.println("Размер матриц не совпадает");
            return null;
        }
        double[][] resultArray = new double[this.row][this.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                resultArray[i][j] = this.array[i][j] + matrix.array[i][j];
            }
        }
        return new Matrix1(resultArray);
    }

    public Matrix1 multiplication(double number) {

        double[][] resultArray = new double[this.row][this.column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                resultArray[i][j] = this.array[i][j] * number;
            }
        }
        return new Matrix1(resultArray);
    }

    public void print() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                System.out.print(this.array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] array1 = {{1, 1, 1}, {2, 2, 2}};
        Matrix1 matrix1 = new Matrix1(array1);
        Matrix1 matrix2 = new Matrix1(new double[][]{{2, 2, 2}, {3, 3, 3}});
        Matrix1 matrix3 = matrix1.summ(matrix2);
        System.out.println(Arrays.deepToString(matrix3.array));

        Matrix1 matrix4 = matrix1.multiplication(3);
        System.out.println(Arrays.deepToString(matrix4.array));

        matrix1.print();
    }
}
