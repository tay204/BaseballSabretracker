package baseball;

import java.util.Scanner;
import java.io.*;
public class TextFileIO
{
	/**
	 * Class to handle the writing and reading from text file
	 * @author yeotaJMU
	 */

	//write to the file
	public static PrintWriter createTextWrite(String S)
	{
		PrintWriter TStream = null;
		try
		{
			TStream = new PrintWriter(new FileOutputStream(S));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error opening the file in createTextWrite");
			System.exit(0);
		}
		return TStream;
	}

	//read from the file
	public static Scanner createTextRead(String S)
	{
		Scanner textFile = null;
		try
		{
			textFile = new Scanner(new File(S));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.out.println("or could not be opened.");
		}
		return textFile;
	}



}

