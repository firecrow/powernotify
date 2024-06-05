# PowerNotify

This is an Android app that provides a "super" notification using ReactNative and Kotlin/Java native, to help mangage time-away from your device, as well as surface important notifications, acording to user-specified rules.

# The Concept

PowerNotify can see the notifications that are visible in the toolbar, and make sound or vibration according to specified rules. It is then possible to disable noise/vibration for the normal notifications, allowing PowerNotify to buzz you acording to the rules you've set for that app, your current location, or the current time of the day.

# The Rules

Rules can be composed of the following attributes:
    - the app the originated from
    - the contact information contained in the notification
    - the phones current geo-location
    - the current time of day
    - or what I call "snooze-oclock", make noise/vibration only on the hour every hour!

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
