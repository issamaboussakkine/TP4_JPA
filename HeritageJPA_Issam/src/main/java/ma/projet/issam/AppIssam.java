package ma.projet.issam;

import ma.projet.issam.entity.joined.DeveloppeurIssam;
import ma.projet.issam.entity.joined.EmployeIssam;
import ma.projet.issam.entity.joined.ManagerIssam;
import ma.projet.issam.entity.singletable.MotoIssam;
import ma.projet.issam.entity.singletable.VehiculeIssam;
import ma.projet.issam.entity.singletable.VoitureIssam;
import ma.projet.issam.entity.tableperclass.ElectroniqueIssam;
import ma.projet.issam.entity.tableperclass.LivreIssam;
import ma.projet.issam.entity.tableperclass.ProduitIssam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;

public class AppIssam {
    public static void main(String[] args) {
        EntityManagerFactory emfIssam = Persistence.createEntityManagerFactory("HeritageIssamPU");

        try {
            System.out.println("\nTEST 1: STRATÉGIE SINGLE TABLE (Véhicules Issam) ");
            testSingleTableIssam(emfIssam);

            System.out.println("\n TEST 2: STRATÉGIE JOINED (Employés Issam) ");
            testJoinedIssam(emfIssam);

            System.out.println("\n TEST 3: STRATÉGIE TABLE PER CLASS (Produits Issam) ");
            testTablePerClassIssam(emfIssam);

        } finally {
            emfIssam.close();
            System.out.println("\n Tests terminés - Base de données fermée");
        }
    }

    private static void testSingleTableIssam(EntityManagerFactory emfIssam) {
        EntityManager emIssam = emfIssam.createEntityManager();
        try {
            emIssam.getTransaction().begin();

            System.out.println("Création des véhicules Issam...");

            VoitureIssam voiture1Issam = new VoitureIssam(
                    "Renault", "Clio", LocalDate.of(2020, 5, 15), 15000.0,
                    5, true, "Essence"
            );

            VoitureIssam voiture2Issam = new VoitureIssam(
                    "Peugeot", "308", LocalDate.of(2019, 3, 10), 18000.0,
                    5, true, "Diesel"
            );

            MotoIssam moto1Issam = new MotoIssam(
                    "Honda", "CBR", LocalDate.of(2021, 7, 20), 12000.0,
                    600, "Manuelle"
            );

            emIssam.persist(voiture1Issam);
            emIssam.persist(voiture2Issam);
            emIssam.persist(moto1Issam);

            emIssam.getTransaction().commit();
            System.out.println("✅ Véhicules Issam créés avec succès !");

            emIssam.clear();

            System.out.println("\n📋 Tous les véhicules Issam :");
            List<VehiculeIssam> vehiculesIssam = emIssam.createQuery("SELECT v FROM VehiculeIssam v", VehiculeIssam.class)
                    .getResultList();
            vehiculesIssam.forEach(System.out::println);

            System.out.println("\n📋 Toutes les voitures Issam :");
            List<VoitureIssam> voituresIssam = emIssam.createQuery("SELECT v FROM VoitureIssam v", VoitureIssam.class)
                    .getResultList();
            voituresIssam.forEach(System.out::println);

            System.out.println("\n📋 Toutes les motos Issam :");
            List<MotoIssam> motosIssam = emIssam.createQuery("SELECT m FROM MotoIssam m", MotoIssam.class)
                    .getResultList();
            motosIssam.forEach(System.out::println);

        } catch (Exception e) {
            if (emIssam.getTransaction().isActive()) {
                emIssam.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            emIssam.close();
        }
    }

    private static void testJoinedIssam(EntityManagerFactory emfIssam) {
        EntityManager emIssam = emfIssam.createEntityManager();
        try {
            emIssam.getTransaction().begin();

            System.out.println("Création des employés Issam...");

            DeveloppeurIssam dev1Issam = new DeveloppeurIssam(
                    "Aboussakkine", "Issam", "IssamAboussakkine@email.com", LocalDate.of(2019, 5, 15),
                    "Java", "Backend", 5
            );

            DeveloppeurIssam dev2Issam = new DeveloppeurIssam(
                    "Ajabboune", "Hafsa", "HafsaAjabboune@email.com", LocalDate.of(2020, 3, 10),
                    "JavaScript", "Frontend", 3
            );

            ManagerIssam manager1Issam = new ManagerIssam(
                    "Dubois", "Pierre", "pierre.dubois@email.issam", LocalDate.of(2018, 7, 20),
                    "IT", 10, 5000.0
            );

            emIssam.persist(dev1Issam);
            emIssam.persist(dev2Issam);
            emIssam.persist(manager1Issam);

            emIssam.getTransaction().commit();
            System.out.println(" Employés Issam créés avec succès !");

            emIssam.clear();

            System.out.println("\n Tous les employés Issam :");
            List<EmployeIssam> employesIssam = emIssam.createQuery("SELECT e FROM EmployeIssam e", EmployeIssam.class)
                    .getResultList();
            employesIssam.forEach(System.out::println);

            System.out.println("\n Tous les développeurs Issam :");
            List<DeveloppeurIssam> devsIssam = emIssam.createQuery("SELECT d FROM DeveloppeurIssam d", DeveloppeurIssam.class)
                    .getResultList();
            devsIssam.forEach(System.out::println);

            System.out.println("\n Tous les managers Issam :");
            List<ManagerIssam> managersIssam = emIssam.createQuery("SELECT m FROM ManagerIssam m", ManagerIssam.class)
                    .getResultList();
            managersIssam.forEach(System.out::println);

        } catch (Exception e) {
            if (emIssam.getTransaction().isActive()) {
                emIssam.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            emIssam.close();
        }
    }

    private static void testTablePerClassIssam(EntityManagerFactory emfIssam) {
        EntityManager emIssam = emfIssam.createEntityManager();
        try {
            emIssam.getTransaction().begin();

            System.out.println("Création des produits Issam...");

            LivreIssam livre1Issam = new LivreIssam(
                    "Le Seigneur des Anneaux", 25.99, "Un classique de fantasy",
                    "J.R.R. Tolkien", "978-2075134729", 1200, "Pocket"
            );

            LivreIssam livre2Issam = new LivreIssam(
                    "Harry Potter", 19.99, "Roman fantastique pour jeunes",
                    "J.K. Rowling", "978-2070643028", 800, "Gallimard"
            );

            ElectroniqueIssam elec1Issam = new ElectroniqueIssam(
                    "Smartphone Galaxy S21", 899.99, "Smartphone haut de gamme",
                    "Samsung", "S21", 24, "Écran 6.2\", 128Go, 8Go RAM"
            );

            emIssam.persist(livre1Issam);
            emIssam.persist(livre2Issam);
            emIssam.persist(elec1Issam);

            emIssam.getTransaction().commit();
            System.out.println(" Produits Issam créés avec succès !");

            emIssam.clear();

            System.out.println("\n Tous les produits Issam :");
            List<ProduitIssam> produitsIssam = emIssam.createQuery("SELECT p FROM ProduitIssam p", ProduitIssam.class)
                    .getResultList();
            produitsIssam.forEach(System.out::println);

            System.out.println("\n Tous les livres Issam :");
            List<LivreIssam> livresIssam = emIssam.createQuery("SELECT l FROM LivreIssam l", LivreIssam.class)
                    .getResultList();
            livresIssam.forEach(System.out::println);

            System.out.println("\n Tous les produits électroniques Issam :");
            List<ElectroniqueIssam> elecsIssam = emIssam.createQuery("SELECT e FROM ElectroniqueIssam e", ElectroniqueIssam.class)
                    .getResultList();
            elecsIssam.forEach(System.out::println);

        } catch (Exception e) {
            if (emIssam.getTransaction().isActive()) {
                emIssam.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            emIssam.close();
        }
    }
}