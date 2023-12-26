package projectSystem;

import java.util.Arrays;
import java.util.List;

public class DecoratorResearcherRealization extends ResearcherDecorator {
	List<ResearchPaper> rpapers;
	ResearchProject project;
	


	public DecoratorResearcherRealization(Researcher r) {
		super(r);
	}
	
	
	@Override
	public int calculateHIndex() {
		for(ResearchPaper p : rpapers) {
			Arrays.sort(p.getCitations());
			for(int i = 0; i < p.getCitations().length; i++) {
				int result = p.getCitations().length - i;
				
				
				if(result <=p.getCitations()[i]) {
					return result;
				}
				
			}
	
		}
		return 0;	
	}
	 

	@Override
	public boolean joinResearchProject() throws FalseInstructorException{
		if(this.calculateHIndex()>3)
			System.out.println("Вы присоединилсь к проекту!");
		    return true;
		
	}

	@Override
	public String doReseacrhProject() {
		return project.toString();
	}

	@Override
	public String writeResearchPaper() {
		return rpapers.toString();
	}

}
