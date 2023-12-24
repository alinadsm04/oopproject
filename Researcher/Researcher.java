package projectSystem;

public interface Researcher {
	
	int calculateHIndex();
	ResearchPaper printPapers();
	boolean joinResearchProject();
	ResearchProject doReseacrhProject();
	ResearchPaper writeResearchPaper();
}
