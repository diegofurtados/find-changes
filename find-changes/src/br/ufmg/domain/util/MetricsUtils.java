package br.ufmg.domain.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.ufmg.domain.MetricClasses;
import br.ufmg.domain.Metrics;
import br.ufmg.domain.MetricsPosition;

public class MetricsUtils {
	private static MetricClasses getMetricsClassesFromLine(String line) {
		MetricClasses metricClasses = new MetricClasses();

		if (line != null && !line.isEmpty()) {
			String[] metricValues = line.split(",");
			if (metricValues != null && metricValues.length == MetricsPosition.metricsTotalValue) {
				metricClasses.setEntityName(metricValues[MetricsPosition.entityName]);
				metricClasses.setSuperEntityName(metricValues[MetricsPosition.superEntityName]);
				metricClasses.setFanIn(Integer.parseInt(metricValues[MetricsPosition.fanIn]));
				metricClasses.setFanOut(Integer.parseInt(metricValues[MetricsPosition.fanOut]));
				metricClasses.setNumberOfAttributes(Integer.parseInt(metricValues[MetricsPosition.numberOfAttributes]));
				metricClasses.setNumberOfAttributesInherited(Integer.parseInt(metricValues[MetricsPosition.numberOfAttributesInherited]));
				metricClasses.setNumberOfLinesOfCode(Integer.parseInt(metricValues[MetricsPosition.numberOfLinesOfCode]));
				metricClasses.setNumberOfMethods(Integer.parseInt(metricValues[MetricsPosition.numberOfMethods]));
				metricClasses.setNumberOfMethodsInherited(Integer.parseInt(metricValues[MetricsPosition.numberOfMethodsInherited]));
				metricClasses.setNumberOfPrivateAttributes(Integer.parseInt(metricValues[MetricsPosition.numberOfPrivateAttributes]));
				metricClasses.setNumberOfPrivateMethods(Integer.parseInt(metricValues[MetricsPosition.numberOfPrivateMethods]));
				metricClasses.setNumberOfPublicAttributes(Integer.parseInt(metricValues[MetricsPosition.numberOfPublicAttributes]));
				metricClasses.setNumberOfPublicMethods(Integer.parseInt(metricValues[MetricsPosition.numberOfPublicMethods]));
				metricClasses.setWeightedMethodCount(Integer.parseInt(metricValues[MetricsPosition.weightedMethodCount]));
				metricClasses.setHierarchyNestingLevel(Integer.parseInt(metricValues[MetricsPosition.hierarchyNestingLevel]));
				metricClasses.setNumberOfChildren(Integer.parseInt(metricValues[MetricsPosition.numberOfChildren]));
				metricClasses.setLackOfCohesionInMethods(Integer.parseInt(metricValues[MetricsPosition.lackOfCohesionInMethods]));
				metricClasses.setCouplingBetweenClasses(Integer.parseInt(metricValues[MetricsPosition.couplingBetweenClasses]));
				metricClasses.setResponseForClass(Integer.parseInt(metricValues[MetricsPosition.responseForClass]));
			} else {
				throw new RuntimeException("Invalid number of metrics : " + metricValues.length + "\n" + line);
			}
		}

		return metricClasses;
	}

	public static Metrics getMetricsFromFile(File file){
		Metrics metrics = new Metrics();
		Map<String, MetricClasses> classMetrics = new HashMap<String, MetricClasses>();
		Scanner scanner;
		String fileName = file.getName().replace(".csv", "");
		try {
			scanner = new Scanner(file);
			scanner.nextLine();
			while(scanner.hasNextLine()){
				MetricClasses classes = MetricsUtils.getMetricsClassesFromLine(scanner.nextLine());
				classMetrics.put(fileName, classes);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		metrics.setClassMetrics(classMetrics);
		try {
			metrics.setRevisionDate(format.parse(fileName));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return metrics;
		
	}
	
}
