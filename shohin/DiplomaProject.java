package Student;

import java.util.ArrayList;
import java.util.List;

public class DiplomaProject {

    private List<ResearchPaper> listOfPublishedResearchPapers;

    public DiplomaProject() {
        this.listOfPublishedResearchPapers = new ArrayList<>();
    }

    public List<ResearchPaper> getListOfPublishedResearchPapers() {
        return this.listOfPublishedResearchPapers;
    }

    public void setListOfPublishedResearchPapers(List<ResearchPaper> listOfPublishedResearchPapers) {
        this.listOfPublishedResearchPapers = listOfPublishedResearchPapers;
    }

    public void addResearchPaper(ResearchPaper researchPaper) {
        if (researchPaper != null) {
            listOfPublishedResearchPapers.add(researchPaper);
        }
    }

    public void removeResearchPaper(ResearchPaper researchPaper) {
        listOfPublishedResearchPapers.remove(researchPaper);
    }

    public boolean hasPublishedPapers() {
        return !listOfPublishedResearchPapers.isEmpty();
    }

    public int getNumberOfPublishedPapers() {
        return listOfPublishedResearchPapers.size();
    }
}
