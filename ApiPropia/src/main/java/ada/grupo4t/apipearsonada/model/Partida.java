package ada.grupo4t.apipearsonada.model;

import jakarta.persistence.*;

@Entity
@Table(name = "partida")
public class Partida {
    private int id;
    private String nombre;
    private int tiempo;
    private int puntuacion;

    public Partida() {
    }

    public Partida(int id, String nombre, int tiempo, int puntuacion) {
        this.id = id;
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.puntuacion = puntuacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

