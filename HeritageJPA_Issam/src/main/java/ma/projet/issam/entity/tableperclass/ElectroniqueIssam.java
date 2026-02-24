package ma.projet.issam.entity.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "electroniques_issam")
public class ElectroniqueIssam extends ProduitIssam {

    private String marqueIssam;
    private String modeleIssam;
    private Integer garantieMoisIssam;
    private String caracteristiquesIssam;

    public ElectroniqueIssam() {}

    public ElectroniqueIssam(String nomIssam, Double prixIssam, String descriptionIssam,
                             String marqueIssam, String modeleIssam, Integer garantieMoisIssam, String caracteristiquesIssam) {
        super(nomIssam, prixIssam, descriptionIssam);
        this.marqueIssam = marqueIssam;
        this.modeleIssam = modeleIssam;
        this.garantieMoisIssam = garantieMoisIssam;
        this.caracteristiquesIssam = caracteristiquesIssam;
    }

    public String getMarqueIssam() { return marqueIssam; }
    public void setMarqueIssam(String marqueIssam) { this.marqueIssam = marqueIssam; }

    public String getModeleIssam() { return modeleIssam; }
    public void setModeleIssam(String modeleIssam) { this.modeleIssam = modeleIssam; }

    public Integer getGarantieMoisIssam() { return garantieMoisIssam; }
    public void setGarantieMoisIssam(Integer garantieMoisIssam) { this.garantieMoisIssam = garantieMoisIssam; }

    public String getCaracteristiquesIssam() { return caracteristiquesIssam; }
    public void setCaracteristiquesIssam(String caracteristiquesIssam) { this.caracteristiquesIssam = caracteristiquesIssam; }
}