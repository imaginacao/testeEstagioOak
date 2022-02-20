package br.com.Oak.teste.estagioLucasPereira;

import java.util.Comparator;

public class listagemCrescente implements Comparator<listagem>{

	
	
	
	@Override
	public int compare(listagem o1, listagem o2) {
		if(o1.getName().compareTo(o2.getName()) > 0){
			return 1;
		}
		return -1;
	}
}
