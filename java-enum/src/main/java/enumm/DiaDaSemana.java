package enumm;

public enum DiaDaSemana {
	Segunda(true),
	Terca(true),
	Quarta(true),
	Quinta(true),
	Sexta(true),
	Sabado(false),
	Domingo(false);
	
	boolean diaUtil;
	
	DiaDaSemana(boolean diaUtil) {
		this.diaUtil = diaUtil;
	}
	
	public boolean isDiaUtil() {
		return diaUtil;
	}
}
