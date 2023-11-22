import java.util.HashMap;
import java.util.Map;

public class Hopital {

    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital(){
        medecinPatiens = new HashMap<>();
        /*à completer*/
    }

    public void ajouterMedecin(Medecin m){
        medecinPatiens.put(m, new ListPatients());
        /*à completer*/
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if(medecinPatiens.containsKey(m)) {
            medecinPatiens.get(m).ajouterPatient(p);
            /*à completer*/
        } else {
            ListPatients list = new ListPatients();
            list.ajouterPatient(p);
            medecinPatiens.put(m, list);
            /*à completer*/
        }
    }
    /*Avec l'api stream */
    public void afficherMap(){
        medecinPatiens.forEach((m,list) -> {
            System.out.println(m);
            list.afficherPatients();
        });
    }


    /* Afficher les patients d’un medecin dont le nom est "mohamed" */
    public void afficherMedcinPatients(Medecin m) {

        medecinPatiens.keySet().stream().filter(med -> med.getNom()== "mohamed").forEach(med -> System.out.println(med));
    }

}