public class matrix_multiplication_trace {
    @SuppressWarnings("StringConcatenationInsideStringBufferAppend")
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2];


        for (int i = 0; i < 2; i++) {          
            for (int j = 0; j < 2; j++) {      
                System.out.print("計算位置 c[" + i + "][" + j + "]：");
                StringBuilder step = new StringBuilder();
                StringBuilder detail = new StringBuilder();
                for (int k = 0; k < 2; k++) {  
                    int mul = a[i][k] * b[k][j];
                    c[i][j] += mul;

                    step.append(a[i][k] + "*" + b[k][j]);
                    detail.append(mul);
                    if (k < 1) {
                        step.append(" + ");
                        detail.append(" + ");
                    }
                }
                System.out.println(step + " = " + detail + " = " + c[i][j]);
            }
        }

        
        System.out.println("結果矩陣：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}