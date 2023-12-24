package projectSystem;

public abstract class ResearcherDecorator implements Researcher{
	protected final Researcher decoratedResearcher;
	
	public ResearcherDecorator(Researcher r) {
		this.decoratedResearcher = r;
	}
	
	public int calculateHIndex() {
		return decoratedResearcher.calculateHIndex();
	}
	
	public ResearchPaper printPapers() {
		return decoratedResearcher.printPapers();
	}
	
	public boolean joinResearchProject() {
		return decoratedResearcher.joinResearchProject();
	}
	
	public ResearchProject doResearchProject() {
		return decoratedResearcher.doReseacrhProject();
	}
	
	public ResearchPaper writeResearchPaper() {
		return decoratedResearcher.writeResearchPaper();
	}

}
