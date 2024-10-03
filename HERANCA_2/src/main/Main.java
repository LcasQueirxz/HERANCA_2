package main; // define o pacote principal

import packs.*; // importa todos os pacotes dentro de packs

public class Main { // define a classe principal

    public static void main(String[] args) { // metodo principal que inicia a execução 
        // inicio do bloco do metodo main
 
        Vendedor p1 = new Vendedor("Carol Locher", "324.435.654.78", "10/03/2001", "23/10/2021", 4500.0, 7); // cria um objeto Vendedor com os dados fornecidos
        Gerente p2 = new Gerente("Elisa Santos", "734.895.764.78", "20/07/2003", "21/06/2011", 3200.0, "Recursos Humanos"); // cria um objeto Gerente com os dados fornecidos
        Cliente p3 = new Cliente("Luisa Pires",  " 544.675.894.28", "16/04/2005", " Luisa2007@gmail.com ", " 342567 ", " 15998765840 "); // cria um objeto Cliente com os dados fornecidos
    
        System.out.println(p1); 
        System.out.println(p2); 
        System.out.println(p3); 

    } 

} 