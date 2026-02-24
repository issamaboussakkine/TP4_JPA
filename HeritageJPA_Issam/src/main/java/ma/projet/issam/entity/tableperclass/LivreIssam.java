package ma.projet.issam.entity.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "livres_issam")
public class LivreIssam extends ProduitIssam {

    private String auteurIssam;
    private String isbnIssam;
    private Integer nombrePagesIssam;
    private String editeurIssam;

    public LivreIssam() {}

    public LivreIssam(String nomIssam, Double prixIssam, String descriptionIssam,
                      String auteurIssam, String isbnIssam, Integer nombrePagesIssam, String editeurIssam) {
        super(nomIssam, prixIssam, descriptionIssam);
        this.auteurIssam = auteurIssam;
        this.isbnIssam = isbnIssam;
        this.nombrePagesIssam = nombrePagesIssam;
        this.editeurIssam = editeurIssam;
    }

    public String getAuteurIssam() { return auteurIssam; }
    public void setAuteurIssam(String auteurIssam) { this.auteurIssam = auteurIssam; }

    public String getIsbnIssam() { return isbnIssam; }
    public void setIsbnIssam(String isbnIssam) { this.isbnIssam = isbnIssam; }

    public Integer getNombrePagesIssam() { return nombrePagesIssam; }
    public void setNombrePagesIssam(Integer nombrePagesIssam) { this.nombrePagesIssam = nombrePagesIssam; }

    public String getEditeurIssam() { return editeurIssam; }
    public void setEditeurIssam(String editeurIssam) { this.editeurIssam = editeurIssam; }
}