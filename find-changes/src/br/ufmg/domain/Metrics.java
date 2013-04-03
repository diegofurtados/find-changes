package br.ufmg.domain;

import java.util.Date;
import java.util.Map;

public class Metrics {
	private Date revisionDate;
	Map<String, MetricClasses> classMetrics;

	public Date getRevisionDate() {
		return revisionDate;
	}

	public void setRevisionDate(Date revisionDate) {
		this.revisionDate = revisionDate;
	}

	public Map<String, MetricClasses> getClassMetrics() {
		return classMetrics;
	}

	public void setClassMetrics(Map<String, MetricClasses> classMetrics) {
		this.classMetrics = classMetrics;
	}
	
	@Override
	public String toString() {
		return this.revisionDate != null ? this.revisionDate.toString() : null;
	}
}
