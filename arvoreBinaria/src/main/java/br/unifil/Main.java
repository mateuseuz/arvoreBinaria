package br.unifil;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(5);
        arvoreBinaria.inserir(3);
        arvoreBinaria.inserir(2);
        arvoreBinaria.inserir(9);
        arvoreBinaria.inserir(7);
        arvoreBinaria.inserir(8);
        arvoreBinaria.inserir(12);
        System.out.println("\nPré-ordem: ");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nEm ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nPós ordem: ");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
        arvoreBinaria.remover(9);
        System.out.println("\nPré-ordem: ");
        arvoreBinaria.preOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nEm ordem: ");
        arvoreBinaria.emOrdem(arvoreBinaria.getRaiz());
        System.out.println("\nPós ordem: ");
        arvoreBinaria.posOrdem(arvoreBinaria.getRaiz());
    }
}