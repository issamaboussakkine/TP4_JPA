package ma.projet.issam.entity.singletable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vehicules_issam")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_vehicule_issam", discriminatorType = DiscriminatorType.STRING)
public abstract class VehiculeIssam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIssam;

    private String marqueIssam;
    private String modeleIssam;
    private LocalDate anneeFabricationIssam;
    private Double prixIssam;

    public VehiculeIssam() {}

    public VehiculeIssam(String marqueIssam, String modeleIssam, LocalDate anneeFabricationIssam, Double prixIssam) {
        this.marqueIssam = marqueIssam;
        this.modeleIssam = modeleIssam;
        this.anneeFabricationIssam = anneeFabricationIssam;
        this.prixIssam = prixIssam;
    }

    public Long getIdIssam() { return idIssam; }
    public void setIdIssam(Long idIssam) { this.idIssam = idIssam; }

    public String getMarqueIssam() { return marqueIssam; }
    public void setMarqueIssam(String marqueIssam) { this.marqueIssam = marqueIssam; }

    public String getModeleIssam() { return modeleIssam; }
    public void setModeleIssam(String modeleIssam) { this.modeleIssam = modeleIssam; }

    public LocalDate getAnneeFabricationIssam() { return anneeFabricationIssam; }
    public void setAnneeFabricationIssam(LocalDate anneeFabricationIssam) { this.anneeFabricationIssam = anneeFabricationIssam; }

    public Double getPrixIssam() { return prixIssam; }
    public void setPrixIssam(Double prixIssam) { this.prixIssam = prixIssam; }
}