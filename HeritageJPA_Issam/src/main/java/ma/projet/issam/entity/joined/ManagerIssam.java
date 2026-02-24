package ma.projet.issam.entity.joined;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "managers_issam")
public class ManagerIssam extends EmployeIssam {

    private String serviceIssam;
    private Integer nombreSubordonnesIssam;
    private Double bonusIssam;

    public ManagerIssam() {}

    public ManagerIssam(String nomIssam, String prenomIssam, String emailIssam, LocalDate dateEmbaucheIssam,
                        String serviceIssam, Integer nombreSubordonnesIssam, Double bonusIssam) {
        super(nomIssam, prenomIssam, emailIssam, dateEmbaucheIssam);
        this.serviceIssam = serviceIssam;
        this.nombreSubordonnesIssam = nombreSubordonnesIssam;
        this.bonusIssam = bonusIssam;
    }

    public String getServiceIssam() { return serviceIssam; }
    public void setServiceIssam(String serviceIssam) { this.serviceIssam = serviceIssam; }

    public Integer getNombreSubordonnesIssam() { return nombreSubordonnesIssam; }
    public void setNombreSubordonnesIssam(Integer nombreSubordonnesIssam) { this.nombreSubordonnesIssam = nombreSubordonnesIssam; }

    public Double getBonusIssam() { return bonusIssam; }
    public void setBonusIssam(Double bonusIssam) { this.bonusIssam = bonusIssam; }
}