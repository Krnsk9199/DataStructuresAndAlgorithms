package ArraysAndArrayList;

import  java.util.*;
import java.io.*;
public class SetMatrixZeroes {

    public static void setZeros( int matrix[][]){

        int m = matrix.length;
        int n = matrix[0].length;
        boolean row[] = new boolean [m];
        boolean column[] = new boolean [n];

        for(int i =0; i<m; i++){
            for(int j = 0 ; j<n; j++){

                if(matrix[i][j]==0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        for(int i =0; i<m; i++){
            for(int j = 0 ; j<n; j++){

                if(row[i]==true || column[j]==true){
                    matrix[i][j] = 0;
                }

            }
        }



    }
    public static void setZeros1(int matrix[][]) {


        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();
        for(int i =0; i<matrix.length; i++){
            for(int j = 0 ; j<matrix[i].length; j++){

                if(matrix[i][j]==0){
                    rows.add(i);
                    columns.add(j);
                }
            }
        }

        for(int i : rows){
            for(int j = 0; j<matrix[i].length ; j++) {
                matrix[i][j] = 0;
            }
        }

        for(int i : columns){
            for(int j = 0; j<matrix.length ; j++) {
                matrix[j][i] = 0;
            }
        }

    }
}
