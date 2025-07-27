## 🚗 Scalable Ride Sharing Platform (Uber/Ola Clone)

A backend-focused, scalable ride-sharing system built with **Java Spring Boot**, **MongoDB**, **JWT Authentication**, and a **ReactJS frontend**.

> 💼 Designed for high-volume ride requests with role-based user access (Rider, Driver, Admin).

---

### 📌 Tech Stack

| Layer         | Technology                          |
| ------------- | ----------------------------------- |
| Frontend      | ReactJS, Axios, Tailwind            |
| Backend       | Spring Boot, Spring Security, JWT   |
| Database      | MongoDB (NoSQL)                     |
| Caching       | Redis                               |
| Auth          | JWT (Stateless Token Auth)          |
| Dev Tools     | Postman, Swagger, Docker            |

---

### 📁 Project Structure

```
rideshare-app/
│
├── backend/
│   ├── config/
│   ├── controller/
│   ├── dto/
│   ├── exception/
│   ├── model/
│   ├── repository/
│   ├── security/
│   ├── service/
│   ├── util/
│   └── application.properties
│
├── frontend/
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── .env
│
└── README.md
```

---

### ✅ Features

#### 👤 User Module

* Register/Login with JWT Token
* Role-based Access: Rider / Driver / Admin
* Password encryption using BCrypt

#### 🚕 Ride Booking

* Rider requests a ride (pickup/drop)
* Nearest driver gets assigned
* Real-time ride status: `REQUESTED → ASSIGNED → ONGOING → COMPLETED`

#### 📍 Driver Module

* Accept / Reject ride
* Update location (optionally via Redis or LocationService)

#### 🛠 Admin Dashboard (API)

* View all users, rides
* Block/unblock drivers or riders
* Manage system status

---

### 📦 API Endpoints

| Method | Endpoint                | Description                |
| ------ | ----------------------- | -------------------------- |
| POST   | `/api/auth/register`    | Register new user          |
| POST   | `/api/auth/login`       | Login & get JWT            |
| POST   | `/api/ride/request`     | Request a ride (Rider)     |
| POST   | `/api/ride/accept/{id}` | Driver accepts ride        |
| GET    | `/api/ride/status/{id}` | Get ride status            |
| GET    | `/api/admin/users`      | Get all users (Admin only) |

> 📘 Detailed API doc available via Swagger at `/swagger-ui/index.html`

---

### 🧪 Run the App

#### 🔧 Backend (Spring Boot)

```bash
cd backend
./mvnw spring-boot:run
```

#### ⚛️ Frontend (React)

```bash
cd frontend
npm install
npm start
```

---

### 🚀 Future Enhancements

* Google Maps Integration for live tracking
* In-app Wallet / Payment Gateway
* WebSocket for real-time updates
* ML-based pricing suggestions

---

### 📄 License

This project is for educational and interview prep use. Not for production without further security and scaling.
