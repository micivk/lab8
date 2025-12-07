import java.util.Random;

public class Matrix {
    // Attributes are private to prevent inconsistent state (e.g. changing rows without resizing the data array)
    private int rows;
    private int cols;
    private double[][] data;

    //Constructor (initializes array size)
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
        fillWithRandomValues();
    }

    public void fillWithRandomValues(){
        Random random = new Random();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                this.data[i][j] = Math.round(random.nextDouble() * 100.0) / 10.0;
            }
        }
    }

    //Getters and setters
    public int getRows() {
        return rows;
    }
    public int getCols() {
        return cols;
    }

    public double getValue(int r, int c){
        return data[r][c];
    }

    public void setValue(int r, int c, double value){
        data[r][c] = value;
    }




    // Time Complexity: O(N * M) - iterating through all elements once.
    public void print(){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }


    }
    // Time Complexity: O(N * M) - we visit each element exactly once to swap indices.
    public Matrix transpose(){
        Matrix transposed =  new Matrix(rows, cols);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transposed.setValue(j, i, data[i][j]);
            }
        }
        return transposed;
    }

    // Time Complexity: O(N * M) - every element is visited exactly once.
    public void printSpiral(){
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        System.out.print("Spiral Order:");
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                System.out.print(data[top][i] + " ");
            }
            top++;

            for(int i = top; i <= bottom; i++){
                System.out.print(data[i][right] + " ");
            }
            right--;


            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(data[bottom][i] + " ");
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(data[i][left] + " ");
                }
                left++;
            }

        }
        System.out.println();
    }
    // Time Complexity: O(N * M * P)
    public Matrix multiply(Matrix other){

        if (this.cols != other.getRows()) {
            System.out.println("Multiplication not possible: dimension mismatch.");
            return null;
        }

        Matrix result = new Matrix(this.rows, other.getCols());

        for(int i=0; i<result.rows; i++)
            for(int j=0; j<result.cols; j++)
                result.setValue(i, j, 0);


        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.getCols(); j++) {
                for (int k = 0; k < this.cols; k++) {
                    double currentVal = result.getValue(i, j);
                    result.setValue(i, j, currentVal + this.data[i][k] * other.getValue(k, j));
                }
            }
        }
        return result;
    }

}
