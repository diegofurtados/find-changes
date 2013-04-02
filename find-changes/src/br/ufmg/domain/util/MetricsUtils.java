package br.ufmg.domain.util;

import br.ufmg.domain.MetricClasses;
import br.ufmg.domain.MetricsPosition;

public class MetricsUtils {
	public static MetricClasses getMetricsClassesFromLine(String line) {
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
}
