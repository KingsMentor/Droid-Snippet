**This plugin is still in alpha stage, so it might be unstable. Feel free to share your feedback and report issues!**

This plugin is in JetBrains Plugins Repository! Get it from [here](https://plugins.jetbrains.com/plugin/10198-droid-snippet).

# Droid-Snippet
![Take a look](droid_snippet_usage_demo.gif)

Live Coding Template for Android Studio. 
Speed up development time by adding access to important android utils snippet. 
Droid Snippet is currating fingertips utils needed in day to day development of android application.

Usage:

Find the **Droid Snippet** action  with `CMD+J` shortcut and type the initials of the utils you are looking for.
### Available Utils :


* ![Device Utils](ref/DeviceUtils.md)
* File Utils
* ImageUtils
* Intent Utils
* Location Utils
* Network Utils
* Permission Utils
* Screen Utils
* ServiceUtils
* Time Utils
* Utils (General Utilities like isEmpty, isSpace)

## Installation

### Online Repository
Android Studio > Preference > Plugin > Browse Repositories > Search > Droid Snippet > Install and Restart

### From Disk
[Download Droid Snippet.jar](https://github.com/KingsMentor/Droid-Snippet/blob/master/Plugin.jar?raw=true) > Android Studio > Preference > Plugin > Install plugin from disk >  find Droid Snippet . jar> select > Install and Restart

## Setting Up Project on IntelliJ

* Clone repository into local disk
* Import project
* [Download Droid Snippet Settings](https://github.com/KingsMentor/Droid-Snippet/blob/master/plugin_settings/droid_snippet_settings.jar?raw=true) 
* IntelliJ > File > Import Settings > Select droid_snippet_settings.jar > Confirm and Restart IntelliJ
* `CMD+,` to lauch Preferences Screen on Intellij
* Editor > Live Templates
* [Learn more on live template support](https://www.jetbrains.org/intellij/sdk/docs/tutorials/live_templates/template_support.html)

## Disclaimer
This is built off utils on [Android Utils Code](https://github.com/Blankj/AndroidUtilCode) . 
This is continuously a work in progress and more utils will be added based on usage and contributions. 

## Contribution
* Snippets can be suggested by adding utilsFile.java to `/snippets` on the repository or
* Contribution to [Android Utils Code](https://github.com/Blankj/AndroidUtilCode)  or 
* [Live templates](https://www.jetbrains.org/intellij/sdk/docs/tutorials/live_templates/template_support.html)

### Before sending a PR

* Naming Convention - Ensure naming convertion follwing the pattern. UtilsCategoryName_UtilsFunction (e.g networkUtils_isConnected)
* Test (Application for live template resource) - ensure it's tested and works as expected.

Adequate testing will be conducted before a PR is accepted. 

