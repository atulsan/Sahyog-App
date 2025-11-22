# Sahyog – Leftover Food Redistribution App

Sahyog is an Android application that connects event organizers with nearby people in need by sharing real-time information about leftover food and guiding users to the event location.

> ⚠️ This is an archived student project originally built around 2019–2020 as part of a B.Tech (Information Technology) mini project at MNNIT Allahabad.

---

## Demo Video

 **App Demo:** https://www.youtube.com/watch?v=UTiYvQr2FEk

---

## Overview

Food wastage and hunger co-exist in most cities: large events often have surplus food while many people nearby struggle to get a proper meal.

Sahyog attempts to bridge this gap using smartphones and location services.

The app lets **providers** (event organizers, caterers, NGOs) publish food availability events, and **users** discover nearby events and navigate to them using in-app maps and routing.

---

## Features

### For Users

- **Discover nearby food events** in a custom search radius.
- **View event details** (time, location, description, quantity, etc.).
- **Turn-by-turn navigation** from the user’s current location to the event using Mapbox Navigation.

### For Providers

- **Email/password login & sign-up** via Firebase Authentication.
- **Create and publish food events** with an integrated location picker.
- **View active users on the map** within a configurable search area.


---

## Architecture

The app is built using the classic Android architecture with multiple activities and fragments.

### Key Activities & Fragments

- **RedirectActivity** – Fetches user location (GPS/Internet) and routes to user or provider module.
- **HomepageActivity** – Shows the list of nearby events and allows filtering by distance and other parameters. Also registers users in Firebase with unique IDs.
- **DetailsActivity** – Displays full details of a selected event.
- **DirectionOnMapActivity** – Draws the route on the map from user to event using Mapbox Directions API.
- **NavigationActivity** – Provides real-time navigation using Mapbox Navigation SDK.
- **ProviderOptionsDrawerActivity** – Main landing page for providers with navigation to all provider features.
- **ProfileFragment** – Shows provider profile and the list of events created by them.
- **FoodOrganiseActivity** – Handles event creation using a location picker and multiple fragments for event details.
- **ShowOnMapActivity** – Marks active users on the map within the default/custom search area.
- **MessageAdminActivity** – Sends messages from users/providers to the admin.

### Frontend

- Layouts built with **XML** (activities, fragments, and custom views).
- Uses Android **Material Design** components and libraries like Glide for images.

### Backend & Data

- **Firebase Realtime Database** as the backend (NoSQL JSON tree).
- **Firebase Authentication** for email/password login.
- **Mapbox APIs** for:
  - Geolocation & map rendering  
  - Route calculation and navigation

---

## Tech Stack

- **Platform:** Android (tested on Android 7.0+)
- **Language:** Java
- **UI:** XML layouts
- **Backend:** Firebase Realtime Database
- **Auth:** Firebase Authentication
- **Maps & Navigation:** Mapbox Maps & Navigation SDKs
- **IDE:** Android Studio

---

## Getting Started

> ⚠️ This is an old project and may require migration (e.g., to AndroidX, updated Gradle/SDK versions, or newer Mapbox/Firebase SDKs) before it builds on current Android Studio versions.

### Prerequisites

- Android Studio
- Java JDK
- A Firebase project (Realtime Database + Authentication enabled)
- A Mapbox account & access token
