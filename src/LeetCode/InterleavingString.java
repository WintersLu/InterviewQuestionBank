package LeetCode;

public class InterleavingString {

	public static void main(String[] args) {
		InterleavingString i = new InterleavingString();
		i.isInterleave("aabcc", "dbbca", "aadbbbaccc");
	}
	
	
	public boolean isInterleave(String s1, String s2, String s3) {
		if(s3.length() != s1.length() + s2.length()) return false;
        boolean[][] map = new boolean[s1.length()+1][s2.length()+1];
        
        
        for(int i=0; i<s1.length()+1; i++){
        	for(int j=0; j<s2.length()+1; j++){
        		if(i==0 && j==0){
        			map[0][0] = true;
        			continue;
        		}
        		
        		char cur = s3.charAt(i+j-1);
        		if(j==0 && s1.charAt(i-1) == cur) map[i][j] = true;
        		else if(i==0 && s2.charAt(j-1) == cur) map[i][j] = true;
        		else if( (i>0 && s1.charAt(i-1) == cur && map[i-1][j]) ||
        				(j>0 && s2.charAt(j-1) == cur && map[i][j-1])){
        			map[i][j] = true;
        		}
        	}
        }
        return map[s1.length()][s2.length()];
        
    }

}
