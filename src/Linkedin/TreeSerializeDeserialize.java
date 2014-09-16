package Linkedin;

import java.io.BufferedInputStream;
import java.io.OutputStream;

import javax.xml.soap.Node;

import LeetCode.TreeNode;

public class TreeSerializeDeserialize {

	public static void main(String[] args) {

		TreeSerializeDeserialize t = new TreeSerializeDeserialize();

		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);

		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node5;
		node3.right = node6;
		node6.left = node7;
		node6.right = node8;
		System.out.println(t.serialize(node1));

		TreeNode result = t.deserialize("1 2 4 # # # 3 5 # # 6 7 # # 8 # #");
		System.out.println("");
	}

	public String serialize(TreeNode node) {
		if (node == null)
			return "#";
		String curr = "" + node.val;
		String left = serialize(node.left);
		String right = serialize(node.right);
		return curr + " " + left + " " + right;
	}

	public TreeNode deserialize(String string) {
		String[] array = string.split(" ");
		index = 0;
		return deserialize(array);
	}

	public int index = 0;

	public TreeNode deserialize(String[] stringArray) {
		if (stringArray[index].equals("#")) {
			index++;
			return null;
		}
		int value = Integer.parseInt(stringArray[index]);
		index++;
		TreeNode node = new TreeNode(value);
		node.left = deserialize(stringArray);
		node.right = deserialize(stringArray);
		return node;
	}

	/**
	 * ************************************************************
	 * ************************************************************
	 * ************************************************************
	 * ************************************************************
	 * ************************************************************
	 */
//	public static void serialize( OutputStream out, TreeNode node )
//	{
//	    if( node == null )
//	    {
//	        out.write( "()" );
//	    }
//	    else
//	    {
//	        out.write( "(" );
//	        out.write( node + "" );
//	        // recursive call
//	        serialize( out, node.left );
//	        serialize( out, node.right );
//	        out.write( ")" );
//	    }
//	}
	
	
//	public static TreeNode deSerialize( BufferedInputStream reader ) throw IOException
//	{
//	    char c = ( char ) reader.read( );
//	    if( c == '(' )
//	    {
//	        c = ( char ) reader.read( );
//	        // there is no data, since the node is null
//	        if( c == ')' )
//	        {
//	            return null;
//	        }
//	        StringBuffer sb = new StringBuffer( );
//	        while(  c != ')' )
//	        {
//	            sb.append( c );
//	            c = ( char ) reader.read( );
//	        }
//
//	        Node newNode = new Node( sb.toString() );
//	        if( c == '( ' )
//	        {
//	            reader.reset( );
//	            newNode.left = deSerialize( reader );
//	            newNode.right = deSerialize( reader );
//	        }
//	    }
//	    return newNode;
//	}
}
