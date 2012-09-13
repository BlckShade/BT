package BT_pack;
import java.math.*;
import java.util.*;
public class BinaryTree {
	public BinaryTree left;
	public BinaryTree right;
	public double value;
	public BinaryTree(double value)
	{
		this.value=value;
	}
	
	public void insert(BinaryTree root_pos, double value)
	{
		if (value<root_pos.value)
		{
			if(root_pos.left!=null)
			{
				insert(root_pos.left, value);
			}
			else
			{
				System.out.println("Inserted " + value + " to left of node " + root_pos.value);
				root_pos.left=new BinaryTree(value);
			}
		}
		else if (value>root_pos.value)
		{
			if(root_pos.right!=null)
			{
				insert(root_pos.right, value);
			}
			else
			{
				System.out.println("Inserted " + value + " to right of node " + root_pos.value);
				root_pos.right=new BinaryTree(value);
			}
		}
	}
	public void BinaryTreeRun(BinaryTree b_tree,long count_v)
	{
		for(long i=0;i<count_v;i++)
		{
			insert(b_tree, Math.random());
		}
		
	}
	
}