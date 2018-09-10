import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n = 423, p= 0;

        while(n != 0) {
            int r = n % 10;
            p = p * 10 + r;
            n /= 10;
        }

        System.out.println(p);
	}
}
