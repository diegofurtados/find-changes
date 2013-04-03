package br.ufmg.domain;

import java.util.HashMap;
import java.util.Map;

public class Revisions {
	private Map<String, Metrics> metrics;

	public Metrics getMetrics(String revisionDateStr) {
		return this.metrics != null ? this.metrics.get(revisionDateStr) : null;
	}

	public void putMetrics(String revisionDateStr, Metrics metrics) {
		if (this.metrics == null) {
			this.metrics = new HashMap<String, Metrics>();
		}
		this.metrics.put(revisionDateStr, metrics);
	}

}
