import java.util.*;

class AttendanceCheck{
	public static void main(String[] args){
		
		int n=3;
	int st=1200;
	int et=1245;
	// int st = 1200;
	// int et = 1260;
	
	int sid2[][]={{1200,1215},{1220,1245}};
	int sid1[][]={{1200,1244}};
	
	
	// int sid2[][] = {{1200, 1225}, {1256, 1260}};
	// int sid1[][] = {{1200, 1256}};
	// int sid3[][] = {{1200, 1260}};
	
	List<int[][]>ls=Arrays.asList(sid2,sid1);
	
	int totalTimeGap=0;
	int maxTimeDiff=0;
	
	for(int[][] arr: ls){
		
		int cg=arr[0][0];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<2;j++)
			{
				if(j==0)
				{
					cg=arr[i][j]-cg;
				}else
				{
					cg+=arr[i][j];
				}
			}
		}
		if(cg>et){
			totalTimeGap+=cg-et;
			maxTimeDiff=Math.max(maxTimeDiff,cg-et);
		}
		else{
			totalTimeGap+=et-cg;
			maxTimeDiff=Math.max(maxTimeDiff,cg-et);
		}
		
		System.out.println(maxTimeDiff+"/"+totalTimeGap);
	}
		
		
		
		
		
	}



}
