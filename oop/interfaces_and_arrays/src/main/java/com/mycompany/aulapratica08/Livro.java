package com.mycompany.aulapratica08;
public class Livro implements Publicacao {
    private String titulo;
    private Pessoa autor;
    private int totPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, Pessoa autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.paginaAtual = 0;
        this.aberto = false;
    }
    
    public void status() {
        System.out.println("\n ### Livro ###");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor().getNome());
        System.out.println("Número de páginas: " + this.getTotPaginas());
        System.out.println("Página atual: " + this.paginaAtual);
        System.out.println("Leitor: " + this.getLeitor().getNome());   
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        this.paginaAtual = pagina;
    }

    @Override
    public void avancarPagina() {
        if (this.paginaAtual < this.totPaginas) {
            this.paginaAtual = this.paginaAtual + 1;
        }
    }

    @Override
    public void voltarPagina() {
        if (this.paginaAtual > 0) {
            this.paginaAtual = this.paginaAtual - 1;
        }
    }
}
