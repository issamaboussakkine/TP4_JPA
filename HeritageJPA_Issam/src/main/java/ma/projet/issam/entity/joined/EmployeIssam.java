package ma.projet.issam.entity.joined;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employes_issam")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class EmployeIssam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIssam;

    private String nomIssam;
    private String prenomIssam;
    private String emailIssam;
    private LocalDate dateEmbaucheIssam;

    public EmployeIssam() {}

    public EmployeIssam(String nomIssam, String prenomIssam, String emailIssam, LocalDate dateEmbaucheIssam) {
        this.nomIssam = nomIssam;
        this.prenomIssam = prenomIssam;
        this.emailIssam = emailIssam;
        this.dateEmbaucheIssam = dateEmbaucheIssam;
    }

    public Long getIdIssam() { return idIssam; }
    public void setIdIssam(Long idIssam) { this.idIssam = idIssam; }

    public String getNomIssam() { return nomIssam; }
    public void setNomIssam(String nomIssam) { this.nomIssam = nomIssam; }

    public String getPrenomIssam() { return prenomIssam; }
    public void setPrenomIssam(String prenomIssam) { this.prenomIssam = prenomIssam; }

    public String getEmailIssam() { return emailIssam; }
    public void setEmailIssam(String emailIssam) { this.emailIssam = emailIssam; }

    public LocalDate getDateEmbaucheIssam() { return dateEmbaucheIssam; }
    public void setDateEmbaucheIssam(LocalDate dateEmbaucheIssam) { this.dateEmbaucheIssam = dateEmbaucheIssam; }
}