package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.TicketSearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TicketSearchStepDefinition {

	private TicketSearchPage ticketSearchPage;

	public TicketSearchStepDefinition() {
		this.ticketSearchPage = new TicketSearchPage();
	}

	@Given("Je me connecte sur l application Ouisncf")
	public void jeMeConnecteSurLApplicationOuisncf() {
		ticketSearchPage.goToUrl();
	}

	@When("Je selectionne le lieu de depart {string}")
	public void jeSelectionneLeLieuDeDepart(String departure) {
		ticketSearchPage.SelectDeparturePlace(departure);
	}

	@When("Je selectionne le lieu d arrivee {string}")
	public void jeSelectionneLeLieuDArrivee(String arrival) {
		ticketSearchPage.SelectArrivalPlace(arrival);
	}

	@When("Je clique sur le bouton date et heure")
	public void jeCliqueSurLeBoutonDateEtHeure() {
		ticketSearchPage.ClickOnButtonDateAndHour();
	}

	@When("Je saisie la date {string}")
	public void jeSaisieLaDate(String string) {
		ticketSearchPage.SelectDate(string);
	}

	@When("Je clique sur le bouton heure")
	public void jeCliqueSurLeBoutonHeure() {
		ticketSearchPage.ClickButtonTime();
	}

	@When("Je selectionne l heure")
	public void jeSelectionneLHeure() {
		ticketSearchPage.SelectHour();
	}

	@When("Je selectionne les minutes")
	public void jeSelectionneLesMinutes() {
		ticketSearchPage.SelectMinutes();
	}

	@When("Je clique sur le bouton rechercher")
	public void jeCliqueSurLeBoutonRechercher() {
		ticketSearchPage.clickOnButtonSearch();
	}

	@Then("Je me redirige vers la page des trajets suggeres")
	public void jeMeRedirigeVersLaPageDesTrajetsSuggeres(String text1) {
		String message1 = TicketSearchPage.suggestedMessage.getText();
		Assert.assertEquals(message1, text1);
	}

	@When("Je clique sur TGV INOUI")
	public void jeCliqueSurTGVINOUI() {
		ticketSearchPage.clickOnButtonSearch();
	}

	@Then("Je me redirige vers la page des details {string}")
	public void jeMeRedirigeVersLaPageDesDetails(String text2) {
		String message2 = TicketSearchPage.validationMessage.getText();
		Assert.assertEquals(message2, text2);
	}

}