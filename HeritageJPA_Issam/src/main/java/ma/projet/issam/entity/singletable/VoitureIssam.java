package ma.projet.issam.entity.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("VOITURE_ISSAM")
public class VoitureIssam extends VehiculeIssam {

    private Integer nombrePortesIssam;
    private Boolean climatisationIssam;
    private String typeCarburantIssam;

    public VoitureIssam() {}

    public VoitureIssam(String marqueIssam, String modeleIssam, LocalDate anneeFabricationIssam, Double prixIssam,
                        Integer nombrePortesIssam, Boolean climatisationIssam, String typeCarburantIssam) {
        super(marqueIssam, modeleIssam, anneeFabricationIssam, prixIssam);
        this.nombrePortesIssam = nombrePortesIssam;
        this.climatisationIssam = climatisationIssam;
        this.typeCarburantIssam = typeCarburantIssam;
    }

    public Integer getNombrePortesIssam() { return nombrePortesIssam; }
    public void setNombrePortesIssam(Integer nombrePortesIssam) { this.nombrePortesIssam = nombrePortesIssam; }

    public Boolean getClimatisationIssam() { return climatisationIssam; }
    public void setClimatisationIssam(Boolean climatisationIssam) { this.climatisationIssam = climatisationIssam; }

    public String getTypeCarburantIssam() { return typeCarburantIssam; }
    public void setTypeCarburantIssam(String typeCarburantIssam) { this.typeCarburantIssam = typeCarburantIssam; }
}