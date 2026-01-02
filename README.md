# complaint-management-system
# 🏛️ Civic Hub - Complaint Management System

A comprehensive full-stack web application for managing citizen complaints with real-time notifications and administrative oversight.

## 🌟 Features

### 👥 Multi-Role System
- **Citizens**: Submit and track complaints with photo uploads
- **Officers**: Manage assigned complaints and update status
- **Admins**: Complete oversight with analytics and user management

### 🔧 Technical Features
- **Real-time Notifications**: WebSocket integration for instant updates
- **Interactive Maps**: Leaflet integration for location-based complaints
- **File Upload**: Image attachments for complaints
- **Email Notifications**: Automated status updates
- **JWT Authentication**: Secure role-based access
- **Responsive Design**: Material-UI + Tailwind CSS

## 🛠️ Tech Stack

### Frontend
- **React 19** with Vite
- **Material-UI (MUI)** for components
- **Tailwind CSS** for styling
- **Redux Toolkit** for state management
- **React Leaflet** for maps
- **Recharts & MUI X-Charts** for analytics
- **Axios** for API calls
- **StompJS** for WebSocket

### Backend
- **Spring Boot 3.5.7**
- **Spring Security** with JWT
- **Spring Data JPA** with Hibernate
- **MySQL** (production) / **H2** (development)
- **WebSocket** for real-time communication
- **Spring Mail** for email notifications

## 🚀 Getting Started

### Prerequisites
- **Java 17+**
- **Node.js 18+**
- **MySQL** (optional, H2 included for development)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/YOUR_USERNAME/complaint-management-system.git
   cd complaint-management-system
   ```

2. **Setup Backend**
   ```bash
   cd backend
   ./mvnw spring-boot:run
   ```
   Backend will run on: http://localhost:8081

3. **Setup Frontend**
   ```bash
   cd frontend
   npm install
   npm run dev
   ```
   Frontend will run on: http://localhost:5173

### Database Configuration
- **Development**: H2 database (no setup required)
- **Production**: Update `application.properties` with MySQL credentials

## 📱 Application Screenshots

### Citizen Dashboard
![Citizen Dashboard](docs/screenshots/citizen-dashboard.png)

### Admin Analytics
![Admin Analytics](docs/screenshots/admin-analytics.png)

### Officer Workload
![Officer Panel](docs/screenshots/officer-panel.png)

## 🔗 API Endpoints

### Authentication
- `POST /api/auth/login` - User login
- `POST /api/auth/register` - User registration

### Complaints
- `GET /api/complaints` - Get all complaints
- `POST /api/complaints` - Create new complaint
- `PUT /api/complaints/{id}` - Update complaint status

### Admin
- `GET /api/admin/analytics` - Get system analytics
- `GET /api/admin/users` - Manage users

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Your Name**
- GitHub: [@your-username](https://github.com/your-username)
- LinkedIn: [Your LinkedIn](https://linkedin.com/in/your-profile)

## 🙏 Acknowledgments

- Spring Boot community for excellent documentation
- Material-UI team for beautiful components
- React team for the amazing framework