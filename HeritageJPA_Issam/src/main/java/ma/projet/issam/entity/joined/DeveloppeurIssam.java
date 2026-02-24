package ma.projet.issam.entity.joined;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "developpeurs_issam")
public class DeveloppeurIssam extends EmployeIssam {

    private String langageIssam;
    private String specialiteIssam;
    private Integer anneeExperienceIssam;

    public DeveloppeurIssam() {}

    public DeveloppeurIssam(String nomIssam, String prenomIssam, String emailIssam, LocalDate dateEmbaucheIssam,
                            String langageIssam, String specialiteIssam, Integer anneeExperienceIssam) {
        super(nomIssam, prenomIssam, emailIssam, dateEmbaucheIssam);
        this.langageIssam = langageIssam;
        this.specialiteIssam = specialiteIssam;
        this.anneeExperienceIssam = anneeExperienceIssam;
    }

    public String getLangageIssam() { return langageIssam; }
    public void setLangageIssam(String langageIssam) { this.langageIssam = langageIssam; }

    public String getSpecialiteIssam() { return specialiteIssam; }
    public void setSpecialiteIssam(String specialiteIssam) { this.specialiteIssam = specialiteIssam; }

    public Integer getAnneeExperienceIssam() { return anneeExperienceIssam; }
    public void setAnneeExperienceIssam(Integer anneeExperienceIssam) { this.anneeExperienceIssam = anneeExperienceIssam; }
}