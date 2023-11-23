import java.util.Scanner;

class Test1{
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		int a[][]={{1,2,3,4,5},

			{16,17,18,19,6},

			{ 15 , 24 , 25 , 20 , 7 },

			{ 14 , 23  ,22, 21 , 8 },

			{ 13 , 12 , 11 , 10 , 9 }};
		
		
		fun(a,1,0,0,a.length-1,a.length-1);
	}
	
	public static void fun(int matrix[][],int start,int left ,int top,int bottom, int right)
	{
		if (top > bottom || left > right) {
            return;
        }
		for (int i = left; i <= right; i++) {
            matrix[top][i] = start;
            System.out.print(start++ + " ");
        }
        top++;
		
		 for (int i = top; i <= bottom; i++) {
            matrix[i][right] = start;
            System.out.print(start++ + " ");
        }
        right--;
		
		 if (top <= bottom) {
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = start;
                System.out.print(start++ + " ");
            }
            bottom--;
        }
		
		if (left <= right) {
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = start;
                System.out.print(start++ + " ");
            }
            left++;
        }
		
		
		fun(matrix,start,left,top,bottom,right);
		
		
	}




}