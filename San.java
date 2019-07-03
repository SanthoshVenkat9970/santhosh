
public class San{ 

	 static int N= 111; 


	static int max(String str, int n)
	{ 
        int count[] = new int[N]; 
		for (int i = 0; i < n; i++)
		{ 
			count[str.charAt(i)]++; 
		} 

		int m = 0; 
		for (int i = 0; i < N; i++) 
		{ 
			if (count[i] != 0) 
			{ 
				m++; 
			} 
		} 

		return m; 
	} 

	static int maxChar(String str)
	{ 

		int n = str.length();	 
		int m = max(str, n); 
		int min = n;
		for (int i = 0; i < n; i++)
		{ 
			for (int j = 0; j < n; j++)
			{ 
				
				String subs = null; 
				if(i<j) 
					subs = str.substring(i, j); 
				else
					subs = str.substring(j, i); 
				int h = subs.length(); 
				int p = max(subs, h); 
				if (h < min && m ==p)
				{ 
					min = h; 
				} 
			} 
		} 
		return min; 
	} 

	
	static public void main(String[] args)
	{
		String str = "abcda"; 

		int len = maxChar(str); 
		System.out.println(" The length of the maximum distinct characters : "+len); 
	} 
} 

 
