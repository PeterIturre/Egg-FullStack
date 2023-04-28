package Entidades;

public class Curso {

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int csntidadDiasPorSemana;
    private char turno;
    private double precioPorHora;

    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int csntidadDiasPorSemana, char turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.csntidadDiasPorSemana = csntidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCsntidadDiasPorSemana() {
        return csntidadDiasPorSemana;
    }

    public char getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCsntidadDiasPorSemana(int csntidadDiasPorSemana) {
        this.csntidadDiasPorSemana = csntidadDiasPorSemana;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
}
