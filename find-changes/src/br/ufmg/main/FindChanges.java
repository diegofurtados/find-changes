package br.ufmg.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindChanges {

	public static void main(String[] args) {
		Scanner scanner;
		try {
			scanner = new Scanner(new File("../../metrics/2005-01-01.csv"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
