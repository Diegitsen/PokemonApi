package games.lancelot.pokemonapi.entity;

import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by Aldo on 12/02/2017.
 */
public class PokemonEntity
{
    private int id;
    private String nombre;
    private String tipo;
    private String imagen;
    private ImageView ima;

    public ImageView getIma() {
        return ima;
    }

    public void setIma(ImageView ima) {
        this.ima = ima;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}