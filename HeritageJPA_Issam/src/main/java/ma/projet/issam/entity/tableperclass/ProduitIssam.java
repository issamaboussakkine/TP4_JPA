package ma.projet.issam.entity.tableperclass;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class ProduitIssam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idIssam;

    private String nomIssam;
    private Double prixIssam;
    private String descriptionIssam;
    private LocalDateTime dateCreationIssam;

    public ProduitIssam() {
        this.dateCreationIssam = LocalDateTime.now();
    }

    public ProduitIssam(String nomIssam, Double prixIssam, String descriptionIssam) {
        this.nomIssam = nomIssam;
        this.prixIssam = prixIssam;
        this.descriptionIssam = descriptionIssam;
        this.dateCreationIssam = LocalDateTime.now();
    }

    public Long getIdIssam() { return idIssam; }
    public void setIdIssam(Long idIssam) { this.idIssam = idIssam; }

    public String getNomIssam() { return nomIssam; }
    public void setNomIssam(String nomIssam) { this.nomIssam = nomIssam; }

    public Double getPrixIssam() { return prixIssam; }
    public void setPrixIssam(Double prixIssam) { this.prixIssam = prixIssam; }

    public String getDescriptionIssam() { return descriptionIssam; }
    public void setDescriptionIssam(String descriptionIssam) { this.descriptionIssam = descriptionIssam; }

    public LocalDateTime getDateCreationIssam() { return dateCreationIssam; }
    public void setDateCreationIssam(LocalDateTime dateCreationIssam) { this.dateCreationIssam = dateCreationIssam; }
}