package projectSystem;

import java.util.Arrays;
import java.util.List;

public class DecoratorResearcher extends ResearcherDecorator {
	List<ResearchPaper> rpapers;


	public DecoratorResearcher(Researcher r) {
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
	//здесь считаем х индекс
	//здесь принтуем проект 

	@Override
	public boolean joinResearchProject() {
		
		return false;
	}

	@Override
	public ResearchProject doReseacrhProject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResearchPaper writeResearchPaper() {
		// TODO Auto-generated method stub
		return null;
	}

}
