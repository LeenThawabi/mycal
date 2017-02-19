

public class model {

	

	

	public int operations(int n1, int n2, String op){

		     if (op.equals("+"))

			return n1 + n2;

		else if (op.equals("-"))

			return n1 - n2;

		else if (op.equals("*"))

			return n1 * n2;

		else if (op.equals("/"))

			return n1 / n2;

	

		else

			return 0;
	}
	}
