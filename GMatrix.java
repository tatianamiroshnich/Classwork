import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class GMatrix<T extends Number> {
    private T[][] matrix;
    private int rowsQuantity;
    private int columnsQuantity;

    public GMatrix(T[][] matrix) {
        this.matrix = matrix;
        this.rowsQuantity = matrix.length;
        this.columnsQuantity = matrix[0].length;
    }

    public GMatrix add(GMatrix a) {
        if (rowsQuantity != a.getRowsQuantity() || columnsQuantity != a.getColumnsQuantity()) return null;
        Double[][] m = new Double[rowsQuantity][columnsQuantity];
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                m[i][j] = matrix[i][j].doubleValue() + a.getMatrix()[i][j].doubleValue();
            }
        }
        return new GMatrix(m);
    }

    public GMatrix subtract(GMatrix a) {
        return this.add(a.multiply(-1));
    }

    public <T extends Number> GMatrix multiply(T a) {
        Double[][] m = new Double[rowsQuantity][columnsQuantity];
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < columnsQuantity; j++) {
                m[i][j] = a.doubleValue() * matrix[i][j].doubleValue();
            }
        }
        return new GMatrix(m);
    }

    public <T extends Number> GMatrix divide(T a) {
        return this.multiply(1 / a.doubleValue());
    }

    public GMatrix multiply(GMatrix a) {
        if (this.getColumnsQuantity() != a.getRowsQuantity()) return null;
        Double[][] m = new Double[rowsQuantity][a.getColumnsQuantity()];
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < a.getColumnsQuantity(); j++) {
                m[i][j] = 0.0;
            }
        }
        for (int i = 0; i < rowsQuantity; i++) {
            for (int j = 0; j < a.getColumnsQuantity(); j++) {
                for (int k = 0; k < columnsQuantity; k++) {
                    m[i][j] += matrix[i][k].doubleValue() * a.getMatrix()[k][j].doubleValue();
                }
            }
        }
        return new GMatrix(m);
    }

    public int getRowsQuantity() {
        return rowsQuantity;
    }

    public int getColumnsQuantity() {
        return columnsQuantity;
    }

    public T[][] getMatrix() {
        return matrix;
    }

    private NumberFormat getNumberFormat(Locale locale) {
        NumberFormat nf = NumberFormat.getInstance(locale);
        nf.setMinimumFractionDigits(3);
        nf.setMaximumFractionDigits(3);
        return nf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GMatrix<?> gMatrix = (GMatrix<?>) o;

        if (rowsQuantity != gMatrix.rowsQuantity) return false;
        return columnsQuantity == gMatrix.columnsQuantity;
    }

    @Override
    public int hashCode() {
        int result = matrix != null ? matrix.hashCode() : 0;
        result = 31 * result + rowsQuantity;
        result = 31 * result + columnsQuantity;
        return result;
    }

    @Override
    public String toString() {
        return "GMatrix{" +
                "matrix=" + (matrix == null ? null : Arrays.asList(matrix)) +
                ", rowsQuantity=" + rowsQuantity +
                ", columnsQuantity=" + columnsQuantity +
                '}';
    }


}
