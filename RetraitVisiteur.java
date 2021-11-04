public class RetraitVisiteur implements Visitor {

public void VisitCarteGold(CarteGold gold) {
	System.out.println("Le Retrait maximum journalier sur le compte Gold est de 1 million franc") ;
}

public void VisitCarteSilver(CarteSilver silver){
	System.out.println("Le Retrait maximum journalier sur le compte Silver est de 600 mille franc") ;
}

public void VisitCarteBronze(CarteBronze bronze){
	System.out.println("Le Retrait maximum journalier sur le compte Bronze est de 400 mille franc") ;
}

}