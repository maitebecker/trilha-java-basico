package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multiFuncional.EquipamenteMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner();
		
		EquipamenteMultifuncional em = new EquipamenteMultifuncional();
		
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	}
}
