# Gestion de Stock

Une application de gestion de stock qui permet aux utilisateurs de suivre les stocks de produits.

## Description

L'application de gestion de stock est conçue pour aider les entreprises à gérer efficacement leur inventaire de produits. Elle offre des fonctionnalités de suivi des produits, de gestion des stocks, de gestion des commandes et de génération de rapports.

## Table des Matières

- [Installation](#installation)
- [Utilisation](#utilisation)
- [Captures d'écran](#captures-décran)


## Installation

### Dépendances

Avant de pouvoir exécuter l'application, assurez-vous d'avoir les dépendances suivantes installées sur votre système :

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Node.js](https://nodejs.org/)
- [Maven](https://maven.apache.org/)
- [Angular CLI](https://cli.angular.io/)

### Étapes d'installation

1. Clonez ce référentiel sur votre machine.

```bash
git clone https://github.com/votreutilisateur/gestion-de-stock.git
```
2. Installez les dépendances pour le backend (Spring Boot) et le frontend (Angular) en exécutant les commandes suivantes dans les répertoires correspondants :
# Backend (Spring Boot)
```bash
cd backend
mvn clean install
```
# Frontend (Angular)
```bash
cd frontend
npm install
```

3. Configurez la base de données en éditant le fichier application.properties dans le répertoire backend.

4. Lancez l'application Spring Boot :
 ```bash
cd backend
mvn spring-boot:run
```
6. Lancez le serveur de développement Angular :
```bash
cd frontend
ng serve
```
Accédez à l'application dans votre navigateur à l'adresse http://localhost:4200.
## Utilisation 
Une fois l'application lancée, ouvrez un navigateur web et accédez à http://localhost:4200 pour utiliser l'application. Vous pouvez vous connecter, ajouter des produits, mettre à jour les niveaux de stock, passer des commandes, générer des rapports, etc.

## Captures d'écran
### Accueil du Responsable du Stock :
Le tableau de bord d'accueil est une vue complète de l'état du stock. Il affiche des 
diagrammes de réclamations et de demandes en cours, ainsi qu'un diagramme du 
nombre de demandes par département avec le total des catégories, articles, demandes 
et réclamations.<br><br>
<b>Fonctionnalités :</b> Consultation des statistiques, accès aux demandes et 
réclamations en cours.<br>
![screenshot20230914023243](https://github.com/NaimaAYYACHE/skydash/assets/105889744/7c6b43f5-3ec5-4041-9ddd-7da9a219edfe)<br>
### Gestion des Articles :
L'interface de gestion des articles permet au responsable du stock de gérer les articles 
en stock. Elle affiche la liste des articles avec la possibilité d'imprimer un rapport 
entre deux dates, d'ajouter un nouvel article, de le modifier, ou de le supprimer.<br><br>
<b>Fonctionnalités :</b> Consultation, Ajout, modification, suppression d'articles, 
impression de rapports.<br><br>
• Liste des articles<br>
![screenshot20230914023622](https://github.com/NaimaAYYACHE/skydash/assets/105889744/ac972a60-0d88-44a1-8a6e-8f8f408eeb41)<br>
• Ajouter un article<br>
![screenshot20230914023742](https://github.com/NaimaAYYACHE/skydash/assets/105889744/2be3dcbc-9bb9-4f46-81e5-3be6b47284ba)<br>
• Modifier un article<br>
![screenshot20230914023832](https://github.com/NaimaAYYACHE/skydash/assets/105889744/1ae89edb-cbfe-46a6-9c40-8bbc7cf2ecf2)<br>
### Gestion des Catégories :
L'interface de gestion des catégories permet au responsable du stock de gérer les 
catégories auxquelles appartiennent les articles. Elle affiche la liste des catégories 
avec la possibilité d'imprimer la liste, d'ajouter une nouvelle catégorie, de la modifier, 
ou de la supprimer.<br><br>
<b>Fonctionnalités :</b> Consultation, Ajout, modification, suppression de catégories, 
impression de la liste des catégories.<br>
• Liste des catégories<br>
![screenshot20230914023354](https://github.com/NaimaAYYACHE/skydash/assets/105889744/02da23a1-ec56-4087-a3a3-e78f61c826f8)<br>
• Ajouter une catégorie<br>
![screenshot20230914023502](https://github.com/NaimaAYYACHE/skydash/assets/105889744/5a7f22d8-2b6c-4ed8-b5ca-a634200ce13d)<br>
• Message de confirmation d'ajout<br>
![screenshot20230914024656](https://github.com/NaimaAYYACHE/skydash/assets/105889744/72d21c65-c644-4f87-8016-61b8d261f0d2)<br>
• Modifier une catégorie<br>
![screenshot20230914023529](https://github.com/NaimaAYYACHE/skydash/assets/105889744/eafe37a4-95d3-4716-ba63-5f422da6a23b)<br>
• Message de confirmation de modification<br>
![screenshot20230914024833](https://github.com/NaimaAYYACHE/skydash/assets/105889744/353272e7-5399-4b54-98e9-7d11bea89900)<br>
• Message de confirmation de suppression<br>
![screenshot20230914025136](https://github.com/NaimaAYYACHE/skydash/assets/105889744/3085e3ec-b619-4271-a846-63857507a8b6)<br>
### Gestion des Départements :
L'interface de gestion des départements permet au responsable du stock de gérer les 
départements de l'organisation. Elle affiche la liste des départements avec la 
possibilité d'ajouter un nouveau département, de le modifier, ou de le supprimer.<br> <br>
<b>Fonctionnalités : </b>Consultation, Ajout, modification, suppression de départements.<br>
• Liste des Départements<br>
![screenshot20230914131209](https://github.com/NaimaAYYACHE/skydash/assets/105889744/99c832e6-fa33-4b35-ba41-a2e52b4a7f56)<br>
• Ajouter un Département<br>
![screenshot20230914131232](https://github.com/NaimaAYYACHE/skydash/assets/105889744/f2a0d316-93e8-4cae-84ee-f54b093ed857)<br>
• Modifier un Département<br>
![screenshot20230914131308](https://github.com/NaimaAYYACHE/skydash/assets/105889744/2e3ac3b0-2df1-427f-a9bd-cd3f4c28f464)<br>

### Gestion des Utilisateurs :
L'interface de gestion des utilisateurs permet au responsable du stock de gérer les 
utilisateurs de l'application. Elle affiche la liste des utilisateurs avec la possibilité 
d'ajouter un nouvel utilisateur en spécifiant le département et le rôle, de le modifier, 
ou de le supprimer.<br><br>
<b>Fonctionnalités :</b> Consultation, Ajout, modification, suppression d'utilisateurs, 
attribution de département et de rôle.<br>
• Liste des Utilisateurs<br>
![screenshot20230914023912](https://github.com/NaimaAYYACHE/skydash/assets/105889744/ff7faa9f-5f16-4fca-b637-bdf15c37bc74)<br>
• Ajouter un Utilisateur<br>
![screenshot20230914024055](https://github.com/NaimaAYYACHE/skydash/assets/105889744/7224cacb-52d0-4899-b9a1-788f5cd0a9e2)<br>
• Modifier un Utilisateur<br>
![screenshot20230914131344](https://github.com/NaimaAYYACHE/skydash/assets/105889744/6548f266-5724-4253-91de-a43a498c5ea7)<br>
### Gestion des Demandes :
L'interface de gestion des demandes permet au responsable du stock de consulter la 
liste des demandes, de vérifier les demandes en attente, de voir les détails des 
demandes, ou de supprimer une demande.<br><br>
<b>Fonctionnalités :</b> Consultation, vérification, détails et suppression de demandes.<br>

![screenshot20230914024151](https://github.com/NaimaAYYACHE/skydash/assets/105889744/07cdda38-79a1-407d-84e9-b52cbbb3abfb)<br>
### Gestion des Réclamations :
L'interface de gestion des réclamations permet au responsable du stock de consulter 
la liste des réclamations en cours, de voir les réclamations acceptées ou refusées, de 
voir les détails des réclamations, ou de supprimer une réclamation.<br><br>
<b>Fonctionnalités :</b> Consultation, acceptation/refus, détails et suppression de 
réclamations.<br>
![screenshot20230914024214](https://github.com/NaimaAYYACHE/skydash/assets/105889744/9e64cb9f-ed6d-4160-82e6-22fabcb480c0)<br>


