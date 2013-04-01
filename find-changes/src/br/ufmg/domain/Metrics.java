package br.ufmg.domain;

import java.util.Date;
import java.util.Map;

public class Metrics {
	private Date revisionDate;
	Map<String, ClassMetrics> classMetrics;

	public Date getRevisionDate() {
		return revisionDate;
	}

	public void setRevisionDate(Date revisionDate) {
		this.revisionDate = revisionDate;
	}
}
