package Interface.Estabelecimento;

import Interface.Equipamentos.Copiadora.Copiadora;
import Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Interface.Equipamentos.Digitalizadora.Scanner;
import Interface.Equipamentos.EquipamentoMultiFucional.EquipamentoMultiFuncional;
import Interface.Equipamentos.Impressora.Deskjet;
import Interface.Equipamentos.Impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new  EquipamentoMultiFuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();

    }
}
