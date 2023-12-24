package projectSystem;

import java.util.Comparator;

public class DateByComparator implements Comparator<ResearchPaper>{
	
	@Override
	public int compare(ResearchPaper a, ResearchPaper b) {
		return a.getDateOfConference().compareTo(b.getDateOfConference());
	}
	

}
