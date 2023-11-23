import java.util.*;

class WordSearch{
	public static void main(String[] args){
		
	char board [][]= {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
	String words []= {"oath","pea","eat","rain"};
	
	int f=0;
	for(int k=0;k<words.length;k++)
	{
		f=0;
	for(int i=0;i<board.length;i++)
	{
		for(int j=0;j<board[0].length;j++)
		{
			if(wordSearch(board,words[k],i,j,0))
			{
				System.out.println(words[k]);
				f=1;
				break;
			}
		}
		if(f==1)
		{
			break;
		}
	}
	}
	}
	
	public static boolean wordSearch(char board[][],String s,int i,int j,int index)
	{
		if(index==s.length())
		{
			//System.out.println(s);
			return true;
		}
		if(i<0 || i>=board.length || j<0 || j>=board[0].length || s.charAt(index)!=board[i][j])
		{
			return false;
		}
		
		char temp=board[i][j];
		board[i][j]=' ';
		
		boolean found= wordSearch(board,s,i+1,j,index+1)||
						wordSearch(board,s,i-1,j,index+1)||
						wordSearch(board,s,i,j+1,index+1)||
						wordSearch(board,s,i,j-1,index+1) ;
						
		board[i][j]=temp;
		return found;
			
			
		}
	}





