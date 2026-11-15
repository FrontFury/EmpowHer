# 🌸 EmpowHer — Every Voice. Every Story. Every Woman.

<p align="center">
  <img src="./app/src/main/res/drawable/LOGO.png" alt="EmpowHer Logo" width="200"/>
</p>

<h3 align="center">
  Empowering Women. Protecting Lives. Building a Safer Tomorrow.
</h3>

<p align="center">
  <strong>A Women's Safety & Empowerment Ecosystem for Bangladesh</strong>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" />
  <img src="https://img.shields.io/badge/Language-Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" />
  <img src="https://img.shields.io/badge/Backend-Firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black" />
  <img src="https://img.shields.io/badge/UI-Material%203-6750A4?style=for-the-badge" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Project-EmpowHer-EC4899?style=flat-square" />
  <img src="https://img.shields.io/badge/Status-Active%20Development-22C55E?style=flat-square" />
  <img src="https://img.shields.io/badge/Made%20With-❤️%20in%20Bangladesh-EA580C?style=flat-square" />
</p>

---

## 🌷 About EmpowHer

**EmpowHer** is more than just a women's safety application — it's a digital ecosystem designed to empower women, protect their rights, preserve critical evidence, and connect survivors with trusted support networks.

Built with a vision of creating a safer Bangladesh, EmpowHer combines modern Android technology, emergency response mechanisms, secure evidence management, legal assistance, and community-driven awareness into one unified platform.

From emergency SOS alerts to confidential incident reporting, every feature is designed with one purpose:

> **Every woman deserves to feel safe, heard, protected, and empowered.**

---

## 🎯 Our Mission

- 🛡️ **Protect:** Provide accessible emergency assistance and safety tools.
- ⚖️ **Empower:** Connect women with legal aid and verified support organizations.
- 🔐 **Preserve:** Help securely manage and maintain the integrity of incident evidence.
- 🤝 **Connect:** Build a supportive community where every voice matters.
- 📢 **Educate:** Promote awareness through safety resources and survivor stories.

---

## ✨ Core Features

### 🛡️ 01. Personal Safety & Emergency Response

Designed to provide quick access to assistance when every second matters.

- 🚨 **Emergency SOS:** Triple-click activation for emergency assistance.
- 📍 **GPS Location Tagging:** Attach location information to incident reports.
- ☎️ **Emergency Hotline Bridge:** Quick access to Bangladesh Police (999) and Women Helpline (109).
- 🕵️ **Discreet Mode:** Privacy-focused interface with quick-exit functionality.
- 📳 **Shake-to-Exit:** Additional discreet navigation mechanism.

### 🚨 02. Incident Reporting & Case Management

A structured reporting system that helps users document incidents securely.

- 📝 Confidential incident reporting.
- 📍 GPS-based location tagging.
- 🔒 Protected incident descriptions.
- 👤 Anonymous reporting options.
- 📂 Categorized incident records.
- ⚖️ Case tracking and agency assignment through the admin console.

**Supported case categories:**
- Physical Assault
- Cyber Stalking
- Workplace Intimidation

### 💎 03. Secure Evidence Vault

A dedicated evidence management environment focused on data integrity and accountability.

- 📸 Image evidence management.
- 🎧 Audio evidence storage.
- 📄 PDF document management.
- 🔐 SHA-256 cryptographic hash verification.
- 🧾 Evidence audit-chain tracking.
- 🛡️ Tamper-detection-oriented evidence handling.

### 🤝 04. Legal Assistance & Support Center

Connecting users with verified emergency resources and support organizations.

**Emergency Helplines:**

| Service | Contact |
|---|---|
| National Emergency Service | 999 |
| Women & Children Helpline | 109 |

**Support Organizations:**

- [Ain o Salish Kendra (ASK)](https://www.askbd.org/)
- [Bangladesh National Woman Lawyers' Association (BNWLA)](https://bnwla-bd.org/)
- [BRAC](https://www.brac.net/)
- One-Stop Crisis Centre (OCC)

### 📢 05. Awareness & Community Stories

A community-driven space for knowledge, awareness, and empowerment.

- 📰 Safety awareness feed.
- 💬 Survivor experience sharing.
- 📚 Educational safety resources.
- 🤖 AI-assisted risk assessment indicators.
- 🛡️ Privacy-conscious content moderation.

---

## 🖥️ Admin OPS Console

### The Command Center for Safety Operations

EmpowHer includes a dedicated administrative operations dashboard designed to centralize incident monitoring, case management, evidence oversight, and emergency coordination.

| Module | Capabilities |
|---|---|
| 📟 Live Triage Desk | SOS queue monitoring, SLA tracking, field-unit status |
| 📂 Case Management | Case dossiers, categorization, agency assignment |
| 💎 Evidence Vault | SHA-256 verification, evidence records, audit tracking |
| 👥 User Management | Protected-user metrics and responder monitoring |
| 🛡️ Stories Moderation | PII detection and content moderation |
| 🛰️ Operations Desk | Operational readiness and divisional geo-alerts |

### Admin Dashboard Highlights

- Real-time emergency monitoring interface.
- Centralized incident management.
- Field responder status monitoring.
- Emergency desk triggers.
- Divisional alert broadcasting interface.
- Community safety advisory management.
- Administrative activity and audit tracking.

---

## 🛠️ Technology Stack

EmpowHer is developed using modern Android development tools and Firebase services.

| Technology | Purpose |
|---|---|
| Kotlin | Primary programming language |
| Android SDK | Native Android development |
| Material 3 | Modern UI/UX design |
| XML Layouts | Interface development |
| ViewBinding | Safe view interaction |
| Firebase Authentication | User authentication |
| Cloud Firestore | Cloud database |
| Firebase Storage | Evidence and media storage |
| Kotlin Coroutines | Asynchronous programming |
| Google Sign-In | Authentication integration |

---

## 🏗️ Application Architecture

EmpowHer follows a modular Android application structure to maintain clean code, scalability, and maintainability.

```text
EmpowHer/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/
│           │   └── com/
│           │       └── empowher/
│           │           ├── activities/
│           │           ├── fragments/
│           │           ├── adapters/
│           │           ├── models/
│           │           ├── repositories/
│           │           ├── services/
│           │           └── utils/
│           │
│           └── res/
│               ├── drawable/
│               ├── layout/
│               ├── mipmap/
│               └── values/
│
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

*Note: This is a suggested architectural overview; adjust folder names to match the actual source code.*

---

## 🗺️ Development Roadmap

We are continuously improving EmpowHer to make it more reliable, secure, and accessible.

### ✅ Completed

- [x] Google Sign-In integration.
- [x] Email and password authentication.
- [x] Role-based navigation.
- [x] Incident reporting interface.
- [x] Anonymous reporting options.
- [x] Support center and emergency helplines.
- [x] Awareness and community stories feed.
- [x] Admin OPS dashboard UI.
- [x] Case management interface.
- [x] Evidence vault interface.
- [x] SHA-256 evidence verification logic.

### 🚧 In Progress

- [ ] Firebase Firestore integration across admin modules.
- [ ] Live SOS incident synchronization.
- [ ] Real-time GPS and responder tracking.
- [ ] AI-powered PII detection and redaction.
- [ ] Biometric authentication for sensitive admin actions.
- [ ] Encrypted evidence playback.
- [ ] Complete backend integration and security testing.

### 🔮 Future Enhancements

- [ ] Multilingual support (Bangla & English).
- [ ] Advanced emergency notification system.
- [ ] Improved accessibility features.
- [ ] Offline-first emergency information.
- [ ] Expanded legal assistance network.
- [ ] Analytics and safety trend reporting.

---

## 🔐 Security & Privacy

Women's safety applications must prioritize confidentiality and responsible data handling.

EmpowHer is designed around the following security principles:

- **Privacy First:** Minimize unnecessary exposure of sensitive personal information.
- **Data Integrity:** SHA-256 hashing for evidence integrity verification.
- **Access Control:** Role-based access to application functionality.
- **Secure Authentication:** Firebase Authentication and Google Sign-In.
- **Evidence Accountability:** Audit-oriented evidence management.
- **Responsible Reporting:** Privacy-conscious incident and community reporting.

*Security note: SHA-256 hashing provides integrity verification, not encryption. Actual end-to-end encryption, secure key management, access policies, and production-grade privacy protections require separate implementation and validation.*

---

## 🎨 Brand Identity

### 🌸 Logo

<p align="center">
  <img src="./app/src/main/res/drawable/LOGO.png" alt="EmpowHer Logo" width="150"/>
</p>

### 📱 Application Icon

<p align="center">
  <img src="./app/src/main/res/drawable/AppIcon.png" alt="EmpowHer App Icon" width="110"/>
</p>

### ✨ Splash Screen

<p align="center">
  <img src="./app/src/main/res/drawable/Splash.png" alt="EmpowHer Splash Screen" width="200"/>
</p>

### Our Tagline

<h3 align="center">
  🌷 Every voice. Every story. Every woman. 🌷
</h3>

---

## 🚀 Getting Started

Follow these steps to set up EmpowHer locally.

### Prerequisites

- Android Studio
- Kotlin-compatible Android development environment
- Android SDK
- Firebase Project
- Google Services configuration

### Installation

**1. Clone the repository**

```bash
git clone https://github.com/your-username/EmpowHer.git
```

**2. Open the project**

Open the cloned project using Android Studio.

**3. Configure Firebase**

- Create a Firebase project.
- Register your Android application.
- Download `google-services.json`.
- Place it inside the `app/` directory.
- Enable the required Firebase Authentication providers.
- Configure Firestore and Firebase Storage rules.

**4. Sync Gradle**

Allow Android Studio to download the required dependencies.

**5. Run the application**

Connect an Android device or start an emulator and run the app.

---

## 🇧🇩 Why EmpowHer Matters

Women deserve more than promises of safety. They deserve accessible tools, reliable support, privacy, and a platform where their experiences are taken seriously.

EmpowHer aims to bring technology and social responsibility together by making safety resources easier to access and support systems easier to navigate.

We believe technology can become a powerful tool for positive social change when it is built with empathy, responsibility, and purpose.

---

## 👩‍💻 Development Team

**Project:** EmpowHer  
**Category:** Women's Safety & Social Empowerment  
**Platform:** Native Android Application  
**Development:** Byte Builders

Built with ❤️ in Bangladesh.

---

<p align="center">
  <img src="./app/src/main/res/drawable/LOGO.png" width="85" alt="EmpowHer"/>
</p>

<h2 align="center">🌸 EmpowHer</h2>

<h3 align="center">Every voice. Every story. Every woman.</h3>

<p align="center">
  <strong>Empowering Women. Protecting Lives. Building a Safer Tomorrow.</strong>
</p>

<p align="center">
  Made with ❤️ for a safer and stronger Bangladesh 🇧🇩
</p>
