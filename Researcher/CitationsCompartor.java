package projectSystem;

import java.util.Comparator;


public class CitationsCompartor implements Comparator<ResearchPaper>{

	public int compare(ResearchPaper a, ResearchPaper b) {
		int[] firstCitations = a.getCitations();
		int[] secondCitations = b.getCitations();
		
		for (int i = 0; i < Math.min(firstCitations.length, secondCitations.length); i++) {
            int comparisonResult = Integer.compare(firstCitations[i], secondCitations[i]);
            if (comparisonResult != 0) {
                return comparisonResult;
            }
        }
		
	return Integer.compare(firstCitations.length, secondCitations.length);
	
}
}
