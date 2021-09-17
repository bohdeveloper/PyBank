package com.bohdeveloper.pybank.modelos;

public class Usuario {
    private Long id;
    private String ref, dni, nombre, apellidos, sexo, fec_nacim, email, telM, telF, pais, provincia, localidad,
            domicilio, cod_post;

    public Usuario() {
    }

    public Usuario(Long id, String ref, String dni, String nombre, String apellidos, String sexo, String fec_nacim,
            String email, String telM, String telF, String pais, String provincia, String localidad, String domicilio,
            String cod_post) {
        setId(id);
        setRef(ref);
        setDni(dni);
        setNombre(nombre);
        setApellidos(apellidos);
        setSexo(sexo);
        setFec_nacim(fec_nacim);
        setEmail(email);
        setTelM(telM);
        setTelF(telF);
        setPais(pais);
        setProvincia(provincia);
        setLocalidad(localidad);
        setDomicilio(domicilio);
        setCod_post(cod_post);
    }

    public Usuario(String ref, String dni, String nombre, String apellidos, String sexo, String fec_nacim, String email,
            String telM, String telF) {
        setRef(ref);
        setDni(dni);
        setNombre(nombre);
        setApellidos(apellidos);
        setSexo(sexo);
        setFec_nacim(fec_nacim);
        setEmail(email);
        setTelM(telM);
        setTelF(telF);
    }

    public Usuario(String ref, String dni, String nombre, String apellidos, String email) {
        setRef(ref);
        setDni(dni);
        setNombre(nombre);
        setApellidos(apellidos);
        setEmail(email);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFec_nacim() {
        return fec_nacim;
    }

    public void setFec_nacim(String fec_nacim) {
        this.fec_nacim = fec_nacim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelM() {
        return telM;
    }

    public void setTelM(String telM) {
        this.telM = telM;
    }

    public String getTelF() {
        return telF;
    }

    public void setTelF(String telF) {
        this.telF = telF;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCod_post() {
        return cod_post;
    }

    public void setCod_post(String cod_post) {
        this.cod_post = cod_post;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + ((cod_post == null) ? 0 : cod_post.hashCode());
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        result = prime * result + ((domicilio == null) ? 0 : domicilio.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((fec_nacim == null) ? 0 : fec_nacim.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((pais == null) ? 0 : pais.hashCode());
        result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
        result = prime * result + ((ref == null) ? 0 : ref.hashCode());
        result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
        result = prime * result + ((telF == null) ? 0 : telF.hashCode());
        result = prime * result + ((telM == null) ? 0 : telM.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (apellidos == null) {
            if (other.apellidos != null)
                return false;
        } else if (!apellidos.equals(other.apellidos))
            return false;
        if (cod_post == null) {
            if (other.cod_post != null)
                return false;
        } else if (!cod_post.equals(other.cod_post))
            return false;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        if (domicilio == null) {
            if (other.domicilio != null)
                return false;
        } else if (!domicilio.equals(other.domicilio))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (fec_nacim == null) {
            if (other.fec_nacim != null)
                return false;
        } else if (!fec_nacim.equals(other.fec_nacim))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (localidad == null) {
            if (other.localidad != null)
                return false;
        } else if (!localidad.equals(other.localidad))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (pais == null) {
            if (other.pais != null)
                return false;
        } else if (!pais.equals(other.pais))
            return false;
        if (provincia == null) {
            if (other.provincia != null)
                return false;
        } else if (!provincia.equals(other.provincia))
            return false;
        if (ref == null) {
            if (other.ref != null)
                return false;
        } else if (!ref.equals(other.ref))
            return false;
        if (sexo == null) {
            if (other.sexo != null)
                return false;
        } else if (!sexo.equals(other.sexo))
            return false;
        if (telF == null) {
            if (other.telF != null)
                return false;
        } else if (!telF.equals(other.telF))
            return false;
        if (telM == null) {
            if (other.telM != null)
                return false;
        } else if (!telM.equals(other.telM))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [apellidos=" + apellidos + ", cod_post=" + cod_post + ", dni=" + dni + ", domicilio="
                + domicilio + ", email=" + email + ", fec_nacim=" + fec_nacim + ", id=" + id + ", localidad="
                + localidad + ", nombre=" + nombre + ", pais=" + pais + ", provincia=" + provincia + ", ref=" + ref
                + ", sexo=" + sexo + ", telF=" + telF + ", telM=" + telM + "]";
    }

}
