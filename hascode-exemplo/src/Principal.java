import Automovel.Carro;
import Proprietario.Pessoa;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {

        /*
        Projeto feito para estudo de HashCode, HashMap e Map.

         */

        Pessoa marcus = new Pessoa("Marcus", "67677833");
        Pessoa aline = new Pessoa("Aline", "3456222");
        Pessoa matheus = new Pessoa("Matheus", "88990007");
        Pessoa daniela = new Pessoa("Daniela", "9900877");

        Carro Lambo = new Carro("FFGGHJ", "Ventador");
        Carro Chevrolet = new Carro("HJJKL", "Onix");
        Carro Ford = new Carro("HHJJHL", "Ford Ka");

        Map<Carro, Pessoa> pessoasMap = new HashMap<>();
        pessoasMap.put(Lambo, marcus);
        pessoasMap.put(Chevrolet, aline);
        pessoasMap.put(Ford, daniela);

        pessoasMap.put(Ford, matheus);
//        pessoasMap.remove(Lambo);

//        pessoasMap.put(null, marcus);


//        System.out.println(pessoasMap);

//     System.out.println(pessoasMap.get(Lambo));

//        for (Carro carro : pessoasMap.keySet()) {
//            System.out.println(carro);
//        }

//        for (Pessoa Proprietario : pessoasMap.values()) {
//            System.out.println(Proprietario);
//        }
//

//        for (Carro carro : pessoasMap.keySet()) {
//            Pessoa pessoas = pessoasMap.get(carro);
//            System.out.printf("%s (%s) = %s%n", carro.getPlaca(), carro.getModelo(), pessoas.getNome());
//        }

//        for (Map.Entry<Carro, Pessoa> entry : pessoasMap.entrySet()) {
//            System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(), entry.getKey().getModelo(), entry.getValue().getNome());
//
//        }

        for (var entry : pessoasMap.entrySet()) {
            System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(), entry.getKey().getModelo(), entry.getValue().getNome());

        }
    }
}