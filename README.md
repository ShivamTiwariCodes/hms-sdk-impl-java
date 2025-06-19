# HMS SDK Implementation - Java

The **HMS SDK Implementation (`hms-sdk-impl-java`)** is the concrete Java module that implements all abstract contracts defined in the [`hms-core-sdk-java`](../hms-core-sdk-java/) module. This layer contains hospital-specific logic, configurations, and service handlers tailored for a particular hospital integration.

---

## 🚀 Purpose

- Implements interfaces from the core SDK (`hms-core-sdk-java`)
- Configures hospital-specific business rules and logic
- Dynamically loaded by Temporal worker or runtime via JAR
- Easily replaceable or extendable per hospital/tenant

---

## ⚙️ Project Setup

- **Java Version:** 17
- **Build Tool:** Gradle
- **Depends on:** `hms-core-sdk-java` via `lib/` directory or project reference

---

## 📦 Directory Structure

```bash
hms-sdk-impl-java/
├── lib/                       # Contains external SDK JARs (e.g., hms-core-sdk.jar)
├── src/
│   └── main/
│       ├── java/
│       │   └── com/hms/custom/impl/
│       │       ├── HmsWorkflowImpl.java
│       │       └── CustomActivityImpl.java
│       └── resources/
├── build.gradle
└── README.md

```

🔗 Dependencies

Make sure hms-core-sdk.jar is available in the lib/ directory. Gradle loads it as:

## 🛠 Build & Install

```bash
# Build the JAR
./gradlew build

# Copy to external folder (optional)
./gradlew copyJarToOpt