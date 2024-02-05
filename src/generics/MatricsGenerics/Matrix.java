package generics.MatricsGenerics;

import java.util.Scanner;

public class Matrix<T extends Number> {
    private static int rows;
    private static int columns;
    private final T[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = (T[][]) new Number[rows][columns];
    }

    // Метод для установки значения элемента матрицы
    public void setElement(int row, int column, T value) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IllegalArgumentException("Недопустимые индексы");
        }
        data[row][column] = value;
    }

    // Метод для получения значения элемента матрицы
    public T getElement(int row, int column) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            throw new IllegalArgumentException("Недопустимые индексы");
        }
        return data[row][column];
    }

    // Метод для сложения двух матриц
    public Matrix<T> add(Matrix<T> other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            // если матрицы разных размеров
            throw new IllegalArgumentException("Размеры матриц не совпадают");
        }

        Matrix<T> result = new Matrix<>(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                T sum = (T) (Double.valueOf(this.data[i][j].doubleValue() + other.data[i][j].doubleValue()));
                result.setElement(i, j, sum);
            }
        }

        return result;
    }

    public Matrix<T> subtraction(Matrix<T> other) {
        if (this.rows != other.rows || this.columns != other.columns) {
            // если матрицы разных размеров
            throw new IllegalArgumentException("Размеры матриц не совпадают");
        }

        Matrix<T> result = new Matrix<>(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                T sum = (T) (Double.valueOf(this.data[i][j].doubleValue() - other.data[i][j].doubleValue()));
                result.setElement(i, j, sum);
            }
        }

        return result;
    }
    // Method for matrix multiplication
    public Matrix<T> multiply(Matrix<T> other) {
        if (this.columns != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix");
        }

        Matrix<T> result = new Matrix<>(this.rows, other.columns);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                T sum = (T) (Double.valueOf(0.0));

                for (int k = 0; k < this.columns; k++) {
                    T product = (T) (Double.valueOf(this.data[i][k].doubleValue() * other.data[k][j].doubleValue()));
                    sum = (T) (Double.valueOf(sum.doubleValue() + product.doubleValue()));
                }

                result.setElement(i, j, sum);
            }
        }

        return result;
    }



    // Метод для умножения матрицы на число
    public Matrix<T> multiplyByScalar(T scalar) {
        Matrix<T> result = new Matrix<>(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                T product = (T) (Double.valueOf(this.data[i][j].doubleValue() * scalar.doubleValue()));
                result.setElement(i, j, product);
            }
        }

        return result;
    }


    // Метод для вывода матрицы
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Choose data type (1 - Integer, 2 - Double): ");

        int dataTypeChoice;

        while (true) {
            if (scanner3.hasNextInt()) {
                dataTypeChoice = scanner3.nextInt();
                if (dataTypeChoice == 1 || dataTypeChoice == 2) {
                    break;
                } else {
                    System.out.println("Error! Enter 1 or 2.");
                }
            } else {
                System.out.println("Error! Enter 1 or 2.");
                scanner3.next();
            }
        }
        switch (dataTypeChoice) {
            case 1:

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the size of the first matrix: ");
                int sizeFirstMatrix = scanner.nextInt();
                Matrix<Integer> intMatrix1 = new Matrix<>(sizeFirstMatrix, sizeFirstMatrix);


                System.out.print("Enter the size of the second matrix: ");
                int sizeSecondMatrix = scanner.nextInt();
                Matrix<Integer> intMatrix2 = new Matrix<>(sizeSecondMatrix, sizeSecondMatrix);

                System.out.println("Filling the first matrix:\n");
                for (int i = 0; i < sizeFirstMatrix; i++) {
                    for (int j = 0; j < sizeFirstMatrix; j++) {
                        System.out.print("Enter element [" + i + "][" + j + "]: ");
                        int element = scanner.nextInt();
                        intMatrix1.setElement(i, j, element);
                    }
                }
                intMatrix1.printMatrix();


                System.out.println("Filling the second matrix:\n");
                for (int i = 0; i < sizeSecondMatrix; i++) {
                    for (int j = 0; j < sizeSecondMatrix; j++) {
                        System.out.print("Enter element [" + i + "][" + j + "]: ");
                        int element = scanner.nextInt();
                        intMatrix2.setElement(i, j, element);
                    }
                }
                intMatrix2.printMatrix();
                System.out.println("addition\n");
                intMatrix1.add(intMatrix2).printMatrix();
                System.out.println("multiplication\n");
                intMatrix1.multiply(intMatrix2).printMatrix();
                System.out.println("subtraction\n");
                intMatrix1.subtraction(intMatrix2).printMatrix();
                System.out.println("multiplication by scalar\n");
                intMatrix1.multiplyByScalar(2).printMatrix();

                break;
            case 2:

                Scanner scanner2 = new Scanner(System.in);
                System.out.print("Enter the size of the first matrix: ");
                int sizeFirstMatrix1 = scanner2.nextInt();
                Matrix<Double> doubleMatrix1 = new Matrix<>(sizeFirstMatrix1, sizeFirstMatrix1);


                System.out.print("Enter the size of the second matrix: ");
                int sizeSecondMatrix1 = scanner2.nextInt();
                Matrix<Double> doubleMatrix2 = new Matrix<>(sizeSecondMatrix1, sizeSecondMatrix1);

                System.out.println("Filling the first matrix with Double values:\n");
                for (int i = 0; i < sizeFirstMatrix1; i++) {
                    for (int j = 0; j < sizeFirstMatrix1; j++) {
                        System.out.print("Enter element [" + i + "][" + j + "]: ");
                        double element = scanner2.nextDouble();
                        doubleMatrix1.setElement(i, j, element);
                    }
                }
                doubleMatrix1.printMatrix();

                System.out.println("Filling the second matrix with Double values:\n");
                for (int i = 0; i < sizeSecondMatrix1; i++) {
                    for (int j = 0; j < sizeSecondMatrix1; j++) {
                        System.out.print("Enter element [" + i + "][" + j + "]: ");
                        double element = scanner2.nextDouble();
                        doubleMatrix2.setElement(i, j, element);
                    }
                }
                doubleMatrix2.printMatrix();

                System.out.println("addition\n");
                doubleMatrix1.add( doubleMatrix2).printMatrix();
                System.out.println("multiplication\n");
                doubleMatrix1.multiply( doubleMatrix2).printMatrix();
                System.out.println("subtraction\n");
                doubleMatrix1.subtraction( doubleMatrix2).printMatrix();
                System.out.println("multiplication by scalar\n");
                doubleMatrix1.multiplyByScalar(2.0).printMatrix();

                break;
            default:
                System.out.println("Invalid data type choice.");
                return;
        }





    }
}