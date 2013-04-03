package br.ufmg.main;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import br.ufmg.domain.Metrics;
import br.ufmg.domain.util.MetricsUtils;

public class FindChanges {

	public static void main(String[] args) {
		List<Metrics> metrics = new ArrayList<Metrics>();
		List<Metrics> candidates = new ArrayList<Metrics>();

		File path = new File("../../../");
		File[] files = path != null && path.isDirectory() ? path.listFiles() : new File[0];

		for (int i = 0; i < files.length; i++) {
			File file = files[i];
			if (file.getName().endsWith(".csv")) {
				metrics.add(MetricsUtils.getMetricsFromFile(file));
			}
		}

		System.out.println(metrics);
	}
}
