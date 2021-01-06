package Modelo;

public class Empleado {
    private int id_empleao;
    private String nom_empl;
    private String tel_empl;
    private int correo_empl;
    private String dir_empl;

    public Empleado() {
    }

    public Empleado(int id_empleao, String nom_empl, String tel_empl, int correo_empl, String dir_empl) {
        this.id_empleao = id_empleao;
        this.nom_empl = nom_empl;
        this.tel_empl = tel_empl;
        this.correo_empl = correo_empl;
        this.dir_empl = dir_empl;
    }
    
    public int getId_empleao() {
        return id_empleao;
    }

    public void setId_empleao(int id_empleao) {
        this.id_empleao = id_empleao;
    }

    public String getNom_empl() {
        return nom_empl;
    }

    public void setNom_empl(String nom_empl) {
        this.nom_empl = nom_empl;
    }

    public String getTel_empl() {
        return tel_empl;
    }

    public void setTel_empl(String tel_empl) {
        this.tel_empl = tel_empl;
    }

    public int getCorreo_empl() {
        return correo_empl;
    }

    public void setCorreo_empl(int correo_empl) {
        this.correo_empl = correo_empl;
    }

    public String getDir_empl() {
        return dir_empl;
    }

    public void setDir_empl(String dir_empl) {
        this.dir_empl = dir_empl;
    }
}
