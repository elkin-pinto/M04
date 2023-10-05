Algoritmo suma_parels_i_senars
	Leer casos
	i <- 0
	x <- 0
	parells <- 0
	senars <- 0
	Para i<-1 Hasta casos Con Paso 1 Hacer
		Leer input
		Para x<-1 Hasta input Con Paso 1 Hacer // Con este bucle miraremos de recibir un input i tratarlo individualmente con otro bucle.
			Si input MOD 2==1 Entonces
				senars <- senars+input // Con este bucle haremos que si el input es parejo o senar se sume a la variable correspondiente
			SiNo
				parells <- parells+input
			FinSi
			input <- input-1
		FinPara
		Escribir 'PARELLS: ', parells, ' SENARS: ', senars // Le restamos 1 para que ir bajando el numero hasta que llegue a 1.
		parells <- 0
		senars <- 0
	FinPara // Devolvemos las variables a zero para que el ciclo pueda volver a empezar.
FinAlgoritmo
