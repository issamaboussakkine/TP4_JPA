package ma.projet.issam.entity.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("MOTO_ISSAM")
public class MotoIssam extends VehiculeIssam {

    private Integer cylindreeIssam;
    private String typeTransmissionIssam;

    public MotoIssam() {}

    public MotoIssam(String marqueIssam, String modeleIssam, LocalDate anneeFabricationIssam, Double prixIssam,
                     Integer cylindreeIssam, String typeTransmissionIssam) {
        super(marqueIssam, modeleIssam, anneeFabricationIssam, prixIssam);
        this.cylindreeIssam = cylindreeIssam;
        this.typeTransmissionIssam = typeTransmissionIssam;
    }

    public Integer getCylindreeIssam() { return cylindreeIssam; }
    public void setCylindreeIssam(Integer cylindreeIssam) { this.cylindreeIssam = cylindreeIssam; }

    public String getTypeTransmissionIssam() { return typeTransmissionIssam; }
    public void setTypeTransmissionIssam(String typeTransmissionIssam) { this.typeTransmissionIssam = typeTransmissionIssam; }
}