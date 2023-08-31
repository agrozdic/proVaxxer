package com.ftn.eUprava.models;

import java.time.LocalDateTime;

public class OboleliVest {
    private int oboleliVestID;
    private int brObolelih; // broj oboleleih u 24h
    private int brTestiranih; // broj testiranih u 24h
    private int brUkupno; // broj ukupno obolelih
    private int brHospitalizovanih;
    private int brNaRespiratoru;
    private LocalDateTime dvObjave; // datum i vreme objave

    public OboleliVest(int oboleliVestID, int brObolelih, int brTestiranih, int brUkupno, int brHospitalizovanih, int brNaRespiratoru, LocalDateTime dvObjave) {
        this.oboleliVestID = oboleliVestID;
        this.brObolelih = brObolelih;
        this.brTestiranih = brTestiranih;
        this.brUkupno = brUkupno;
        this.brHospitalizovanih = brHospitalizovanih;
        this.brNaRespiratoru = brNaRespiratoru;
        this.dvObjave = dvObjave;
    }

    public OboleliVest(int brObolelih, int brTestiranih, int brUkupno, int brHospitalizovanih, int brNaRespiratoru, LocalDateTime dvObjave) {
        this.brObolelih = brObolelih;
        this.brTestiranih = brTestiranih;
        this.brUkupno = brUkupno;
        this.brHospitalizovanih = brHospitalizovanih;
        this.brNaRespiratoru = brNaRespiratoru;
        this.dvObjave = dvObjave;
    }

    public OboleliVest(int brObolelih, int brTestiranih, int brHospitalizovanih, int brNaRespiratoru, LocalDateTime dvObjave) {
        this.brObolelih = brObolelih;
        this.brTestiranih = brTestiranih;
        this.brHospitalizovanih = brHospitalizovanih;
        this.brNaRespiratoru = brNaRespiratoru;
        this.dvObjave = dvObjave;
    }

    public int getoboleliVestID() {
        return oboleliVestID;
    }

    public void setoboleliVestID(int oboleliVestID) {
        this.oboleliVestID = oboleliVestID;
    }

    public int getBrObolelih() {
        return brObolelih;
    }

    public void setBrObolelih(int brObolelih) {
        this.brObolelih = brObolelih;
    }

    public int getBrTestiranih() {
        return brTestiranih;
    }

    public void setBrTestiranih(int brTestiranih) {
        this.brTestiranih = brTestiranih;
    }

    public int getBrUkupno() {
        return brUkupno;
    }

    public void setBrUkupno(int brUkupno) {
        this.brUkupno = brUkupno;
    }

    public int getBrHospitalizovanih() {
        return brHospitalizovanih;
    }

    public void setBrHospitalizovanih(int brHospitalizovanih) {
        this.brHospitalizovanih = brHospitalizovanih;
    }

    public int getBrNaRespiratoru() {
        return brNaRespiratoru;
    }

    public void setBrNaRespiratoru(int brNaRespiratoru) {
        this.brNaRespiratoru = brNaRespiratoru;
    }

    public LocalDateTime getDvObjave() {
        return dvObjave;
    }

    public void setDvObjave(LocalDateTime dvObjave) {
        this.dvObjave = dvObjave;
    }

    @Override
    public String toString() {
        return
                "Vest o obolelima ID:" + oboleliVestID + "\n" +
                "Broj obolelih u poslednjih 24h: " + brObolelih + "\n" +
                "Broj testiranih u poslednjih 24h: " + brTestiranih + "\n" +
                "Ukupan broj obolelih od pocetka pandemije: " + brUkupno + "\n" +
                "Broj hospitalizovanih: " + brHospitalizovanih + "\n" +
                "Broj pacijenata na respiratoru: " + brNaRespiratoru + "\n" +
                "Datum i vreme objave:" + dvObjave;
    }

}
