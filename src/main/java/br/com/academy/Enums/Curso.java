package br.com.academy.Enums;

public enum Curso {

    ADMINISTRACAO("Administracão"),
    AGRONOMIA("Agronomia"),
    BIOLOGIA("Biologia"),
    BIOMEDICINA("Biomedicina"),
    INFORMATICA("Informática"),
    CONTABILIDADE("Contabilidade"),
    PROGRAMACAO("Programação"),
    ENFERMAGEM("Enfermagem");

    private String curso;

    private Curso(String curso) {
        this.curso = curso;
    }

}
