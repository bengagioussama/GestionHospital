import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient{

    private List<Patient> listP;

    public ListPatients(){
        /*à completer*/
        listP = new ArrayList<>();
    }

    public void ajouterPatient(Patient p) {
        /*à completer*/
        listP.add(p);
    }

    public void supprimerPatient(Patient p) {
        /*à completer*/
        listP.remove(p);
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(Patient p){
        /*à completer*/
        return listP.stream().anyMatch(l -> l.equals(p));
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(int cin) {
        /*à completer*/
        return listP.stream().anyMatch(l -> l.getCin() == cin);
    }
    /* Avec l’api Stream */
    public void afficherPatients() {
        /*à completer*/
        listP.stream().forEach(l-> System.out.println(l));
    }
    /* Avec l’api Stream */
    public void trierPatientsParNom() {

        listP = listP.stream().sorted((p1, p2) -> p1.getNom().compareTo(p2.getNom())).collect(Collectors.toList());
    }

    /* Avec l'api stream */
    public void PatientSansRedondance(){
        List<Patient> distinctList = listP.stream().distinct().collect(Collectors.toList());
        distinctList.forEach(l-> System.out.println(l));

        //
    }
}