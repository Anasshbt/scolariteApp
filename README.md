# 🎓 Scolarité - Gestion des Étudiants 📚

Bienvenue dans le projet **Scolarité**, une application de gestion des étudiants développée avec **Spring Boot**.

## 📖 Description

Cette application permet de gérer efficacement les informations relatives aux étudiants dans un établissement scolaire. Elle propose plusieurs fonctionnalités telles que l'ajout, la modification, la suppression et la consultation des informations des étudiants, des professeurs, des cours, etc.

## 🚀 Fonctionnalités

- 🔍 **Recherche** des étudiants par nom ou identifiant.
- 📋 **Gestion des inscriptions** des étudiants aux cours.
- 📝 **Suivi des notes** et résultats par semestre.
- 📅 **Gestion des emplois du temps** des classes.
- 👨‍🏫 **Interface administrateur** pour la gestion des professeurs et des matières.

## 🛠️ Technologies Utilisées

- **Backend** : Spring Boot 🟢
- **Frontend** : React.js ⚛️
- **Base de données** : PostgreSQL 🐘
- **Gestion des dépendances** : Maven 📦
- **Hébergement** : Aiven pour PostgreSQL et MongoDB 🌐

## 📂 Structure du projet

```bash
scolarite/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/scolarite/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── utils/
│   ├── resources/
│   │   ├── application.properties
│   └── test/
├── pom.xml
└── README.md
