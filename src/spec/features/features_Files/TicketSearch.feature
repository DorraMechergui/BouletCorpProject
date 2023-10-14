Feature: Je souhaite chercher un billet de train selon la trajet et l horaire
  En tant que utilisateur je souhaite chercher un billet de train entre deux regions en une date et heure que je les precise

  @sncf
  Scenario: Je souhaite chercher un billet de train selon la trajet et l horaire
    Given Je me connecte sur l application Ouisncf
    When Je selectionne le lieu de depart "Paris (Toutes gares)"
    And Je selectionne le lieu d arrivee "Toulouse Matabiau"
    And Je clique sur le bouton date et heure
    And Je saisie la date "14/10/2023"
    And Je clique sur le bouton heure
    And Je selectionne l heure
    And Je selectionne les minutes
    And Je clique sur le bouton rechercher
    Then Je me redirige vers la page des trajets suggeres "Trajets suggérés"
    When Je clique sur TGV INOUI
    Then Je me redirige vers la page des details "Train TGV INOUI N°8501"
