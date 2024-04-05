package kendaraan.pribadi;

import kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    public Motor() {
        super("Car");
    }
    @Override
    public void Start() {
        System.out.println("Motor " + this.getModel() + "dihidupkan");
    }

    @Override
    public void Stop() {
        System.out.println("Motor " + this.getModel() + "dimatikan");
    }

    @Override
    public void Brake() {
        System.out.println("Motor berhenti");
    }
}
