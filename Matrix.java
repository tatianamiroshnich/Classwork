import java.util.Arrays;

public class Matrix<T extends Number> {

    private T[][] array;
    private T row, column;

    public Matrix(T[][] array, T row, T column) {
        this.array = array;
        this.row = row;
        this.column = column;
    }

    public Matrix(T[][] array) {
        this.array = array;
    }

    public T[][] getArray() {
        return array;
    }

    public void setArray(T[][] array) {
        this.array = array;
    }

    public T getRow() {
        return row;
    }

    public void setRow(T row) {
        this.row = row;
    }

    public T getColumn() {
        return column;
    }

    public void setColumn(T column) {
        this.column = column;
    }
/*
    public Matrix summ(Matrix matrix) {
        if (array.getRow() != this.row || array.getColumn() != this.column) {
            System.out.println("Размер матриц не совпадает");
            return null;
        }
        Double[][] resultArray = new Double[row][column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                resultArray[i][j] = this.array[i][j] + matrix.array[i][j];
            }
        }
        return new Matrix1(resultArray);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix<?> matrix = (Matrix<?>) o;

        // Compare nested arrays - values of array here
        if (row != null ? !row.equals(matrix.row) : matrix.row != null) return false;
        return column != null ? column.equals(matrix.column) : matrix.column == null;
    }

    @Override
    public int hashCode() {
        int result = array != null ? array.hashCode() : 0;
        result = 31 * result + (row != null ? row.hashCode() : 0);
        result = 31 * result + (column != null ? column.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "array=" + (array == null ? null : Arrays.asList(array)) +
                ", row=" + row +
                ", column=" + column +
                '}';
    }
}


