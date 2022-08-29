package com.mydomainname.exercisepac;

import com.mydomainname.helppac.InputOutputClass;
//import java.util.concurrent.TimeUnit;

public class Exercises {

    private InputOutputClass inputOutput = null;

    public Exercises() {
        inputOutput = new InputOutputClass();
    }

    public void FirstExFirst() {
        int[] mass;
        int k;
        System.out.println("Enter a multiplicity coefficient.");
        k = inputOutput.InputIntegerNumber();
        System.out.println("Enter an array with natural numbers.");
        mass = inputOutput.InputIntegerArray();
        int dimension = mass.length;
        int sum = 0;
        for (int i = 0; i < dimension; i++) {
            if (mass[i] % k == 0)
                sum += mass[i];
        }
        System.out.println("Sum of necessary elements = " + sum + ".");
        System.out.println("End of Exercise.\n");
    }

    public void FirstExSecond() {
        double[] mass;
        double z;
        System.out.println("Enter a Z number.");
        z = inputOutput.InputDoubleNumber();
        System.out.println("Enter a subsequence with real numbers.");
        mass = inputOutput.InputDoubleArray();
        int dimension = mass.length;
        int amount = 0;
        for (int i = 0; i < dimension; i++) {
            if (mass[i] > z) {
                mass[i] = z;
                amount++;
            }
        }
        System.out.println("Your result subsequence:");
        inputOutput.OutputDoubleArray(mass);
        System.out.println("Amount of replacements = " + amount + ".");
        System.out.println("End of Exercise.\n");
    }

    public void FirstExThird() {
        double[] mass;
        System.out.println("Enter an array with real numbers.");
        mass = inputOutput.InputDoubleArray();
        int dimension = mass.length;
        int posAmount = 0, negAmount = 0, zeroAmount = 0;
        for (int i = 0; i < dimension; i++) {
            Double temp = mass[i];
            if (temp.compareTo(0.0) > 0) {
                posAmount++;
            } else if (temp.compareTo(0.0) < 0) {
                negAmount++;
            } else {
                zeroAmount++;
            }
        }
        System.out.println("Amount of positive numbers = " + posAmount + ", of negative numbers = " + negAmount + ", of zeros = " + zeroAmount + ".");
        System.out.println("End of Exercise.\n");
    }

    public void FirstExFourth() {
        double[] mass;
        System.out.println("Enter an array with real numbers.");
        mass = inputOutput.InputDoubleArray();
        int dimension = mass.length;
        double maxNum = mass[0], minNum = mass[0];
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < dimension; i++) {
            if (mass[i] > maxNum) {
                maxNum = mass[i];
                maxIndex = i;
            } else {
                if (mass[i] < minNum) {
                    minNum = mass[i];
                    minIndex = i;
                }
            }
        }
        double buf = mass[maxIndex];
        mass[maxIndex] = mass[minIndex];
        mass[minIndex] = buf;
        System.out.println("Your result array:");
        inputOutput.OutputDoubleArray(mass);
        System.out.println("End of Exercise.\n");
    }

    public void FirstExFifth() {
        int[] mass;
        System.out.println("Enter an array with natural numbers.");
        mass = inputOutput.InputIntegerArray();
        int dimension = mass.length;
        for (int i = 0; i < dimension; i++) {
            if (mass[i] > i + 1) {
                System.out.println("Element(number = " + (i + 1) + ") with index [" + i + "] = " + mass[i] + ";");
            }
        }
        System.out.println("End of Exercise.\n");
    }

    public void FirstExSixth() {
        double[] mass;
        System.out.println("Enter a subsequence with rational numbers.");
        mass = inputOutput.InputDoubleArray();
        int dimension = mass.length;
        double sum = mass[2];
        System.out.println("Element(number = 3) with index [2] = " + mass[2] + ";");
        for (int i = 3; i < dimension; i++) {
            boolean flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println("Element(number = " + (i + 1) + ") with index [" + i + "] = " + mass[i] + ";");
                sum += mass[i];
            }
        }
        System.out.println("Sum of elements = " + sum);
        System.out.println("End of Exercise.\n");
    }

    public void FirstExSeventh() {
        double[] mass;
        int dimension;
        boolean noEvenFlag;
        System.out.println("Enter a subsequence with rational numbers, with multiple of two length.");
        do {
            noEvenFlag = false;
            mass = inputOutput.InputDoubleArray();
            dimension = mass.length;
            if (dimension % 2 != 0) {
                noEvenFlag = true;
                System.out.println("Length of the subsequence must be multiple of two. Enter the correct subsequence.");
            }
        } while (noEvenFlag == true);
        double[] resMass = new double[dimension / 2];
        double maxNum = 0;
        for (int i = 0, j = dimension - 1; i < dimension / 2; i++, j--) {
            resMass[i] = mass[i] + mass[j];
            if (i == 0) {                //из-за необходимости инициализировать переменную
                maxNum = resMass[i];    //maxNum одним из элементов итогового массива добавил ветвление,
            } else {                      //вместо отдельного цикла для поиска maxNum После инициализации итогового массива
                if (maxNum < resMass[i]) {
                    maxNum = resMass[i];
                }
            }
        }
        System.out.println("Your result subsequence:");
        inputOutput.OutputDoubleArray(resMass);
        System.out.println("Max number of this subsequence: " + maxNum + ".");
        System.out.println("End of Exercise.\n");
    }

    public void FirstExEighth() {
        int[] mass;
        int dimension;
        System.out.println("Enter a subsequence with integer numbers.");
        mass = inputOutput.InputIntegerArray();
        dimension = mass.length;
        int minNum = mass[0];
        int amountOfMinNumbers = 1;
        for (int i = 1; i < dimension; i++) {
            if (mass[i] == minNum) {
                amountOfMinNumbers++;
            }
            if (mass[i] < minNum) {
                minNum = mass[i];
                amountOfMinNumbers = 1;
            }
        }
        int[] resMass = new int[dimension - amountOfMinNumbers];
        for (int i = 0, j = 0; i < dimension; i++) {
            if (mass[i] != minNum) {
                resMass[j] = mass[i];
                j++;
            }
        }
        System.out.println("Your result subsequence:");
        inputOutput.OutputIntegerArray(resMass);
        System.out.println("Your min element of subsequence: " + minNum + ".");
        System.out.println("Amount of excluded elements: " + amountOfMinNumbers + ".");
        System.out.println("End of Exercise.\n");
    }

    public void FirstExNinth() {
        int[] mass;
        int dimension;
        System.out.println("Enter an array with integer numbers.");
        mass = inputOutput.InputIntegerArray();
        dimension = mass.length;
        int number = mass[0];
        int amountOfNumbers = 0;
        int amount = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (mass[i] == mass[j]) {
                    amount++;
                }
            }
            if (amountOfNumbers < amount) {
                number = mass[i];
                amountOfNumbers = amount;
            } else if (amountOfNumbers == amount && number > mass[i]) {
                number = mass[i];
            }
            amount = 0;
        }
        System.out.println("Result element: " + number + "\nAmount of this elements in the array: " + amountOfNumbers);
        System.out.println("End of Exercise.\n");
    }

    public void FirstExTenth() {
        int[] mass;
        int dimension;
        System.out.println("Enter an array with integer numbers.");
        mass = inputOutput.InputIntegerArray();
        dimension = mass.length;
        for (int i = 1; i < dimension; i = i + 2) {
            mass[i] = 0;
        }
        System.out.println("Your result array:");
        inputOutput.OutputIntegerArray(mass);
    }

    public void TestEx() {
        int x, y;
        int[][] matrix;
        x = inputOutput.InputIntegerNumber();
        y = inputOutput.InputIntegerNumber();
        matrix = inputOutput.InputIntegerMatrix(x, y);
        inputOutput.OutputIntegerMatrix(matrix, x, y);
    }

    public void SecondExFirst() {
        int x, y;
        int[][] matrix;
        System.out.print("Enter an amount of lines. ");
        x = inputOutput.InputIntegerNumber();
        System.out.print("Enter an amount of columns. ");
        y = inputOutput.InputIntegerNumber();
        matrix = inputOutput.InputIntegerMatrix(x, y);
        int top, low;
        for (int j = 0; j < y; j = j + 2) {
            top = matrix[0][j];
            low = matrix[x - 1][j];
            if (top > low) {
                System.out.print("Column (ind) " + j + " (number) " + (j + 1) + " : ");
                for (int k = 0; k < x; k++) {
                    System.out.print(matrix[k][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("End of Exercise.\n");
    }

    public void SecondExSecond() {
        int x, y;
        int[][] matrix;
        boolean flag;
        do {
            System.out.println("Enter a square matrix.");
            System.out.print("Enter an amount of lines. ");
            x = inputOutput.InputIntegerNumber();
            System.out.print("Enter an amount of columns. ");
            y = inputOutput.InputIntegerNumber();
            flag = true;
            if (x != y || x <= 0) {
                flag = false;
                System.out.println("Incorrect dimensions of matrix. Try again.");
            }
        } while (flag == false);
        matrix = inputOutput.InputIntegerMatrix(x, y);
        System.out.println("Your matrix:");
        inputOutput.OutputIntegerMatrix(matrix, x, y);
        System.out.print("Main diagonal of the matrix: ");
        for (int i = 0, j = 0; i < x; i++, j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
        System.out.print("Side diagonal of the matrix: ");
        for (int i = 0, j = y - 1; i < x; i++, j--) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
        System.out.println("End of Exercise.\n");
    }

    public void SecondExThird() {
        int x, y, lineNum, colNum;
        int[][] matrix;
        System.out.println("Enter a matrix.");
        System.out.print("Enter an amount of lines. ");
        x = inputOutput.InputIntegerNumber();
        System.out.print("Enter an amount of columns. ");
        y = inputOutput.InputIntegerNumber();
        matrix = inputOutput.InputIntegerMatrix(x, y);
        System.out.println("Your matrix:");
        inputOutput.OutputIntegerMatrix(matrix, x, y);
        boolean flag;
        do {
            System.out.print("Enter index of output line: ");
            lineNum = inputOutput.InputIntegerNumber();
            flag = true;
            if (lineNum < 0 || lineNum >= x) {
                flag = false;
                System.out.println("Incorrect index. Try again.");
            }
        } while (flag == false);
        do {
            System.out.print("Enter index of output column: ");
            colNum = inputOutput.InputIntegerNumber();
            flag = true;
            if (colNum < 0 || colNum >= y) {
                flag = false;
                System.out.println("Incorrect index. Try again.");
            }
        } while (flag == false);
        System.out.println("Line with your index:");
        for (int i = 0; i < y; i++) {
            System.out.print(matrix[lineNum][i] + " ");
        }
        System.out.println("\nColumn with your index:");
        for (int i = 0; i < x; i++) {
            System.out.println(matrix[i][colNum]);
        }
        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExFourth() {
        int n;
        boolean flag;
        do {
            flag = true;
            System.out.print("Enter a dimension of matrix 'n': ");
            n = inputOutput.InputIntegerNumber();
            if (n < 4) {
                flag = false;
                System.out.println("Incorrect index. Try again.");
            }
        } while (flag == false);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = j + 1;
                }
            } else {
                for (int j = n - 1, k = 1; j >= 0; j--, k++) {
                    matrix[i][j] = k;
                }
            }
        }
        System.out.println("Your matrix:");
        inputOutput.OutputIntegerMatrix(matrix, n, n);
        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExFifth() {
        int n;
        boolean flag;
        do {
            flag = true;
            System.out.print("Enter a dimension of matrix 'n': ");
            n = inputOutput.InputIntegerNumber();
            if (n < 4) {
                flag = false;
                System.out.println("Incorrect index. Try again.");
            }
        } while (flag == false);
        int[][] matrix = new int[n][n];
        int coefficient = n;
        for (int i = 0; i < n; i++) {
            int coef = coefficient;
            for (int j = 0; j < n; j++) {
                if (coef > 0) {
                    matrix[i][j] = i + 1;
                    coef--;
                } else {
                    matrix[i][j] = 0;
                }
            }
            coefficient--;
        }
        System.out.println("Your matrix:");
        inputOutput.OutputIntegerMatrix(matrix, n, n);
        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExSixth() {
        int n;
        boolean flag;
        do {
            flag = true;
            System.out.print("Enter an even dimension of matrix 'n': ");
            n = inputOutput.InputIntegerNumber();
            if (n < 4 || n % 2 != 0) {
                flag = false;
                System.out.println("Incorrect index. Try again.");
            }
        } while (flag == false);
        int[][] matrix = new int[n][n];
        int nulCoef = 0;
        int oneCoef = n;
        for (int i = 0; i < n / 2; i++) {
            int nul = nulCoef;
            int one = oneCoef;
            for (int j = 0; j < n; j++) {
                if (nul > 0) {
                    matrix[i][j] = 0;
                    nul--;
                } else if (one > 0) {
                    matrix[i][j] = 1;
                    one--;
                } else {
                    matrix[i][j] = 0;
                }
            }
            nulCoef++;
            oneCoef = oneCoef - 2;
        }
        for (int i = n - 1, j = 0; i >= n / 2; i--, j++) {
            matrix[i] = matrix[j];
        }
        System.out.println("Your matrix:");
        inputOutput.OutputIntegerMatrix(matrix, n, n);
        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExSeventh() {
        int n;
        boolean flag;
        do {
            flag = true;
            System.out.print("Enter a dimension of matrix 'n': ");
            n = inputOutput.InputIntegerNumber();
            if (n < 1) {
                flag = false;
                System.out.println("Incorrect index. Try again.");
            }
        } while (flag == false);
        double[][] matrix = new double[n][n];
        double buf, a, b;
        int amount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a = Math.pow(i, 2);
                b = Math.pow(j, 2);
                buf = (a - b) / n;
                matrix[i][j] = Math.sin(buf);
                if (matrix[i][j] > 0) amount++;
            }
        }
        System.out.println("Your matrix:");
        inputOutput.OutputDoubleMatrix(matrix, n, n);
        System.out.println("Amount of positive elements: " + amount);
        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExEighth() {
        int[][] matrix = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Your matrix:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        int[] buf = new int[7];
        boolean flag;
        int firstInd, secondInd;
        do {
            flag = true;
            System.out.print("Enter an index of first column. ");
            firstInd = inputOutput.InputIntegerNumber();
            System.out.print("Enter an index of second column. ");
            secondInd = inputOutput.InputIntegerNumber();
            if (firstInd < 0 || secondInd < 0 || firstInd == secondInd || firstInd > 6 || secondInd > 6) {
                flag = false;
                System.out.println("Incorrect index. Try again.");
            }
        } while (flag == false);
        buf = matrix[firstInd];
        matrix[firstInd] = matrix[secondInd];
        matrix[secondInd] = buf;
        System.out.println("Matrix after change:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExNinth() {
        double[][] matrix = new double[7][7];
        double[] buf = new double[7];
        double maxSum = 0;
        int maxSumInd = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                matrix[i][j] = (Math.random() * 100);
                matrix[i][j] = Math.ceil(matrix[i][j] * 1000) / 1000;
                buf[i] = buf[i] + matrix[i][j];
                buf[i] = Math.ceil(buf[i] * 1000) / 1000;
                if (buf[i] > maxSum) {
                    maxSum = buf[i];
                    maxSumInd = i;
                }
            }
        }
        System.out.println("Your matrix:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            if (i == maxSumInd) System.out.print("Max sum! ");
            System.out.println("Sum of elements in " + (i + 1) + " column = " + buf[i]);
        }
        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExTenth() {
        int n;
        boolean flag;
        int[][] matrix;
        do {
            flag = true;
            System.out.print("Enter a dimension of square integer matrix. ");
            n = inputOutput.InputIntegerNumber();
            if (n < 1) {
                flag = false;
                System.out.println("Incorrect index. Try again.");
            }
        } while (flag == false);
        matrix = inputOutput.InputIntegerMatrix(n, n);
        System.out.println("Your matrix:");
        inputOutput.OutputIntegerMatrix(matrix, n, n);
        System.out.print("Positive elements of main diagonal: ");
        int CX = 0;
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            } else {
                CX++;
            }
        }
        if (CX == n) System.out.print((char) 13 + "Main diagonal doesn't contain positive elements.");
        System.out.println("\n\nEnd of Exercise.\n");
    }

    public void SecondExEleventh() {
        int[][] matrix = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
            }
        }
        System.out.println("Your matrix:");
        int CX = 0;
        int[] amount = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] == 5) {
                    CX++;
                }
            }
            amount[i] = CX;
            CX = 0;
            System.out.println();
        }
        CX = 0;
        System.out.print("Numbers of required strings: ");
        for (int i = 0; i < 10; i++) {
            if (amount[i] >= 3) {
                System.out.print((i + 1) + " ");
                CX++;
            }
        }
        if (CX == 0) System.out.print((char) 13 + "No required strings in this matrix.");
        System.out.println("\n\nEnd of Exercise.\n");
    }

    public void SecondExTwelfth() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Random matrix before sort:");
        inputOutput.OutputIntegerMatrix(matrix, 10, 10);
        /*int buf;
        for(int str = 0; str < 10; str++){
            for(int i = 9; i > 0; i--){
                for(int j = 0; j < i; j++){
                    if(matrix[str][j] > matrix[str][j+1]){
                        buf = matrix[str][j+1];
                        matrix[str][j+1] = matrix[str][j];
                        matrix[str][j] = buf;
                    }
                }
            }
        }
        System.out.println("\nMatrix after ascending sort:");
        inputOutput.OutputIntegerMatrix(matrix,10,10);*/

        for (int str = 0; str < 10; str++) {
            matrix[str] = inputOutput.SortIntegerArrayAscending(matrix[str]);
        }
        System.out.println("\nMatrix after ascending sort:");
        inputOutput.OutputIntegerMatrix(matrix, 10, 10);

        for (int str = 0; str < 10; str++) {
            matrix[str] = inputOutput.SortIntegerArrayDescending(matrix[str]);
        }
        System.out.println("\nMatrix after descending sort:");
        inputOutput.OutputIntegerMatrix(matrix, 10, 10);

        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExThirteenth() {
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Random matrix before sort:");
        inputOutput.OutputIntegerMatrix(matrix, 10, 10);

        int[] bufStr = new int[10];
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                bufStr[i] = matrix[i][j];
            }
            bufStr = inputOutput.SortIntegerArrayAscending(bufStr);
            for (int i = 0; i < 10; i++) {
                matrix[i][j] = bufStr[i];
            }
        }
        System.out.println("\nMatrix after ascending sort:");
        inputOutput.OutputIntegerMatrix(matrix, 10, 10);

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                bufStr[i] = matrix[i][j];
            }
            bufStr = inputOutput.SortIntegerArrayDescending(bufStr);
            for (int i = 0; i < 10; i++) {
                matrix[i][j] = bufStr[i];
            }
        }
        System.out.println("\nMatrix after descending sort:");
        inputOutput.OutputIntegerMatrix(matrix, 10, 10);

        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExFourteen() {
        int strAmount, colAmount;
        do {
            colAmount = (int) (Math.random() * 21);
            strAmount = colAmount + (int) (Math.random() * 9);
        } while (colAmount == 0);
        int[][] matrix = new int[strAmount][colAmount];
        int CX;
        for (int j = 0; j < colAmount; j++) {
            CX = j + 1;
            for (int i = 0; i < strAmount; i++) {
                if (CX > 0) {
                    matrix[i][j] = 1;
                    CX--;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("\nMatrix:");
        inputOutput.OutputIntegerMatrix(matrix, strAmount, colAmount);
        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExFifteen() {
        int n;
        do {
            n = (int) (Math.random() * 26);
        } while (n == 0);
        int[][] matrix = new int[n][n];
        int maxNum = 0;
        System.out.println("\nMatrix before exchange: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 99);
                if (matrix[i][j] > maxNum) maxNum = matrix[i][j];

                if (matrix[i][j] / 10 == 0) {
                    System.out.print(matrix[i][j] + "   ");
                } else {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
            System.out.println();
        }
        System.out.println("\nMatrix after exchange: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 1) matrix[i][j] = maxNum;
                if (matrix[i][j] / 10 == 0) {
                    System.out.print(matrix[i][j] + "   ");
                } else {
                    System.out.print(matrix[i][j] + "  ");
                }
            }
            System.out.println();
        }
        System.out.println("\nEnd of Exercise.\n");
    }

    public void SecondExSixteen() {
        int dimension;
        boolean flag = true;
        System.out.println("You can choose anyone magic square with dimension multiple of 4.");
        do {
            flag = true;
            System.out.print("Enter your dimension: ");
            dimension = inputOutput.InputIntegerNumber();
            if (dimension % 4 != 0 || dimension <= 0) {
                System.out.print("Incorrect number. Try again. ");
                flag = false;
            }
        } while (flag == false);
        int maskMatrixDimension = dimension + 2;
        boolean[][] maskMatrix = new boolean[maskMatrixDimension][maskMatrixDimension];
        int xCount = 3, yCount = 3;
        for (int i = 0; i < maskMatrixDimension; i++) {
            if (yCount > 1) {
                xCount = 3;
            } else {
                xCount = 1;
            }
            for (int j = 0; j < maskMatrixDimension; j++) {
                if (xCount > 1) {
                    maskMatrix[i][j] = true;
                } else {
                    maskMatrix[i][j] = false;
                }
                if (xCount == 0) {
                    xCount = 3;
                } else {
                    xCount--;
                }
            }
            if (yCount == 0) {
                yCount = 3;
            } else {
                yCount--;
            }
        }
        System.out.println("Mask matrix:");
        for (int i = 0; i < maskMatrixDimension; i++) {
            for (int j = 0; j < maskMatrixDimension; j++) {
                System.out.print(maskMatrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] magicMatrix = new int[dimension][dimension];
        int numStart = 1, numEnd = dimension * dimension;
        for (int magicI = 0, maskI = 1; magicI < dimension; magicI++, maskI++) {
            for (int magicJ = 0, maskJ = 1; magicJ < dimension; magicJ++, maskJ++, numStart++, numEnd--) {
                if (maskMatrix[maskI][maskJ] == false) {
                    magicMatrix[magicI][magicJ] = numStart;
                } else {
                    magicMatrix[magicI][magicJ] = numEnd;
                }
            }
        }
        System.out.println("Your magic square:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (magicMatrix[i][j] / 1000 != 0) {
                    System.out.print(magicMatrix[i][j] + " ");
                } else if (magicMatrix[i][j] / 100 != 0) {
                    System.out.print(magicMatrix[i][j] + "  ");
                } else if (magicMatrix[i][j] / 10 != 0) {
                    System.out.print(magicMatrix[i][j] + "   ");
                } else {
                    System.out.print(magicMatrix[i][j] + "    ");
                }
            }
            System.out.println();
        }
        System.out.println("\nEnd of Exercise.\n");
    }

    public void ThirdExFirst() {
        int dimensionFirst, dimensionSecond, k;
        dimensionFirst = (int) (Math.random() * 5 + 2);
        dimensionSecond = (int) (Math.random() * 5 + 2);
        k = (int) (Math.random() * (dimensionFirst - 1));
        int[] firstMass = new int[dimensionFirst];
        int[] secondMass = new int[dimensionSecond];
        for (int i = 0; i < dimensionFirst; i++) {
            firstMass[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < dimensionSecond; i++) {
            secondMass[i] = (int) (Math.random() * 10);
        }
        System.out.println("First array: ");
        inputOutput.OutputIntegerArray(firstMass);
        System.out.println("\nSecond array: ");
        inputOutput.OutputIntegerArray(secondMass);
        System.out.println("\nNumber k: " + k + "\n");
        int[] finalMass = new int[dimensionFirst + dimensionSecond];
        for (int i = 0, count = 0; i < finalMass.length; i++, count++) {
            finalMass[i] = firstMass[count];
            if (i == k) {
                i++;
                for (int j = 0; j < dimensionSecond; j++, i++) {
                    finalMass[i] = secondMass[j];
                }
                i--;
            }
        }
        System.out.println("Final array: ");
        inputOutput.OutputIntegerArray(finalMass);
        System.out.println("\nEnd of Exercise.\n");
    }

    public void ThirdExSecond() {
        int arrayFirstDimension, arraySecondDimension;
        arrayFirstDimension = (int) (Math.random() * 18 + 2);
        arraySecondDimension = (int) (Math.random() * 18 + 2);
        int[] arrayFirst = new int[arrayFirstDimension];
        int[] arraySecond = new int[arraySecondDimension];
        int[] arrayFinal = new int[arrayFirstDimension + arraySecondDimension];
        for (int i = 0; i < arrayFirstDimension; i++) {
            arrayFirst[i] = (int) (Math.random() * 101);
        }
        for (int i = 0; i < arraySecondDimension; i++) {
            arraySecond[i] = (int) (Math.random() * 101);
        }
        arrayFirst = inputOutput.SortIntegerArrayAscending(arrayFirst);
        arraySecond = inputOutput.SortIntegerArrayAscending(arraySecond);
        int count = 0;
        for (int i = 0; i < arrayFirstDimension; i++, count++) {
            arrayFinal[count] = arrayFirst[i];
        }
        for (int j = 0; j < arraySecondDimension; j++, count++) {
            arrayFinal[count] = arraySecond[j];
        }
        arrayFinal = inputOutput.SortIntegerArrayAscending(arrayFinal);
        System.out.println("First array:");
        inputOutput.OutputIntegerArray(arrayFirst);
        System.out.println("\nSecond array:");
        inputOutput.OutputIntegerArray(arraySecond);
        System.out.println("\nFinal array:");
        inputOutput.OutputIntegerArray(arrayFinal);
        System.out.println("\nEnd of Exercise.\n");
    }

    public void ThirdExThird() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array before sort:");
        inputOutput.OutputIntegerArray(array);
        for (int i = 0; i < array.length; i++) {
            int positionMaxElem = i;
            int maxElem = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > maxElem) {
                    positionMaxElem = j;
                    maxElem = array[j];
                }
            }
            array[positionMaxElem] = array[i];
            array[i] = maxElem;
        }
        System.out.println("\nArray after sort:");
        inputOutput.OutputIntegerArray(array);
        System.out.println("\nEnd of Exercise.\n");
    }

    public void ThirdExFourth() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array before sort:");
        inputOutput.OutputIntegerArray(array);
        int buf;
        int counterOfRep = 0;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    buf = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = buf;
                    counterOfRep++;
                }
            }
            System.out.print("\nNumber of replacements in this cycle: " + counterOfRep + ". Array in this moment: ");
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k] + " ");
            }
            counterOfRep = 0;
        }
        System.out.println("\n\nArray after sort:");
        inputOutput.OutputIntegerArray(array);
        System.out.println("\nEnd of Exercise.\n");
    }

    public void ThirdExFifth() {
        int[] array = {4,10,8,6,2,1,3,9,5,8,4,4};
        System.out.println("Array before sort:");
        inputOutput.OutputIntegerArray(array);
        int minPos, maxPos, num, midPos, resPos, buf;
        System.out.println("Begin");
        for (int indMain = 1; indMain < array.length; indMain++) {
            int valueMain = array[indMain];
            minPos = 0;
            maxPos = indMain - 1;
            num = valueMain;//не обязательное действие, добавлено для лучшей читаемости кода
            System.out.println("Element: " + num +".");
            resPos = inputOutput.BinarySearchForIntegerSort(array,num,minPos,maxPos);
            for (int i = resPos; i <= indMain; i++) { // цикл вставки valueMain-элемента на результирующую позицию и сдвига следующих за ним элементов
                buf = array[i];
                array[i] = num;
                num = buf;
            }
            System.out.println("Array after shift:");
            inputOutput.OutputIntegerArray(array);
            System.out.println();
        }
        System.out.println("Array after sort: ");
        inputOutput.OutputIntegerArray(array);
        System.out.println("\nEnd of Exercise.\n");
    }
    public void ThirdExSeventh() {
        int dimenMain, dimenSide;
        dimenMain = (int)(Math.random() * 5 + 4);
        dimenSide = (int)(Math.random() * 5 + 4);
        double[] sequenceMain = new double[dimenMain];
        double[] sequenceSide = new double[dimenSide];
        for (int i = 0; i < dimenMain; i++) {
                sequenceMain[i] = (Math.random() * 1000);
                sequenceMain[i] = Math.ceil(sequenceMain[i] * 1000) / 1000;
        }
        for (int i = 0; i < dimenSide; i++) {
            sequenceSide[i] = (Math.random() * 1000);
            sequenceSide[i] = Math.ceil(sequenceSide[i] * 1000) / 1000;
        }
        System.out.println("Main sequence:");
        sequenceMain = inputOutput.SortDoubleArrayAscending(sequenceMain);
        inputOutput.OutputDoubleArray(sequenceMain);
        System.out.println("Side sequence:");
        sequenceSide = inputOutput.SortDoubleArrayAscending(sequenceSide);
        inputOutput.OutputDoubleArray(sequenceSide);
        int resDimension = dimenMain+dimenSide;
        double[] resSequence = new double[resDimension];
        for(int i = 0; i < dimenMain + dimenSide; i++){
            if(i < dimenMain) {
                resSequence[i] = sequenceMain[i];
            }else{
                resSequence[i] = sequenceSide[i-dimenMain];
            }
        }
        double sideElem,buf;
        int minPos,maxPos,resPos;
        for(int indexSide = dimenMain; indexSide < resDimension; indexSide++){
            sideElem = resSequence[indexSide];
            minPos = 0;
            maxPos = indexSide - 1;
            resPos = inputOutput.BinarySearchForDoubleSort(resSequence,sideElem,minPos,maxPos);
            if(resSequence[resPos] == sideElem){
                System.out.println("We need to insert element: " + sideElem + " after element: " + resSequence[resPos - 1]);
            }else{
                System.out.println("We need to insert element: " + sideElem + " between element: " + resSequence[resPos - 1] + " and element: " + resSequence[resPos]);
            }
            for (int i = resPos; i <= indexSide; i++) { // цикл вставки valueMain-элемента на результирующую позицию и сдвига следующих за ним элементов
                buf = resSequence[i];
                resSequence[i] = sideElem;
                sideElem = buf;
            }
            System.out.print("Result sequence after insert step: ");
            for(int i = 0; i <= indexSide; i++){
                System.out.print(resSequence[i]+" ");
            }
            System.out.println();
        }
        System.out.println("\nEnd of Exercise.\n");
    }
}