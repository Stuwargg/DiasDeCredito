package Modelo;

import javax.swing.JOptionPane;

public class Credito {
    String DiasCredito;

    public Credito() {
    }

    public Credito(String DiasCredito) {
        this.DiasCredito = DiasCredito;
    }

    public String getDiasCredito() {
        return DiasCredito;
    }

    public void setDiasCredito(String DiasCredito) {
        this.DiasCredito = DiasCredito;
    }

    

    
    
    public double CalcularCredito(){
        switch(getDiasCredito()){
            case "SELECCIONAR": return 0;
            case "30": return 3600;
            case "60": return 4500;
            case "90": return 6700;
        }
        return 0;
    }
}
