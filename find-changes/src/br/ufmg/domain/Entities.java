package br.ufmg.domain;

import java.util.HashMap;
import java.util.Map;

public class Entities {
	private Map<String, Revisions> revisions;
	
	public Revisions getRevisions(String fileName) {
		return this.revisions != null ? this.revisions.get(fileName) : null;
	}

	public void putRevisions(String entityName, Revisions revisions) {
		if (this.revisions == null){
			this.revisions = new HashMap<String, Revisions>();
		}
		this.revisions.put(entityName, revisions);
	}
}
