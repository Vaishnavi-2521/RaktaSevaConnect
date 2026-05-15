# Rakta-Seva Connect (Healthcare)

## Android App Development using GenAI

Rakta-Seva Connect is an Android-based healthcare emergency application developed to help patients quickly connect with blood donors during medical emergencies. The application focuses on reducing the delay in finding compatible blood donors by providing real-time emergency alerts, donor availability tracking, nearby donor search, and intelligent healthcare support using GenAI technologies.

The project was developed as part of the MindMatrix VTU Internship Program under the domain of Android App Development using GenAI.

---

# Problem Statement

In many medical emergencies, finding a suitable blood donor within a short period of time becomes extremely difficult. Although hospitals and blood banks exist, the availability of replacement donors is often limited, especially in rural and emergency situations.

Traditional communication methods such as social media groups and phone calls are slow and unreliable during urgent situations. There is a need for a dedicated digital platform that can instantly notify nearby donors and improve emergency blood donation coordination.

---

# Project Objective

The main objective of Rakta-Seva Connect is to build a secure and efficient emergency blood donor management system that can:

- Connect blood donors and patients instantly
- Send emergency blood request notifications
- Track donor availability
- Help hospitals and patients find nearby donors
- Improve emergency response time
- Promote voluntary blood donation awareness

---

# Key Features

## Donor Registration
Users can register themselves as blood donors by providing:
- Name
- Blood Group
- Contact Details
- Availability Status
- Last Donation Date

---

## Emergency Blood Request System
Patients or hospitals can create emergency blood requests specifying:
- Required Blood Group
- Hospital Name
- Emergency Level
- Contact Information

---

## Nearby Donor Detection
The application uses location-based services to identify nearby donors within a selected radius for faster response.

---

## Real-Time Notifications
Firebase Cloud Messaging (FCM) is used to send instant alerts and notifications to nearby matching donors.

Example:
- “Urgent O+ blood required nearby.”

---

## Donor Availability Management
Donors can mark themselves:
- Available
- Unavailable

This helps maintain accurate donor status and prevents unnecessary notifications.

---

## GenAI Healthcare Support
The project supports GenAI integration using APIs such as:
- OpenAI API
- Gemini API

AI features can include:
- Blood donation guidance
- Emergency instructions
- Health awareness support
- Smart donor recommendation logic

---

## Secure User Management
Firebase Authentication can be integrated for:
- Login
- Signup
- OTP verification
- Secure user sessions

---

# Technology Stack

## Frontend
- Kotlin
- XML
- Android Studio

## Android Components
- Activities
- Fragments
- RecyclerView
- ViewBinding
- Navigation Components

## Backend & Database
- Firebase Authentication
- Firebase Firestore
- Firebase Realtime Database
- Room Database (SQLite)

## APIs & Services
- Google Maps API
- Google Location Services API
- Firebase Cloud Messaging (FCM)

## GenAI Technologies
- OpenAI API
- Gemini API

## Build & Version Control
- Gradle
- Git
- GitHub

---

# Project Architecture

The application follows the MVVM (Model View ViewModel) architecture pattern.

## Layers

### Model Layer
Handles:
- Database entities
- Data models
- Repository classes

### View Layer
Handles:
- XML layouts
- Activities
- Fragments
- User Interface

### ViewModel Layer
Handles:
- Business logic
- Data communication
- UI state management

---

# Project Structure

```text
RaktaSevaConnect/
│
├── app/
│   ├── src/main/
│   │   ├── java/com/mindmatrix/raktaseva/
│   │   │   ├── data/
│   │   │   ├── model/
│   │   │   ├── ui/
│   │   │   └── MainActivity.kt
│   │   │
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   ├── drawable/
│   │   │   └── values/
│   │
│   └── AndroidManifest.xml
│
├── gradle/
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

---

# Modules Included

## Authentication Module
Handles:
- User login
- User registration
- Session management

---

## Donor Management Module
Handles:
- Donor registration
- Availability tracking
- Blood group filtering

---

## Emergency Request Module
Handles:
- Emergency blood requests
- Notification triggering
- Request tracking

---

## Location Module
Handles:
- GPS location
- Nearby donor identification
- Hospital location services

---

## Notification Module
Handles:
- Emergency alerts
- Push notifications
- Request updates

---

# APIs Used

| API | Purpose |
|------|----------|
| Firebase Authentication | Login & Signup |
| Firebase Firestore | Cloud Database |
| Firebase Cloud Messaging | Push Notifications |
| Google Maps API | Maps & Navigation |
| Google Location Services API | User Location |
| OpenAI API / Gemini API | GenAI Features |

---

# Software Requirements

- Android Studio
- JDK 17 or above
- Gradle 8+
- Android SDK 34+
- Internet Connection

---

# Hardware Requirements

## Minimum
- Intel i3 Processor
- 8 GB RAM
- 20 GB Free Storage

## Recommended
- Intel i5/i7 Processor
- 16 GB RAM
- SSD Storage

---

# Installation & Setup

## Step 1: Clone Repository

```bash
git clone <repository-url>
```

---

## Step 2: Open in Android Studio

- Launch Android Studio
- Select “Open”
- Choose the project folder

---

## Step 3: Sync Gradle

Wait for Gradle synchronization to complete successfully.

---

## Step 4: Create Emulator or Connect Device

Use:
- Android Emulator
OR
- Physical Android Device

---

## Step 5: Run the Project

Click:
- Run ▶
OR
- Shift + F10

---

# Future Enhancements

- AI-based emergency prioritization
- Hospital dashboard integration
- Live donor tracking
- Multi-language support
- Voice-enabled emergency requests
- Wearable device integration
- Smart health analytics
- Cloud backup and synchronization

---

# Advantages of the System

- Faster emergency response
- Real-time donor communication
- Improved healthcare coordination
- Secure donor management
- User-friendly interface
- Scalable architecture
- AI-enabled healthcare support

---

# Limitations

- Requires internet connection
- Depends on donor availability
- GPS accuracy may vary
- Notification delivery depends on network quality

---

# Use Cases

- Emergency blood donation
- Hospital donor management
- Voluntary blood donation campaigns
- Healthcare awareness initiatives

---

# Impact of the Project

Rakta-Seva Connect aims to improve emergency healthcare support by reducing delays in blood donor communication and increasing awareness about voluntary blood donation. The project contributes toward building a digitally connected healthcare support ecosystem.

---

# Contributors

- Vaishnavi
- MindMatrix VTU Internship Program

---

# License

This project is developed for educational and academic purposes under the VTU Internship Program.

---

# Conclusion

Rakta-Seva Connect is a modern Android healthcare application designed to simplify and accelerate the blood donation process during emergencies. By integrating Android development technologies, cloud services, location-based systems, and GenAI capabilities, the project demonstrates how technology can be used to improve healthcare accessibility and save lives.
