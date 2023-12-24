package projectSystem;

import java.util.Comparator;


public class PagesComparator implements Comparator<ResearchPaper> {
   
	@Override
	public int compare(ResearchPaper a, ResearchPaper b) {
		
		return Integer.compare(a.getPages(), b.getPages());
	}

}
