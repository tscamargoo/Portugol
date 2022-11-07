package exc01;

import exc01.model.Cliente;

public class TesteCliente {

    public static void main(String[] args) {

        Cliente exc01 = new Cliente(1,18,"thiago","443.599.288-40","itapevi-sp");
        Cliente exc02 = new Cliente(2,26,"edu","443.599.288-67","brasilia-df");

        exc01.visualizar();
        exc02.visualizar();
    }

}
