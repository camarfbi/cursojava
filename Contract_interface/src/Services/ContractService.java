package Services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installments;

//7 Passo
public class ContractService {
	
	//dependencia da classe OnlinePaymentService
	private OnlinePaymentService onlinePaymentService;

	//construtor obrigando o uso do onlinePaymentService
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	//Metodo para receber o contrato e quant de meses
	public void processContract(Contract contract, int months) {
		/*8 Passo - instanciar o contrato
		contract.getInstallments().add(new Installments(LocalDate.of(2018, 7, 25), 206.04));
		contract.getInstallments().add(new Installments(LocalDate.of(2018, 8, 25), 208.08));
		*/
		//14 Passo - Logica para gerar as parcelas
		//valor da parcela total do contrato/pela quant de parcelas
		double basicQuota = contract.getTotalValue() / months;
		
		for(int i=1; i<=months; i++) {
			//soma a quantidade de mes para o proximo vencimento com plusMonths
			LocalDate dueDate = contract.getDate().plusMonths(i);
			//definindo o valor da parcela com juros para cada parcela
			double interest = onlinePaymentService.interest(basicQuota, i);
			//calculando o valor da taxa 
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			//valor da parcela final
			double quota = basicQuota + interest + fee;
			//adicionando cada parcela na lista installments
			contract.getInstallments().add(new Installments(dueDate, quota));
			
		}
	}
}
