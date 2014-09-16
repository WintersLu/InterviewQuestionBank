package LeetCode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class CloneGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        
        queue.add(node);
        UndirectedGraphNode result = new UndirectedGraphNode(node.label);
        map.put(node, result);
        
        while(!queue.isEmpty()){
            UndirectedGraphNode curr = queue.poll();
            
            for(UndirectedGraphNode n: curr.neighbors){
                if(!map.containsKey(n)){
                    UndirectedGraphNode newNode = new UndirectedGraphNode(n.label);
                    map.put(n, newNode);
                    map.get(curr).neighbors.add(newNode);
                    queue.add(n);
                }
                else {
                    map.get(curr).neighbors.add(map.get(n));
                }
            }
        }
        return result;
    }

}
