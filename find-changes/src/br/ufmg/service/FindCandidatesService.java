package br.ufmg.service;

import java.util.ArrayList;
import java.util.List;

import br.ufmg.domain.Candidates;
import br.ufmg.domain.Metrics;

public class FindCandidatesService {
	private List<Metrics> metrics;

	public FindCandidatesService(List<Metrics> metrics) {
		this.metrics = new ArrayList<Metrics>();
	}

	public List<Candidates> findCandidates() {
		List<Candidates> candidates = new ArrayList<Candidates>();
		Integer foundPosition;
		for (int i = 0; i < this.metrics.size(); i++){
			foundPosition = this.compareMetrics(metrics.get(i), i);
			if (foundPosition != null){
				
			}
			
		}
		
		return candidates;
	}

	private Integer compareMetrics(Metrics metric, int index) {
		
		return null;
	}
}
