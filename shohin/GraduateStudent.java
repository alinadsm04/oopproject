import java.util.Comparator;
import java.util.List;

public class GraduateStudent extends Student {

    private Researcher researchSupervisor;
    private List<ResearchPaper> publishedPapers;

    public GraduateStudent(String id, String name, int age, String degreeLevel, Researcher researchSupervisor) {
        super(id, name, age, degreeLevel);
        this.researchSupervisor = researchSupervisor;
        this.publishedPapers = null;
    }

    public Researcher getResearchSupervisor() {
        return this.researchSupervisor;
    }

    public void setResearchSupervisor(Researcher researchSupervisor) {
        this.researchSupervisor = researchSupervisor;
    }

    public int calculateHIndex() {
        if (publishedPapers == null || publishedPapers.isEmpty()) {
            return 0; 
        }


        publishedPapers.sort(Comparator.comparingInt(ResearchPaper::getCitations).reversed());

        int hIndex = 0;


        for (int i = 0; i < publishedPapers.size(); i++) {
            int citations = publishedPapers.get(i).getCitations();
            if (citations >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }

        return hIndex;
    }

    public void printResearchPapers(Comparator<ResearchPaper> comparator) {
        if (publishedPapers != null && !publishedPapers.isEmpty()) {

            publishedPapers.sort(comparator);


            for (ResearchPaper paper : publishedPapers) {
                System.out.println(paper);
            }
        } else {
            System.out.println("No research papers available.");
        }
    }

    public void joinResearchProject(ResearchProject project) throws ProjectJoinException {
        if (project == null) {
            throw new IllegalArgumentException("Project cannot be null.");
        }

        if (researchSupervisor != null && !this.equals(researchSupervisor)) {
            project.addParticipant(this);
        } else {
            throw new ProjectJoinException("Only researchers can join a research project.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Research Supervisor: " + (researchSupervisor != null ? researchSupervisor.getName() : "None");
    }
}
