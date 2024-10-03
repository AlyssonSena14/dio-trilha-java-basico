package Pilares_do_POO;

public abstract class Veiculo {
    public String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void ligar();
}
