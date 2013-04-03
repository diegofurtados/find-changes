package br.ufmg.service;

import java.io.File;
import java.util.Scanner;

import br.ufmg.domain.Entities;
import br.ufmg.domain.Metrics;
import br.ufmg.domain.MetricsPosition;
import br.ufmg.domain.Revisions;

public class EntitiesWrapper {
	private Entities entities = new Entities();

	private Metrics getMetricsClassesFromLine(String line) {
		Metrics metrics = new Metrics();

		if (line != null && !line.isEmpty()) {
			String[] metricValues = line.split(",");
			if (metricValues != null && metricValues.length == MetricsPosition.metricsTotalValue) {
				metrics.entityName = metricValues[MetricsPosition.entityName];
				metrics.superEntityName = metricValues[MetricsPosition.superEntityName];
				metrics.fanIn = Integer.parseInt(metricValues[MetricsPosition.fanIn]);
				metrics.fanOut = Integer.parseInt(metricValues[MetricsPosition.fanOut]);
				metrics.numberOfAttributes = Integer.parseInt(metricValues[MetricsPosition.numberOfAttributes]);
				metrics.numberOfAttributesInherited = Integer.parseInt(metricValues[MetricsPosition.numberOfAttributesInherited]);
				metrics.numberOfLinesOfCode = Integer.parseInt(metricValues[MetricsPosition.numberOfLinesOfCode]);
				metrics.numberOfMethods = Integer.parseInt(metricValues[MetricsPosition.numberOfMethods]);
				metrics.numberOfMethodsInherited = Integer.parseInt(metricValues[MetricsPosition.numberOfMethodsInherited]);
				metrics.numberOfPrivateAttributes = Integer.parseInt(metricValues[MetricsPosition.numberOfPrivateAttributes]);
				metrics.numberOfPrivateMethods = Integer.parseInt(metricValues[MetricsPosition.numberOfPrivateMethods]);
				metrics.numberOfPublicAttributes = Integer.parseInt(metricValues[MetricsPosition.numberOfPublicAttributes]);
				metrics.numberOfPublicMethods = Integer.parseInt(metricValues[MetricsPosition.numberOfPublicMethods]);
				metrics.weightedMethodCount = Integer.parseInt(metricValues[MetricsPosition.weightedMethodCount]);
				metrics.hierarchyNestingLevel = Integer.parseInt(metricValues[MetricsPosition.hierarchyNestingLevel]);
				metrics.numberOfChildren = Integer.parseInt(metricValues[MetricsPosition.numberOfChildren]);
				metrics.lackOfCohesionInMethods = Integer.parseInt(metricValues[MetricsPosition.lackOfCohesionInMethods]);
				metrics.couplingBetweenClasses = Integer.parseInt(metricValues[MetricsPosition.couplingBetweenClasses]);
				metrics.responseForClass = Integer.parseInt(metricValues[MetricsPosition.responseForClass]);
			} else {
				throw new RuntimeException("Invalid number of metrics : " + metricValues.length + "\n" + line);
			}
		}

		return metrics;
	}

	private void setRevision(String revisionDateStr, Metrics metrics) {
		Revisions revisions = this.entities.getRevisions(metrics.entityName);
		if (revisions == null) {
			revisions = new Revisions();
		}
		revisions.putMetrics(revisionDateStr, metrics);
		this.entities.putRevisions(metrics.entityName, revisions);
	}

	public void setMetricsFromFile(File file) {
		Scanner scanner;
		String fileName = file.getName().replace(".csv", "");
		try {	scanner = new Scanner(file);
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				Metrics metrics = this.getMetricsClassesFromLine(scanner.nextLine());
				this.setRevision(fileName, metrics);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Entities getEntities() {
		return this.entities;
	}

}
