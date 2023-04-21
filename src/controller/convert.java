package controller;

import br.com.juliarafaela.pilhaint.Pilha;

public class convert {
public void DecTobin(int var) {
		
		Pilha p=new Pilha(); // cria uma pilha 
		
		while((double)var>0) { /// enquanto o número for maior que 0
					p.push(var % 2); // binário recebe valor mod 2;
			var /= 2; // valor = valor /2;
		}
		System.out.println("Valor convertido");
		while(!p.isEmpty()) 
		{
			try {
				System.out.println(String.valueOf(p.pop()));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
