public class Test {


    public static void main(String[] args) {
        Hopital h = new Hopital();
        Patient p1 = new Patient(12345678,"Bengagi","Oussama",55);
        Patient p2 = new Patient(12345678,"ABCD","EFGH",55);
        Patient p3 = new Patient(12345678,"IJKL","MNOP",55);
        Patient p4 = new Patient(12345678,"QRST","UVW",55);
        Patient p5 = new Patient(12345678,"XYZ","ABCD",55);

        ListPatients l = new ListPatients();

        l.ajouterPatient(p1);
        l.ajouterPatient(p2);
        l.ajouterPatient(p3);
        l.ajouterPatient(p4);
        l.ajouterPatient(p5);


        Medecin m1 = new Medecin(123321123,"Tbib1","TBIB",1);
        Medecin m2 = new Medecin(123321123,"Tbib2","TBIB",1);
        Medecin m3 = new Medecin(123321123,"Tbib3","TBIB",1);
        Medecin m4 = new Medecin(123321123,"Tbib4","TBIB",1);
        Medecin m5 = new Medecin(123321123,"Tbib5","TBIB",1);










    }
}
