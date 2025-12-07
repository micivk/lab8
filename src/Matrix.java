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


    public void fillWithRandomValues(){

    }


    public void print(){

    }

    public Matrix transpose(){
        return null;
    }


    public void printSpiral(){

    }

    public Matrix multiply(Matrix other){
        return null;
    }








}
