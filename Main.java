package BT_pack;
import java.math.*;
import java.lang.*;
public class Main {
	public static long t=0;
	public static void main(String[]args)
	{
		long count;
		count=Math.round(Math.random()*100+25);
		BinaryTree main_derevo = new BinaryTree(0.5);
		main_derevo.BinaryTreeRun(main_derevo, count);
		System.out.println("OGROMNIY VOLOSATIY RAZDELITEL");
		walk(main_derevo);
		System.out.println(t);
	}
	public static void walk(BinaryTree handler)
	{
		if (handler!=null)
		{
			walk(handler.left);
			t++;
			walk(handler.right);
		}

	}

}
