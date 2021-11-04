public class DepotVisiteur implements Visitor {

public void VisitCarteGold(CarteGold gold) {
	System.out.println("Le depot maximum journalier sur le compte Gold est de 500 mille franc") ;
}

public void VisitCarteSilver(CarteSilver silver){
	System.out.println("Le depot maximum journalier sur le compte Silver est de 300 mille franc") ;
}

public void VisitCarteBronze(CarteBronze bronze){
	System.out.println("Le depot maximum journalier sur le compte Bronze est de 150 mille franc") ;
}

}