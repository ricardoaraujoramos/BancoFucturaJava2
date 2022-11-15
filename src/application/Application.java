package application;

import java.util.Calendar;

import dao.ContaDao;
import dao.ContaDaoImpl;
import entities.Conta;
import entities.InfBank;
import entities.User;

public class Application {

	public static void main(String[] args) {

		ContaDao contaDao = new ContaDaoImpl();

		Conta conta = new Conta();
		Calendar calendar = Calendar.getInstance();
		calendar.set(2021, 5, 19);
		conta.setDataAberturaConta(calendar);
		conta.setNome(new User("Alexandre Lindo", "10398745689", null));
		conta.setNomeBanco(new InfBank("Banco itau", "10998765000170", "itauquervoce@itau.com", "rua da concordia"));
		conta.setNumConta(1234567);
		conta.setSaldoConta(900.00);
		conta.setTipoConta("corrente");
		contaDao.inserir(conta);

	}

}
