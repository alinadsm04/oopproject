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
	
	public boolean joinResearchProject() throws FalseInstructorException {
		return decoratedResearcher.joinResearchProject();
	}
	
	public String doResearchProject() {
		return decoratedResearcher.doReseacrhProject();
	}
	
	public String writeResearchPaper() {
		return decoratedResearcher.writeResearchPaper();
	}

}
