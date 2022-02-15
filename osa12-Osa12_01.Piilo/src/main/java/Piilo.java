/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nasretulla
 */
public class Piilo<T> {

    private T piilo;

    public Piilo() {

    }

    public void laitaPiiloon(T piilotettava) {
        this.piilo = piilotettava;

    }

    public T otaPiilosta() {
        if (this.piilo == null) {
            return null;

        } else {
            Object palauttaa = piilo;
            this.piilo = null;
            return (T) palauttaa;

        }

    }

    public boolean onkoPiilossa() {
        if (piilo == null) {
            return false;

        }
        return true;

    }
}
