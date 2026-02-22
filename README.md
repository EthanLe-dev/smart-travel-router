# 🌍 Smart Eco-Routing API (TravelTech)

A smart travel routing backend system designed to tackle overtourism. The system dynamically redirects tourists from overcrowded hotspots to hidden local gems, ensuring a sustainable travel experience while boosting local businesses.

---

## 🚀 Key Features

* **Smart Routing System:** Monitors real-time crowd capacity at tourist hotspots.
* **Dynamic Redirection:** Automatically suggests alternative local experiences (Hidden Gems) when a primary location reaches maximum capacity.
* **Local Business Integration:** Distributes promotional vouchers to tourists who accept redirected routes.
* **Role-Based Access Control:** Differentiates permissions for Tourists, Local Partners, and System Admins.

---

## 🛠️ Tech Stack

* **Language:** Java 17
* **Framework:** Spring Boot 4.0.3 (RESTful API)
* **Database:** MySQL 8+
* **ORM:** Spring Data JPA / Hibernate
* **Tools:** Maven, Lombok, Jakarta Validation

---

## 🗄️ Database Architecture

The system is built upon a relational database consisting of 4 core modules: Identity, Catalog, Routing, and Monetization.

*(Note: Add your ERD image from dbdiagram.io here by replacing the link below)*
`![Database ERD](link-to-your-image.png)`

---

## ⚙️ Getting Started

Follow these instructions to get a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

* Java Development Kit (JDK) 17 or higher
* MySQL Server (running on port 3306)
* Maven

### Installation

1. Clone the repository
   ```bash
   git clone [https://github.com/your-username/smart-travel-router.git](https://github.com/your-username/smart-travel-router.git)