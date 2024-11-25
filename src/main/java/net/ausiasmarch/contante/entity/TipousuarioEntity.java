package net.ausiasmarch.contante.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipousuario")
public class TipousuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    @OneToMany(mappedBy = "tipousuario", fetch = FetchType.LAZY)
    private java.util.List<UsuarioEntity> usuarios;

    public TipousuarioEntity() {
    }

    public TipousuarioEntity(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipousuarioEntity(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUsuarios() {
        return usuarios.size();
    }
}