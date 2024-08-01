import java.util.*;



public class Main {
	public static void main(String[] args) {
		int[][] mat1=new int[2][3];
		int[][] mat2=new int[2][3];
		int[][] result=new int[2][3];
		Scanner s=new Scanner(System.in);
		System.out.print("enter element for mat1");
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				mat1[i][j]=s.nextInt();
					
				}}
				
	   	System.out.print("enter element for mat2");
	   	
			
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				mat2[i][j]=s.nextInt();
					
				}}	
				
	   
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				result[i][j]=mat1[i][j]+mat2[i][j];
				}
	    
		}

			System.out.print("addition of two matrices are");
			
			
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
					System.out.print(result[i][j]+" ");
					
				}
				System.out.println();}
	}
}