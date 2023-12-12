package teamproject;

import java.util.Comparator;

public class CitationsCompartor implements Comparator<ResearchPaper>{

	public int compare(teamproject.ResearchPaper a, teamproject.ResearchPaper b) {
		return a.getCitations().compareTo(b.getCitations());
	}
	
}
