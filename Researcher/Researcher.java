package projectSystem;

public interface Researcher {
	
	int calculateHIndex();
	ResearchPaper printPapers();
	boolean joinResearchProject() throws FalseInstructorException;
	String doReseacrhProject();
	String writeResearchPaper();
	
}
