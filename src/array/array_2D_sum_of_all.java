package array;

public class array_2D_sum_of_all {
    public static void main(String[] args) {
        int[][] arra={
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        int sum=0;

        for(int i=0;i< arra.length;i++){
            for(int j=0;j<arra[i].length;j++){
                sum=sum+arra[i][j];
            }
        }
        System.out.println(sum);

    }
}
