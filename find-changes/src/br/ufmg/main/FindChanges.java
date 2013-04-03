package br.ufmg.main;

import java.io.File;

import br.ufmg.service.EntitiesWrapper;

public class FindChanges {

	public static void main(String[] args) {
		File path = new File("../../../comet");
		File[] appFolders = path != null && path.isDirectory() ? path.listFiles() : new File[0];

		for (int i = 0; i < appFolders.length; i++) {
			File appDir = appFolders[i];
			if (appDir.isDirectory()) {
				EntitiesWrapper wrapper = new EntitiesWrapper();
				System.out.println(appDir.getName());
				File[] cvsFiles = appDir.listFiles()[1].listFiles();
				for (int j = 0; j < cvsFiles.length; j++) {
					File cvsFile = cvsFiles[j];
					if (cvsFile.getName().endsWith(".csv")) {
						wrapper.setMetricsFromFile(cvsFile);
					}
				}
				System.out.println(wrapper.getEntities());
			}
		}
	}
}
