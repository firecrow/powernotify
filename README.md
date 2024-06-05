# PowerNotify

This is an Android app using ReactNative and Kotlin native code to provide a "super" notification, to help mangage time-away from your device, as well as surface important notifications.

# The Concept

PowerNotify can see the notifications that are visible in the toolbar, and make sound or vibration according to specified rules. It is then possible to disable this for the normal notifications, and manage when the get your attention through PowerNotify.

# The Rules

When a notification is added to the list shown in the "super" notification, it can generate noise/vibration only for certain recipients, or when you are in certain geo-locations, or during certain times. This lets you only be bothered by social media when you are not a the office. Alerted to work when you are in the office. Or only get your attention on the hour, every hour, allowing you to take much needed "head space" without getting interrupted while you are on a date.

# Code Organization

- android: source code for native android code (Kotlin/Java)
    - android/app/src/main/java/com/firecrow/supernotify/
        - AppListModule.kt: module compatability with react-native from native android code
        - Fetcher.java: fetches list of AplicationInfo objects for apps and their configuration for notifications
        - Receiver.java: routes incoming notifications into the PowerNotify super notification
        - Service.java: background service for registering the Receiver and using IntenFilters to catalogue notifications
- app: layout and user-interface JavaScript code for layout and behaviour
- components: React components and user-interface design system
- hooks: core JavaScript code for mapping data and events

# Status

This project is in early development, with a number of features and components expected to come over from [Windmill](https://github.com/firecrow/windmill) and [Malachite](https://github.com/firecrow/malachite) over time.
