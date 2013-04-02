package br.ufmg.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import br.ufmg.domain.MetricClasses;
import br.ufmg.domain.util.MetricsUtils;

public class FindChanges {

	public static void main(String[] args) {
		Scanner scanner;
		try {
			scanner = new Scanner(new File("../../../2005-01-01.csv"));
			scanner.nextLine();
			while(scanner.hasNextLine()){
				MetricClasses classes = MetricsUtils.getMetricsClassesFromLine(scanner.nextLine());
				System.out.println(classes);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
