package LeetCode;

import java.util.Stack;

public class SimplifyPath {

	public static void main(String[] args) {
		
		SimplifyPath s = new SimplifyPath();
		s.simplifyPath("/a/./b/../../c/");
	}
	
	public String simplifyPath(String path) {
		String[] paths = path.split("/");
        Stack<String> stack = new Stack<String>();
        for(int i=0; i<paths.length; i++){
            if(paths[i].equals(".") || paths[i].equals("")) continue;
            else if(paths[i].equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            }
            else stack.push(paths[i]);
        }
        String result = "";
        if(stack.isEmpty()) return "/";
        while(!stack.isEmpty()){
            result = "/" + stack.pop() + result;
        }
        return result;
    }

}
