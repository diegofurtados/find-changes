package br.ufmg.domain;

public class ClassMetrics {
	private String entityName;
	private String superEntityName;
	private int fanIn;
	private int fanOut;
	private int numberOfAttributes;
	private int numberOfAttributesInherited;
	private int numberOfLinesOfCode;
	private int numberOfMethods;
	private int numberOfMethodsInherited;
	private int numberOfPrivateAttributes;
	private int numberOfPrivateMethods;
	private int numberOfprivateAttributes;
	private int numberOfprivateMethods;
	private int weightedMethodCount;
	private int hierarchyNestingLevel;
	private int numberOfChildren;
	private int lackOfCohesionInMethods;
	private int couplingBetweenClasses;
	private int responseForClass;

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getSuperEntityName() {
		return superEntityName;
	}

	public void setSuperEntityName(String superEntityName) {
		this.superEntityName = superEntityName;
	}

	public int getFanIn() {
		return fanIn;
	}

	public void setFanIn(int fanIn) {
		this.fanIn = fanIn;
	}

	public int getFanOut() {
		return fanOut;
	}

	public void setFanOut(int fanOut) {
		this.fanOut = fanOut;
	}

	public int getNumberOfAttributes() {
		return numberOfAttributes;
	}

	public void setNumberOfAttributes(int numberOfAttributes) {
		this.numberOfAttributes = numberOfAttributes;
	}

	public int getNumberOfAttributesInherited() {
		return numberOfAttributesInherited;
	}

	public void setNumberOfAttributesInherited(int numberOfAttributesInherited) {
		this.numberOfAttributesInherited = numberOfAttributesInherited;
	}

	public int getNumberOfLinesOfCode() {
		return numberOfLinesOfCode;
	}

	public void setNumberOfLinesOfCode(int numberOfLinesOfCode) {
		this.numberOfLinesOfCode = numberOfLinesOfCode;
	}

	public int getNumberOfMethods() {
		return numberOfMethods;
	}

	public void setNumberOfMethods(int numberOfMethods) {
		this.numberOfMethods = numberOfMethods;
	}

	public int getNumberOfMethodsInherited() {
		return numberOfMethodsInherited;
	}

	public void setNumberOfMethodsInherited(int numberOfMethodsInherited) {
		this.numberOfMethodsInherited = numberOfMethodsInherited;
	}

	public int getNumberOfPrivateAttributes() {
		return numberOfPrivateAttributes;
	}

	public void setNumberOfPrivateAttributes(int numberOfPrivateAttributes) {
		this.numberOfPrivateAttributes = numberOfPrivateAttributes;
	}

	public int getNumberOfPrivateMethods() {
		return numberOfPrivateMethods;
	}

	public void setNumberOfPrivateMethods(int numberOfPrivateMethods) {
		this.numberOfPrivateMethods = numberOfPrivateMethods;
	}

	public int getNumberOfprivateAttributes() {
		return numberOfprivateAttributes;
	}

	public void setNumberOfprivateAttributes(int numberOfprivateAttributes) {
		this.numberOfprivateAttributes = numberOfprivateAttributes;
	}

	public int getNumberOfprivateMethods() {
		return numberOfprivateMethods;
	}

	public void setNumberOfprivateMethods(int numberOfprivateMethods) {
		this.numberOfprivateMethods = numberOfprivateMethods;
	}

	public int getWeightedMethodCount() {
		return weightedMethodCount;
	}

	public void setWeightedMethodCount(int weightedMethodCount) {
		this.weightedMethodCount = weightedMethodCount;
	}

	public int getHierarchyNestingLevel() {
		return hierarchyNestingLevel;
	}

	public void setHierarchyNestingLevel(int hierarchyNestingLevel) {
		this.hierarchyNestingLevel = hierarchyNestingLevel;
	}

	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	public int getLackOfCohesionInMethods() {
		return lackOfCohesionInMethods;
	}

	public void setLackOfCohesionInMethods(int lackOfCohesionInMethods) {
		this.lackOfCohesionInMethods = lackOfCohesionInMethods;
	}

	public int getCouplingBetweenClasses() {
		return couplingBetweenClasses;
	}

	public void setCouplingBetweenClasses(int couplingBetweenClasses) {
		this.couplingBetweenClasses = couplingBetweenClasses;
	}

	public int getResponseForClass() {
		return responseForClass;
	}

	public void setResponseForClass(int responseForClass) {
		this.responseForClass = responseForClass;
	}

}
