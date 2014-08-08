package LeetCode;

import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		
		SimplifyPath s = new SimplifyPath();
		s.simplifyPath("/a/./b/../../c/");
	}
	
	public String simplifyPath(String path) {
		String result = "";
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<String>();
        
        for(int i=0; i<paths.length; i++){
        	if(paths[i].equals(".")) continue;
        	if(paths[i].trim().equals("")) continue;
        	if(paths[i].equals("..")){
        		if(!stack.isEmpty())
        			stack.pop();
        	}
        	else stack.push(paths[i]);
        }
        
        if(stack.isEmpty()) return "/";
        while(!stack.isEmpty()){
        	result = "/" + stack.pop() + result;
        }
        return result;
    }

}
